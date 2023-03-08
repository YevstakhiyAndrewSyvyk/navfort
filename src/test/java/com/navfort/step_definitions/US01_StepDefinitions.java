package com.navfort.step_definitions;

import com.navfort.pages.QuickLaunchpadPage_AM;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US01_StepDefinitions {

    QuickLaunchpadPage_AM basePage = new QuickLaunchpadPage_AM();

    @Then("user see all the eight modules")
    public void user_see_all_the_eight_modules() {
        List<String> allActualModulesText = new ArrayList<>();
        List<String> expectedAllModule = new ArrayList<>();
        expectedAllModule.addAll(Arrays.asList("Dashboards","Fleet","Customers","Sales","Activities","Marketing","Reports & Segments","System"));

        for (WebElement eachModule : basePage.allModuleButtonStoreAndSalesManager) {
            allActualModulesText.add(eachModule.getText());
        }
        Assert.assertEquals(expectedAllModule,allActualModulesText);

        Assert.assertTrue(basePage.dashboardButton.isDisplayed());
        Assert.assertTrue(basePage.fleetButton.isDisplayed());
        Assert.assertTrue(basePage.customerButton.isDisplayed());
        Assert.assertTrue(basePage.salesButton.isDisplayed());
        Assert.assertTrue(basePage.activitiesButton.isDisplayed());
        Assert.assertTrue(basePage.marketingButton.isDisplayed());
        Assert.assertTrue(basePage.report_SegmentButton.isDisplayed());
        Assert.assertTrue(basePage.systemButton.isDisplayed());

    }

    @Then("user should access all the eight modules")
    public void userShouldAccessAllTheEightModules() {
        Assert.assertTrue(basePage.dashboardButton.isEnabled());
        Assert.assertTrue(basePage.fleetButton.isEnabled());
        Assert.assertTrue(basePage.customerButton.isEnabled());
        Assert.assertTrue(basePage.salesButton.isEnabled());
        Assert.assertTrue(basePage.activitiesButton.isEnabled());
        Assert.assertTrue(basePage.marketingButton.isEnabled());
        Assert.assertTrue(basePage.report_SegmentButton.isEnabled());
        Assert.assertTrue(basePage.systemButton.isEnabled());

    }

    @Then("user should see the four modules")
    public void userSeeTheFourModules() {
        Assert.assertTrue(basePage.fleetButtonDriver.isDisplayed());
        Assert.assertTrue(basePage.customerButtonDriver.isDisplayed());
        Assert.assertTrue(basePage.activitiesButtonDriver.isDisplayed());
        Assert.assertTrue(basePage.systemButtonDriver.isDisplayed());

        List<String> allActualModulesText = new ArrayList<>();
        List<String> expectedAllModule = new ArrayList<>();
        expectedAllModule.addAll(Arrays.asList("Fleet","Customers","Activities","System"));

        for (WebElement eachModule : basePage.allModuleButtonStoreAndSalesManager) {
            allActualModulesText.add(eachModule.getText());
        }
        Assert.assertEquals(expectedAllModule,allActualModulesText);

    }

    @Then("user should access the four modules")
    public void userShouldAccessTheFourModules() {
        Assert.assertTrue(basePage.fleetButtonDriver.isEnabled());
        Assert.assertTrue(basePage.customerButtonDriver.isEnabled());
        Assert.assertTrue(basePage.activitiesButtonDriver.isEnabled());
        Assert.assertTrue(basePage.systemButtonDriver.isEnabled());
    }
}
