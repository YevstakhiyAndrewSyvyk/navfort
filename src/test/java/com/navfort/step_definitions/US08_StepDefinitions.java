package com.navfort.step_definitions;
import com.navfort.pages.CalendarEventsPage_MY;
import com.navfort.pages.QuickLaunchpadPage_MY;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US08_StepDefinitions {
    QuickLaunchpadPage_MY quickLaunchpadPageMy = new QuickLaunchpadPage_MY();
    CalendarEventsPage_MY calendarEventsPageMy = new CalendarEventsPage_MY();


    @Then("user clicks {string} main menu and sub menu {string}   MY")
    public void userClicksMainMenuAndSubMenuMY(String mainMenu, String subMenu) {

        quickLaunchpadPageMy.clickMainMenu(mainMenu);
        quickLaunchpadPageMy.clickSubMenu(subMenu);
    }


    @Then("user clicks create calendar event MY")
    public void user_clicks_create_calendar_event_my() {
        BrowserUtils.sleep(3);
        calendarEventsPageMy.createCalenderEvent_btn.click();


    }

    @Then("user clicks Repeat checkbox")
    public void user_clicks_repeat_checkbox() {
        BrowserUtils.waitForClickablility(calendarEventsPageMy.repeat_checkbox, 1);
        calendarEventsPageMy.repeat_checkbox.click();

    }


    @And("user sees Repeat Every day input default value is {string}")
    public void userSeesRepeatEveryDayInputDefaultValueIs(String expectedValue) {
        String actualValue = calendarEventsPageMy.repeatEveryDay_input.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @And("user clears the repeat day MY")
    public void userClearsTheRepeatDay() {

        calendarEventsPageMy.repeatEveryDay_input.clear();
        BrowserUtils.sleep(1);
    }

    @And("user sees the error message {string} MY")
    public void userSeesTheErrorMessage(String errorMsg) {
        Assert.assertEquals(errorMsg, calendarEventsPageMy.errorMsg_repeatDayValue.getText());


    }
}
