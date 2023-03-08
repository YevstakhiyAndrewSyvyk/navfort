package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage_ROA {

    public QuickLaunchpadPage_ROA(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement marketingDropDown;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[15]")
    public WebElement campaignMenu;


}