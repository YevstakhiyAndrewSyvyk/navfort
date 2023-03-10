package com.navfort.step_definitions;

import com.navfort.pages.CalendarEventPage_UC;
import com.navfort.pages.QuickLaunchpadPage_UC;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US10_StepDefinitions {
CalendarEventPage_UC calendarEventPage_uc = new CalendarEventPage_UC();
    QuickLaunchpadPage_UC quickLaunchpadPageUC = new QuickLaunchpadPage_UC();
/*
    @Then("user clicks {string} main menu and sub menu {string}   MY")
    public void userClicksMainMenuAndSubUC(String mainMenu, String subMenu) {
        quickLaunchpadPageUC.clickMainMenu(mainMenu);
        quickLaunchpadPageUC.clickSubMenu(subMenu);
    }

*/


        //BrowserUtils.sleep(3);
        //calendarEventPage_uc.createCalenderEventNew.click();


    @And("user writes {string} in Description UC")
    public void user_writes_in_description_uc(String inputValue) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.tagName("iframe")));//iframe id is dynamic
        calendarEventPage_uc.descriptionInputBox.sendKeys(inputValue);
    }


    @And("user see the message {string} in the input box")
    public void userSeeTheMessageInTheInputBox(String expectedMsg) {
        Assert.assertEquals(expectedMsg, calendarEventPage_uc.descriptionInputBox.getText());
    }



}
