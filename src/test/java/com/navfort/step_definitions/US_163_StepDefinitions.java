package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.pages.VehiclesPage;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.navfort.utilities.BrowserUtils;

import java.util.List;

public class US_163_StepDefinitions {

    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("the user is on the vehicle page AS")
    public void the_user_is_on_the_vehicle_page_as() {
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(quickLaunchpadPage.FleetDropdown, 5);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(quickLaunchpadPage.FleetDropdown).perform();
        quickLaunchpadPage.VehiclesPageLink.click();
    }

    @When("user sees all the checkboxes in the table AS")
    public void user_sees_all_the_checkboxes_in_the_table() {
        BrowserUtils.waitForPageToLoad(5);
        List<WebElement> checkboxesAS = Driver.getDriver().findElements(By.xpath("//*[@data-role='select-row-cell']"));

    }

    @Then("user verifies that all of them are unchecked AS")
    public void user_verifies_that_all_of_them_are_unchecked() {

        List<WebElement> checkboxesAS = Driver.getDriver().findElements(By.xpath("//*[@data-role='select-row-cell']"));


        boolean isUncheckedAS = false;

        for (int i = 0; i < checkboxesAS.size() - 1; i++) {
            if (checkboxesAS.get(i).isSelected()) {
                break;
            } else isUncheckedAS = true;
        }

        Assert.assertTrue(isUncheckedAS);

    }

    @When("user checks the first checkbox to check all cars AS")
    public void userChecksTheFirstCheckboxToCheckAllCars() {

        vehiclesPage.MainCheckboxAS.click();

    }


    @Then("user verifies that all checkboxes for all cars are checked AS")
    public void userVerifiesThatAllCheckboxesForAllCarsAreChecked() {

        List<WebElement> checkboxesAS = Driver.getDriver().findElements(By.xpath("//*[@data-role='select-row-cell']"));


        boolean checked = false;

        for (int i = 0; i < checkboxesAS.size() - 1; i++) {
            if (checkboxesAS.get(i).isSelected()) {
                checked = true;
            }

            Assert.assertTrue(checked);
        }
    }

    @When("user checks any vehicle AS")
    public void userChecksAnyVehicleAS() {
        List<WebElement> checkboxesAS = Driver.getDriver().findElements(By.xpath("//*[@data-role='select-row-cell']"));
        for (int i = 0; i < checkboxesAS.size() - 1; i++) {
            checkboxesAS.get(i).click();
        }

    }

    @Then("all of the selected vehicles are selected")
    public void allOfTheSelectedVehiclesAreSelected() {
        List<WebElement> checkboxesAS = Driver.getDriver().findElements(By.xpath("//*[@data-role='select-row-cell']"));

        boolean eachVehicleChecked = false;

        for (int i = 0; i < checkboxesAS.size() - 1; i++) {

            if (checkboxesAS.get(i).isSelected()){
                eachVehicleChecked = true;
            }
        }
        Assert.assertTrue(eachVehicleChecked);
    }
}
