package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@id='searchval'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@value='Search'])[1]")
    public WebElement searchButton;

    public void itemSearchHandler(String itemName){
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(itemName);
        searchButton.click();
    }
}
