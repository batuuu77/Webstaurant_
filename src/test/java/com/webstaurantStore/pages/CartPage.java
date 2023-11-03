package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[normalize-space()='Empty Cart']")
    public WebElement emptyCartButton;

    @FindBy(xpath = "//button[contains(text(),'Empty Cart')]")
    public WebElement emptyCartConfirmationButton;

    @FindBy(xpath = "//div[@class='empty-cart__text']")
    public WebElement yourCart_Is_Empty;
}
