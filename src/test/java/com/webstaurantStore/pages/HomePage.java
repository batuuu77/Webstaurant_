package com.webstaurantStore.pages;

import com.webstaurantStore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@id='searchval'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@value='Search'])[1]")
    public WebElement searchButton;


}
