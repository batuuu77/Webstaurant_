package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[normalize-space()='Empty Cart']")
    public WebElement emptyCartButton;

    @FindBy(xpath = "(//button[contains(text(),'Empty')])[2]")
    public WebElement emptyCartConfirmationButton;

    @FindBy(xpath = "//div[@class='empty-cart__text']")
    public WebElement yourCart_Is_Empty;

    public void emptyCart(){
        emptyCartButton.click();
        emptyCartConfirmationButton.click();
    }
    public void verifyCartIsEmpty(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(yourCart_Is_Empty));
        Assert.assertTrue(yourCart_Is_Empty.isDisplayed());
    }
}
