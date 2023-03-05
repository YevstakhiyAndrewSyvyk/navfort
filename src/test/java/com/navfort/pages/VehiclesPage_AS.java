package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage_AS extends QuickLaunchpadPage {
    public VehiclesPage_AS(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@type='checkbox']")
    public WebElement TableCheckboxesAS;

    @FindBy (xpath = "//*[@data-select]")
    public WebElement MainCheckboxAS;
}
