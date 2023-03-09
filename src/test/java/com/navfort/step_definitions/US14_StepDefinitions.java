package com.navfort.step_definitions;

import com.navfort.pages.CampaignPage_ROA;
import com.navfort.pages.QuickLaunchpadPage_ROA;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US14_StepDefinitions {


    QuickLaunchpadPage_ROA quickLaunchpadPage_roa = new QuickLaunchpadPage_ROA();
    CampaignPage_ROA campaignPage_roa = new CampaignPage_ROA();


    @Given("the user in on the campaign page ROA")
    public void the_user_in_on_the_campaign_page_roa() throws InterruptedException {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(quickLaunchpadPage_roa.marketingDropDown, 5);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(quickLaunchpadPage_roa.marketingDropDown).perform();
        // quickLaunchpadPage_roa.marketingDropDown.click();
        quickLaunchpadPage_roa.campaignMenu.click();
    }
    @When("user sees Manage filters button ROA")
    public void user_sees_manage_filters_button_roa() {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(campaignPage_roa.btn_filter,5);
        campaignPage_roa.btn_filter.click();
        campaignPage_roa.manageFiltersAddFilterButton.click();

        /*
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(campaignPage_roa.element5, 5);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(campaignPage_roa.element5).perform();
        BrowserUtils.sleep(3);

        campaignPage_roa.manageFiltersAddFilterButton.click();

         */





    }
    @Then("user verifies {int} options are checked by default ROA")
    public void user_verifies_options_are_checked_by_default_roa(Integer int1) {

        boolean isSelected = false;

        for (WebElement each : campaignPage_roa.filters) {
            if (each.isSelected()){
                isSelected = true;
            }else {
                break;
            }
        }

        /*
        boolean isSelected = false;

        for (int i = 0; i < campaignPage_roa.filters.size() ; i++) {

            if (campaignPage_roa.filters.get(i).isSelected()){
                campaignPage_roa.filters.get(i).click();
            }
        }
         */



    }

    @And("user uncheck one or more options ROA")
    public void userUncheckOneOrMoreOptionsROA() {


        for (int i = 0; i < campaignPage_roa.filters.size()-1 ; i++) {

            if (campaignPage_roa.filters.get(i).isSelected()){
                campaignPage_roa.filters.get(i).click();
            }
        }


    }

    @Then("user verifies one or more options are unchecked ROA")
    public void userVerifiesOneOrMoreOptionsAreUncheckedROA() {

        boolean isSelected = false;
        int count = 0;

        for (int i = 1; i < campaignPage_roa.filters.size() ; i++) {

            if (!(campaignPage_roa.filters.get(i).isSelected())){
                isSelected = true;
                count++;

                if (count >= 3){
                    break;
                }

            }

        }

        Assert.assertTrue(isSelected);


    }

}
