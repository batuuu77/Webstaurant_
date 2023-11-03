package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {

    public SearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@data-testid='itemDescription']")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//a[@class='btn btn-small btn-primary']")
    public WebElement viewCartButton;

     public static WebElement LastItem;

    /**
     * This method provides a dynamic locator for the 'lastItem' WebElement,
     * which will be used in the next step. It also checks whether all search results
     * on the page contain a given string.
     *
     * For the dynamic locator, it first checks if there is any item out of stock in
     * the search results. If there are such items, it collects them in a list and
     * assigns the size value to an integer variable. In the next step, it determines
     * the size of the previously located 'searchResults' list of web element
     * objects and calculates the difference between the two sizes. This is because if
     * there are out-of-stock items, there won't be an "add to cart" button for those
     * items. The code then incorporates this difference into the XPath locator, using
     * it as an index number. As a result, no matter how many out-of-stock items there
     * are, the code will work without errors.
     */
    public void verifyAllSearchResults(String keywordToCheck){
        List<WebElement> listOfoutOfStock = Driver.getDriver().findElements(By.xpath("//p[contains(text(),'Out of Stock')]"));
        if (!listOfoutOfStock.isEmpty()){
            int sizeOfOutOfStocks = listOfoutOfStock.size();
            String indexNumbertoAddLocator = String.valueOf(searchResults.size() - sizeOfOutOfStocks);
            LastItem = Driver.getDriver().findElement(By.xpath("(//input[@name='addToCartButton'])[ " + indexNumbertoAddLocator + "]"));
        }
            else {
            LastItem = Driver.getDriver().findElement(By.xpath("(//input[@name='addToCartButton'])[60]"));
        }

        for (WebElement each : searchResults) {
            Assert.assertTrue(each.getText().contains(keywordToCheck));
        }
    }
}
