package com.navfort.step_definitions;


import com.navfort.pages.QuickLaunchpadPage_AS;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.navfort.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class US02_StepDefinitions {
    QuickLaunchpadPage_AS quickLaunchpadPage_as = new QuickLaunchpadPage_AS();
    @When("the user clicks on a Get Help Button AS")
    public void the_user_clicks_on_a_get_help_button_as() {
        BrowserUtils.waitForPageToLoad(5);
        quickLaunchpadPage_as.GetHelpButton.click();
    }
    @Then("the user reaches the Oroinc page")
    public void the_user_reaches_the_oroinc_page() {
        BrowserUtils.waitForPageToLoad(5);
        ArrayList<String> WindHandle = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(WindHandle.get(1));
        BrowserUtils.waitForPageToLoad(5);
        String ExpectedTitle = "https://doc.oroinc.com/";
        String ActualTitle = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
}
