package com.navfort.pages;

import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage_UC {



        public QuickLaunchpadPage_UC() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

    public void clickMainMenu(String mainMenu) {//argument accept: Fleet, Customers, Activities, System
        //span[@class='title title-level-1'][normalize-space()='Activities']

        String dynamic_locator = "//span[@class='title title-level-1'][normalize-space()='" + mainMenu + "']";
        WebElement target_mainMenu = Driver.getDriver().findElement(By.xpath(dynamic_locator));
        BrowserUtils.sleep(3);
        target_mainMenu.click();


    }


    public void clickSubMenu(String subMenu) {
        //you can pass argument:
        // Fleet subMenu:   Vehicles / Vehicle Odometer / Vehicle Costs / Vehicle Contracts / Vehicle Fuel Logs / Vehicle Services Logs / Vehicle Model
        // Customer subMenu:    Contacts
        // Activities subMenu: Calendar Events
        // System subMenu:  Jobs / Menus    / System Calendars

        String dynamic_locator = "//span[@class='title title-level-2'][normalize-space()='"+subMenu+"']";
        BrowserUtils.clickElement(By.xpath(dynamic_locator));

    }
}
