package com.navfort.step_definitions;

import com.navfort.pages.VehicleCostPage_SY;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US13_StepDefinitions_SY {

    VehicleCostPage_SY vehicleCostPageSy = new VehicleCostPage_SY();
    Actions actions = new Actions(Driver.getDriver());
    //QuickLaunchPage_As_Driver_SY quickLaunchPageAsDriverSy = new QuickLaunchPage_As_Driver_SY();
    LoginPage_StepDefinitions loginPageStepDefinitions = new LoginPage_StepDefinitions();

    @When("the user click on Vehicle Cost option under the Fleet tab as driver")
    public void theUserClickOnVehicleCostOptionUnderTheFleetTabAsDriver() {
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(vehicleCostPageSy.driverFleetTab, 5);
        actions.moveToElement(vehicleCostPageSy.driverFleetTab).perform();
        vehicleCostPageSy.driverFleetTab.click();
        actions.moveToElement(vehicleCostPageSy.driverFleetTab).perform();
        vehicleCostPageSy.vehicleCost.click();

    }

    @When("the user click on Vehicle Cost option under the Fleet tab")
    public void the_user_click_on_vehicle_cost_option_under_the_fleet_tab() {
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(vehicleCostPageSy.fleetDropdown, 5);
        actions.moveToElement(vehicleCostPageSy.fleetDropdown).perform();
        vehicleCostPageSy.vehicleCost.click();

    }
    @Then("user sees three expected columns")
    public void user_sees_three_expected_columns() {

        String expectedColumn1 = "TYPE";
        String expectedColumn2 = "TOTAL PRICE";
        String expectedColumn3 = "DATE";
        String actualColumn = vehicleCostPageSy.typeColumn.getText();
        String actualColumn2= vehicleCostPageSy.totalPriceColumn.getText();
        String actualColumn3=vehicleCostPageSy.dateColumn.getText();

        Assert.assertEquals(expectedColumn1,actualColumn);
        Assert.assertEquals(expectedColumn2,actualColumn2);
        Assert.assertEquals(expectedColumn3,actualColumn3);

    }
    @When("the user click on the first checkbox")
    public void the_user_click_on_the_first_checkbox() {

        vehicleCostPageSy.firstcheckBox.click();

    }
    @Then("the user sees all other checkboxes are selected")
    public void the_user_sees_all_other_checkboxes_are_selected() {

        for (WebElement otherCheckBox : vehicleCostPageSy.otherCheckBoxes) {
            Assert.assertTrue(otherCheckBox.isSelected());
            }
        }
    }


