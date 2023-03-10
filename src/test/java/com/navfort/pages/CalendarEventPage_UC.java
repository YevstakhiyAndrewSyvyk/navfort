package com.navfort.pages;

import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage_UC extends QuickLaunchpadPage{

    public CalendarEventPage_UC() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalenderEventNew;


    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement descriptionInputBox;



}
