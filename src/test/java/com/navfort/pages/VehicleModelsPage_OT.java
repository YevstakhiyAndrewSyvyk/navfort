package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleModelsPage_OT extends QuickLaunchpadPage {

    public VehicleModelsPage_OT() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement vehiclesModelOption;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement message_txt;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//th")
    public List<WebElement> columnsName;


    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }

        elemTexts.remove(0);
        elemTexts.removeIf(str -> str == null || str.trim().isEmpty());
        elemTexts.remove(elemTexts.size()-1);

        return elemTexts;


    }
}
