package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;

	public Payment(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(xpath = "(//button[@class='e-tbar-btn e-tbtn-txt e-control e-btn e-lib'])[5]")
    private WebElement ClickPreviousDate;

    public WebElement getClickPreviousDate() {
	return ClickPreviousDate;
   }	
   
    @FindBy(xpath = "//span[text()='23']")
    private WebElement ClickSelectDate;

    public WebElement getSelectDate() {
	return ClickSelectDate;
   }
    @FindBy(xpath = "//div[@class='e-appointment-details']")
    private WebElement ClickAppointment;

    public WebElement getClickAppointment() {
	return ClickAppointment;
   }
    @FindBy(xpath = "//div[@id='new-app-status_1']//input[@type='text']")
    private WebElement ClickArrivedLobby;

    public WebElement getClickArrivedLobby() {
	return ClickArrivedLobby;
   }
    @FindBy(xpath = "(//span[normalize-space()='@ Arrived/Lobby'])[1]")
    private WebElement SelectArrivedLobby;

    public WebElement getSelectArrivedLobby() {
	return SelectArrivedLobby;
   }
    @FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
    private WebElement ClickServices;

    public WebElement getClickServices() {
	return ClickServices;
   }
    @FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")
    private WebElement ClickCPTCodes;

    public WebElement getClickCPTCodes() {
	return ClickCPTCodes;
   }
    @FindBy(xpath = "//input[@placeholder='Find Diagnosi Codes']")
    private WebElement EnterCPTCodes;

    public WebElement getEnterCPTCodes() {
	return EnterCPTCodes;
   }
    @FindBy(xpath = "//div[contains(text(),'test123--therapy')]")
    private WebElement SelectCPTCodes;

    public WebElement getSelectCPTCodes() {
	return SelectCPTCodes;
   }
    @FindBy(xpath = "(//input[@id='totalbill'])[41]")
    private WebElement ClearFees;

    public WebElement getClearFees() {
	return ClearFees;
   }
    @FindBy(xpath = "(//input[@id='totalbill'])[41]")
    private WebElement EnterFees;

    public WebElement getEnterFees() {
	return EnterFees;
	 }
    @FindBy(xpath = "(//select[@id='MA_CPT_441'])[1]")
    private WebElement clickModifiersA1;

    public WebElement getclickModifiersA1() {
	return clickModifiersA1;
	 }
    @FindBy(xpath = "(//option[@value='23'][contains(text(),'23')])[165]")
    private WebElement selectkModifiersA1;

    public WebElement getselectkModifiersA1() {
	return selectkModifiersA1;
	 }
    
    @FindBy(xpath = "(//select[@id='MB_CPT_441'])[1]")
    private WebElement clickModifiersA2;

    public WebElement getclickModifiersA2() {
	return clickModifiersA2;
	 }
    @FindBy(xpath = "(//option[@value='22'][contains(text(),'22')])[166]")
    private WebElement selectkModifiersA2;

    public WebElement getselectkModifiersA2() {
	return selectkModifiersA2;
	 }

    @FindBy(xpath = "(//select[@id='MC_CPT_441'])[1]")
    private WebElement clickModifiersA3;

    public WebElement getclickModifiersA3() {
	return clickModifiersA2;
	 }
    @FindBy(xpath = "(//option[@value='26'][contains(text(),'26')])[167]")
    private WebElement selectkModifiersA3;

    public WebElement getselectkModifiersA3() {
	return selectkModifiersA2;
	 }
    @FindBy(xpath = "(//select[@id='MD_CPT_441'])[1]")
    private WebElement clickModifiersA4;

    public WebElement getclickModifiersA4() {
	return clickModifiersA4;
	 }
    @FindBy(xpath = "(//option[@value='47'][contains(text(),'47')])[168]")
    private WebElement selectkModifiersA4;

    public WebElement getselectkModifiersA4() {
	return selectkModifiersA4;
	 }
    @FindBy(xpath = "//input[@id='cpt_4_units41']")
    private WebElement clearquantity;

    public WebElement getclearquantity() {
	return clearquantity;
	 }
    @FindBy(xpath = "//input[@id='cpt_4_units41']")
    private WebElement Enterquantity;

    public WebElement getEnterquantity() {
	return Enterquantity;
	 }
    @FindBy(xpath = "//input[@id='cpt_4_pointer41']")
    private WebElement EnterPointer;

    public WebElement getEnterPointer() {
	return EnterPointer;
	 }
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")
    private WebElement ClickBilling;

    public WebElement getClickBilling() {
	return ClickBilling;
   }
    @FindBy(xpath = "//span[normalize-space()='Create Invoice']")
    private WebElement ClickCreateInvoice;

    public WebElement getClickCreateInvoice() {
	return ClickCreateInvoice;
   }
    @FindBy(xpath = "//div[normalize-space()='Add Payment']")
    private WebElement ClickAddPayment;

    public WebElement getClickAddPayment() {
	return ClickAddPayment;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[10]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")
    private WebElement ClickInvoiceBalance;

    public WebElement getClickInvoiceBalance() {
	return ClickInvoiceBalance;
   }
    @FindBy(xpath = "//select[@id='paymethod']")
    private WebElement SelectPaymentMethod;

    public WebElement getSelectPaymentMethod() {
	return SelectPaymentMethod;
   }
    @FindBy(xpath = "//button[normalize-space()='Add Payment']")
    private WebElement Clickaddpayment;

    public WebElement getClickaddpayment() {
	return Clickaddpayment;
   }
	
	
	
//	ICD10 Codes
    
    @FindBy(xpath = "//input[@placeholder='Find ICD10 Codes']")
    private WebElement searchcodes;

    public WebElement getsearchcodes() {
	return searchcodes;
   }	
    @FindBy(xpath = "(//div[@class='title'][normalize-space()='Z32.00--Encounter for pregnancy test, result unknown'])[1]")
    private WebElement selectcode;

    public WebElement getselectcode() {
	return selectcode;
   }
    @FindBy(xpath = "(//button[@type='button'])[129]")
    private WebElement clickdelete;

    public WebElement getclickdelete() {
	return clickdelete;
   }
	
	
}
