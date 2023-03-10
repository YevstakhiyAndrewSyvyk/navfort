package com.navfort.step_definitions;

import com.navfort.pages.MainPageDriver_SB;
import com.navfort.pages.MainPageStoreManager_SB;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class US04_StepDefs {

    MainPageStoreManager_SB mainPageStoreManager_sb = new MainPageStoreManager_SB();
    MainPageDriver_SB mainPageDriver_sb = new MainPageDriver_SB();

    @Then("Then user clicks {string} main menu and sub menu {string}")
    public void then_user_clicks_main_menu_and_sub_menu(String link1, String link2) {
        BrowserUtils.sleep(7);
        mainPageStoreManager_sb.fleetLink.click();
        BrowserUtils.sleep(3);
        mainPageStoreManager_sb.vehicleContracts.click();
        BrowserUtils.sleep(3);
    }

    @Then("the user should see title {string}")
    public void theUserShouldSeeTitle(String title) {
        BrowserUtils.verifyTitle(title);


    }

    @Then("the user should see the warning message {string}")
    public void theUserShouldSeeTheWarningMessage(String warningMessage) {
        //TODO: isDisplayed??
        String expectedMessage = warningMessage;
        BrowserUtils.sleep(3);
        String actualMessage=mainPageDriver_sb.warningMessage.getText();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
