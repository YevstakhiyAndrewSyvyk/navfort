package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageDriver_SB {

    public  MainPageDriver_SB() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement warningMessage;

}
