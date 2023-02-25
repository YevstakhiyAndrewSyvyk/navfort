package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class LoginPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the Navfort login page")
    public void user_is_on_the_navfort_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User types valid {string}")
    public void user_types_valid(String username) {
        loginPage.usernameBox.sendKeys(username);

    }

    @And("User types correct {string}")
    public void userTypesCorrect(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User sees {string}")
    public void user_sees(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }





}
