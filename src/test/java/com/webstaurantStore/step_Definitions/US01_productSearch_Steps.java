package com.webstaurantStore.step_Definitions;

import com.webstaurantStore.pages.CartPage;
import com.webstaurantStore.pages.HomePage;
import com.webstaurantStore.pages.SearchResultsPage;
import com.webstaurantStore.utilities.ConfigurationReader;
import com.webstaurantStore.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.webstaurantStore.pages.SearchResultsPage.LastItem;

public class US01_productSearch_Steps {
    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    CartPage cartPage = new CartPage();

    @Given("User is  on the {string} website")
    public void user_is_on_the_website(String webStaurantStoreUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(webStaurantStoreUrl));
    }
    @When("User searches for {string}")
    public void user_searches_for(String itemName) {
        homePage.itemSearchHandler(itemName);
    }
    @Then("User checks that every product in the search result has the word {string} in its title")
    public void user_checks_that_every_product_in_the_search_result_has_the_word_in_its_title(String keywordToCheck) {
        searchResultsPage.verifyAllSearchResults(keywordToCheck);
    }
    @Then("User adds the last found item to the Cart")
    public void user_adds_the_last_found_item_to_the_cart() {
        LastItem.click();
    }
    @Then("User navigates to chart by clicking View Cart button")
    public void user_navigates_to_chart_by_clicking_view_cart_button() {
        searchResultsPage.viewCartButton.click();
    }
    @Then("User clicks empty cart button")
    public void user_clicks_empty_cart_button() {
        cartPage.emptyCart();
    }
    @Then("Verify there is no items in the cart")
    public void verify_there_is_no_items_in_the_cart() {
        cartPage.verifyCartIsEmpty();
    }

}
