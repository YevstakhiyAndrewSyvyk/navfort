package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.QuickLaunchpadPage;
import com.navfort.pages.VehicleModelsPage_OT;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US161_StepDefs {
    LoginPage loginPage=new LoginPage();

    VehicleModelsPage_OT vehicleModelsPage=new VehicleModelsPage_OT();




    @When("the user hover {string} menu OT")
    public void the_user_hover_menu_OT(String fleetMenu) {
        BrowserUtils.sleep(5);
        for (WebElement each : vehicleModelsPage.main_menu) {
            if (each.getText().equals(fleetMenu)) {
                each.click();

            }

        }
        BrowserUtils.sleep(5);
    }

        @When("the user selects Vehicles Model option OT")
        public void the_user_selects_vehicles_model_option_OT() {
            Actions actions=new Actions(Driver.getDriver());
            actions.moveToElement(vehicleModelsPage.vehiclesModelOption).click().perform();
           BrowserUtils.sleep(5);
        }



    @Then("the user sees the error message {string} OT")
    public void the_user_sees_the_error_message_OT(String expectedErrorText) {
        Assert.assertTrue(vehicleModelsPage.message_txt.getText().equals(expectedErrorText));

    }




    @Then("the user can see expected columns name in the web-table OT")
    public void the_user_can_see_in_the_web_table_OT(List <String> expectedColumns) {
        System.out.println("expectedColumns = " + expectedColumns);
        List<String> actualColumns= VehicleModelsPage_OT.getElementsText(vehicleModelsPage.columnsName);
        System.out.println("actualColumns = " + actualColumns);
        int num=actualColumns.size();
        System.out.println("num = " + num);


        Assert.assertTrue(actualColumns.equals(expectedColumns));

    }


}
