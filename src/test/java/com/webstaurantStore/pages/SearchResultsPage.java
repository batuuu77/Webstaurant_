package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {

    public SearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@data-testid='itemDescription']")
    public List<WebElement> allSearchResults;

    @FindBy(xpath = "(//input[@name='addToCartButton'])[59]")
    public WebElement addToCartLastItem;

    @FindBy(xpath = "//a[@class='btn btn-small btn-primary']")
    public WebElement viewCartButton;
}
