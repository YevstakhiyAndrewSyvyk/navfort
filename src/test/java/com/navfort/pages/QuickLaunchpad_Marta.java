package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpad_Marta {

    public QuickLaunchpad_Marta(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), ' Activities')]")
    public WebElement activitiesMenu;

    @FindBy(xpath = "//span[contains(text(), 'Calendar Events')]")
    public WebElement Calendar_Events;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesMenu_driver;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement calendarEvents_driver;








}
