package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ERXPage {

	
	public WebDriver driver;

	public ERXPage(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	
        ///////////////////Favorite Pharmacies   

	
	
	@FindBy(xpath = "//a[text()='Settings']")
    private WebElement ClickSettingsModule;

    public WebElement getClickSettingsModule2() {
	return ClickSettingsModule;
   }	
    @FindBy(xpath = "//div[text()='Features']")
    private WebElement ClickFeatures;

    public WebElement getClickFeatures2() {
	return ClickFeatures;
   }
    @FindBy(xpath = "//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow5']")
    private WebElement ClickAdministration;

    public WebElement getClickAdministration() {
	return ClickAdministration;
   }
    @FindBy(xpath = "//a[normalize-space()='eRx Settings']")
    private WebElement ClickERXSettings;

    public WebElement getClickERXSettings() {
	return ClickERXSettings;
   }
    @FindBy(xpath = "//div[text()='Favorite Pharmacies']")
    private WebElement ClickFavoritePharamices;

    public WebElement getClickFavoritePharamices() {
	return ClickFavoritePharamices;
   } 
    @FindBy(xpath = "//button[normalize-space()='Add Pharmacies']")
    private WebElement ClickAddPharmacies;

    public WebElement getClickAddPharmacies() {
	return ClickAddPharmacies;
   } 
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement EnterPharamacies;

    public WebElement getEnterPharamacies() {
	return EnterPharamacies;
   } 
    @FindBy(xpath = "//span[@class='fv-ph-icon input-group-text']")
    private WebElement ClickSearchButton;

    public WebElement getClickSearchButton() {
	return ClickSearchButton;
   } 
    @FindBy(xpath = "//div[@id='add-fav-phar']//div[1]//div[1]//div[1]//input[1]")
    private WebElement SelectCypressRadiobutton;

    public WebElement getSelectCypressRadiobutton() {
	return SelectCypressRadiobutton;
   }  
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSaveButton;

    public WebElement getClickSaveButton() {
	return ClickSaveButton;
   }  
    
    
             ////////////////RX Profiles
    
    
    @FindBy(xpath = "(//div[@class='ant-tabs-ink-bar ant-tabs-ink-bar-animated'])[1]")
    private WebElement ClickRXProfiles;

    public WebElement getClickRXProfiles() {
	return ClickRXProfiles;
   } 
    @FindBy(xpath = "//button[normalize-space()='RX Profiles']")
    private WebElement ClickAddRXProfiles;

    public WebElement getClickAddRXProfiles() {
	return ClickAddRXProfiles;
   }
    @FindBy(xpath = "//input[contains(@name,'appduration')]")
    private WebElement EnterName;

    public WebElement getEnterName() {
	return EnterName;
   } 
    @FindBy(xpath = "//button[@id='for_yes0']")
    private WebElement Clickyes;

    public WebElement getClickSYNTHROIDyes() {
	return Clickyes;
   }
    @FindBy(xpath = "//button[@id='for_yes1']")
    private WebElement ClickLEVOyes;

    public WebElement getClickLEVOyes() {
	return ClickLEVOyes;
   }
    @FindBy(xpath = "//button[@id='for_yes2']")
    private WebElement ClickCLEOCINyes;

    public WebElement getClickCLEOCINyes() {
	return ClickCLEOCINyes;
   } 
    @FindBy(xpath = "//button[@id='for_yes3']")
    private WebElement ClickRETINyes;

    public WebElement getClickRETINyes() {
	return ClickRETINyes;
   }  
    @FindBy(xpath = "//button[@id='for_yes4']")
    private WebElement ClickIONILyes;

    public WebElement getClickIONILyes() {
	return ClickIONILyes;
   }  
    @FindBy(xpath = "//button[@id='for_yes5']")
    private WebElement Interferonyes;

    public WebElement getClickInterferonyes() {
	return Interferonyes;
   }  
    @FindBy(xpath = "//button[@id='for_yes6']")
    private WebElement ClickZOCORyes;

    public WebElement getClickZOCORyes() {
	return ClickZOCORyes;
   }  
    @FindBy(xpath = "//button[@id='for_yes10']")
    private WebElement ClickPeginterferonyes;

    public WebElement getClickPeginterferonyes() {
	return ClickPeginterferonyes;
   }     
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSAVE;

    public WebElement getClickSAVE() {
	return ClickSAVE;
   } 
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement ClickClose;

    public WebElement getClickClose() {
	return ClickClose;
   }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
