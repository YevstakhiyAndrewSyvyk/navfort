package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage_AM {

    public QuickLaunchpadPage_AM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement dashboardButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customerButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement salesButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement activitiesButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement marketingButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[7]")
    public WebElement report_SegmentButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[8]")
    public WebElement systemButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButtonDriver;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement customerButtonDriver;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesButtonDriver;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement systemButtonDriver;

}
