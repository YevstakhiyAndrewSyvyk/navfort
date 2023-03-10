package com.navfort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage_Marta extends QuickLaunchpad_Marta{
    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement create_event_button;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeat_checkbox;

    @FindBy(xpath = "//span[contains(text(), 'The value have not to be ')]")
    public WebElement error_message;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement repeat_every_box;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement space;



}
