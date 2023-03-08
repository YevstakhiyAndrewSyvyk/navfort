package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageStoreManager_SB {

    public MainPageStoreManager_SB() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
//    public WebElement fleetLink;
//
//    @FindBy(xpath = "//span[text()='Vehicle Contracts']")
//    public WebElement vehicleContracts;

    @FindBy(xpath = "//span[text()[normalize-space()='Fleet']]")
    public WebElement fleetLink;

    @FindBy(xpath = "//span[text()='Vehicle Contracts']")
    public WebElement vehicleContracts;


}
