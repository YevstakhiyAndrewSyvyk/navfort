package com.navfort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage_MY extends QuickLaunchpadPage_MY {

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalenderEvent_btn;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeat_checkbox;
    @FindBy(xpath = "//label[@class='fields-row']/input[3]")
    public WebElement repeatEveryDay_input;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement errorMsg_repeatDayValue;
}
