package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuickLaunchpadPage {
    public QuickLaunchpadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "oro-subtitle")
    public WebElement pageHeader;

    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public List<WebElement> main_menu;

    @FindBy(xpath = "//a[@href='javascript: void(0);']")
    public WebElement txt_username_profile;
    @FindBy(linkText = "Logout")
    public WebElement Logout;




}
