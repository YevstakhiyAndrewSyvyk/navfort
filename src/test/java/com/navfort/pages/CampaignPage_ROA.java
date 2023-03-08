package com.navfort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignPage_ROA extends QuickLaunchpadPage_ROA{


    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersAddFilterButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement btn_filter;


    @FindBy(xpath = "//input[@name='multiselect_0']")
    public List<WebElement> filters;



}
