package com.navfort.step_definitions;

import com.navfort.pages.CalendarEventsPage_Marta;
import com.navfort.pages.QuickLaunchpad_Marta;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class US09_StepDefinitions {

    QuickLaunchpad_Marta quickLaunchpad_marta = new QuickLaunchpad_Marta();
    CalendarEventsPage_Marta calendarEventsPage_marta = new CalendarEventsPage_Marta();
    @Given("the user on the Create Activities page MH")
    public void the_user_on_the_create_activities_page_mh() {

        BrowserUtils.sleep(5);
        BrowserUtils.waitForPageToLoad( 5);
        BrowserUtils.waitForClickablility(quickLaunchpad_marta.activitiesMenu, 5);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(quickLaunchpad_marta.activitiesMenu).perform();
        quickLaunchpad_marta.Calendar_Events.click();

    }
    @Then("user click Create Event button MH")
    public void user_click_create_event_button_mh() {

        BrowserUtils.waitForPageToLoad( 5);
        BrowserUtils.waitForClickablility(calendarEventsPage_marta.create_event_button, 5);
        calendarEventsPage_marta.create_event_button.click();

    }
    @Then("user click repeat checkbox MH")
    public void user_click_repeat_checkbox_mh() {

        calendarEventsPage_marta.repeat_checkbox.click();
    }

    @Then("user input invalid integer numbers in repeat every box MH")
    public void user_input_invalid_integer_numbers_in_repeat_every_box_mh() {

        calendarEventsPage_marta.repeat_every_box.sendKeys("00");
        calendarEventsPage_marta.space.click();

    }


    @Then("the user sees given error message MH")
    public void the_user_sees_given_error_message_mh() {

        String actualMsg = calendarEventsPage_marta.error_message.getText();
        String expectedMsg = "The value have not to be more than 99.";
        System.out.println(actualMsg);

        Assert.assertEquals(expectedMsg, actualMsg);
    }


    @And("user input {int} integer number in repeat every box MH")
    public void userInputIntegerNumberInRepeatEveryBoxMH(int arg0) {

        calendarEventsPage_marta.repeat_every_box.clear();
        calendarEventsPage_marta.repeat_every_box.sendKeys("0");
        calendarEventsPage_marta.space.click();

    }

    @Then("the user sees given error message for less number MH")
    public void theUserSeesGivenErrorMessageForLessNumberMH() {
        String actualMsg = calendarEventsPage_marta.error_message.getText();
        String expectedMsg = "The value have not to be less than 1.";
        System.out.println(actualMsg);

        Assert.assertEquals(expectedMsg, actualMsg);
    }
}


