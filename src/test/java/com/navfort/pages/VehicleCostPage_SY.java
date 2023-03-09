package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostPage_SY {
    public VehicleCostPage_SY(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropdown;
    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement driverFleetTab;


    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;
    @FindBy (xpath = "(//span[@class='grid-header-cell__label' and text()='Type'])[1]")
    public WebElement typeColumn;
    @FindBy (xpath = "(//span[@class='grid-header-cell__label' and text()='Total Price'])[1]")
    public WebElement totalPriceColumn;
    @FindBy (xpath = "(//span[@class='grid-header-cell__label' and text()='Date'])[1]")
    public WebElement dateColumn;

    @FindBy (xpath = "//div[@class='btn-group dropdown']/button/input")
    public WebElement firstcheckBox;

    @FindBy (xpath = "//input[@data-role='select-row-cell']")
    public List<WebElement> otherCheckBoxes;




}
