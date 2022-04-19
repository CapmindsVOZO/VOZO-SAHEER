package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {

	
	public WebDriver driver;

	public Reports(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(xpath = "//a[text()='Reports']")
    private WebElement ClickReportsModule;

    public WebElement getClickReportsModule() {
	return ClickReportsModule;
   }	
//    @FindBy(xpath = "//a[text()='Billing Summary']")
//    private WebElement ClickBillingSummary;
//
//    public WebElement getClickBillingSummary() {
//	return ClickBillingSummary;
//    }
//   
    
  //APPOINTMENT REPORT

    @FindBy(xpath = "//a[normalize-space()='Reports']")
    private WebElement ClickReport;

    public WebElement getClickReport() {
	return ClickReport;
   }  
    
    @FindBy(xpath = "//a[normalize-space()='Appointment Report']")
    private WebElement ClickAppointmentReport;

    public WebElement getClickAppointmentReport() {
	return ClickAppointmentReport;
   }  
    @FindBy(xpath = "(//button[text()='Check All'])[2]")
    private WebElement ClickCheckAll1;

    public WebElement getClickCheckAll() {
	return ClickCheckAll1;
   }
    @FindBy(xpath = "//button[text()='UncheckAll']")
    private WebElement ClickUnCheckAll1;

    public WebElement getClickUnCheckAll() {
	return ClickUnCheckAll1;
   }
    @FindBy(xpath = "(//button[text()='Check All'])[1]")
    private WebElement ClickCheckAll;

    public WebElement getClickCheckAll1() {
	return ClickCheckAll;
   }
    @FindBy(xpath = "(//button[text()='Uncheck All'])[1]")
    private WebElement ClickUnCheckAll;

    public WebElement getClickUnCheckAll1() {
	return ClickUnCheckAll;
   }
    @FindBy(xpath = "//input[@placeholder='Patient']")
    private WebElement SearchPatientName;

    public WebElement getSearchPatientName() {
	return SearchPatientName;
   }
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement ClickAllOffice;

    public WebElement getClickAllOffice() {
	return ClickAllOffice;
   }
    @FindBy(xpath = "//option[contains(text(),'Test Facility Phar')]")
    private WebElement SelectTestFacilityPhar;

    public WebElement getSelectTestFacilityPhar() {
	return SelectTestFacilityPhar;
   }
    @FindBy(xpath = "//input[@placeholder='From']")
    private WebElement clickFromdate;

    public WebElement getclickFromdate() {
	return clickFromdate;
   }
    @FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]")
    private WebElement selectdate8;
    
    public WebElement getselectdatenumber8() {
	return selectdate8;
   }
    @FindBy(xpath = "//input[@placeholder='To']")
    private WebElement clickEndDate;
    
    public WebElement getclickEndDate() {
	return clickEndDate;
   }
    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/div[1]")
    private WebElement selectdate15;
    
    public WebElement getselectdate15() {
	return selectdate15;
   }
    @FindBy(xpath = "//button[contains(text(),'Update')]")
    private WebElement clickupdatebutton;
    
    public WebElement getclickupdatebutton() {
	return clickupdatebutton;
   }
    @FindBy(xpath = "(//input[@name='Settled'])[2]")
    private WebElement clickRadioButton;
    
    public WebElement getclickRadioButton() {
	return clickRadioButton;
   }
	

	//Tele Health Report
    
    @FindBy(xpath = "//a[contains(text(),'Telehealth Report')]")
    private WebElement clickTeleHealthReport;
    
    public WebElement getclickTeleHealthReport() {
	return clickTeleHealthReport;
   }
    @FindBy(xpath = "//button[contains(text(),'Check All')]")
    private WebElement clickCheckAll;
    
    public WebElement getclickCheckAll() {
	return clickCheckAll;
   }
    @FindBy(xpath = "//button[contains(text(),'UncheckAll')]")
    private WebElement clickUnCheckAll;
    
    public WebElement getclickUnCheckAll() {
	return clickUnCheckAll;
   }
    @FindBy(xpath = "//input[@name='Occured']")
    private WebElement clickOccuredRadioButton;
    
    public WebElement getclickOccuredRadioButton() {
	return clickOccuredRadioButton;
   } 
    @FindBy(xpath = "//input[@name='DidNotOccured']")
    private WebElement clickDidnotOccuredRadioButton;
    
    public WebElement getclickDidnotOccuredRadioButton() {
	return clickDidnotOccuredRadioButton;
   }
    @FindBy(xpath = "(//input[@placeholder='Patient Search'])[2]")
    private WebElement SearchThePatientName;
    
    public WebElement getSearchThePatientName1() {
	return SearchThePatientName;
   }
    @FindBy(xpath = "(//input[@placeholder='Patient Search'])[2]")
    private WebElement SelectOfficeOption;
    
    public WebElement getSelectOfficeOption() {
	return SelectOfficeOption;
   }
    @FindBy(xpath = "//option[contains(text(),'Test Facility Phar')]")
    private WebElement SelectclickTestFacilityPhar;
    
    public WebElement getSelectclickTestFacilityPhar() {
	return SelectclickTestFacilityPhar;
   }
    @FindBy(xpath = "//input[@placeholder='Start date']")
    private WebElement clickStartDate;
    
    public WebElement getclickStartDate() {
	return clickStartDate;
   }
    @FindBy(xpath = "//div[contains(text(),'16')]")
    private WebElement SelectStartDate16;
    
    public WebElement getSelectStartDate16() {
	return SelectStartDate16;
   }
    @FindBy(xpath = "//input[@placeholder='End date']")
    private WebElement clickEndDateq;
    
    public WebElement getclickEndDateq() {
	return clickEndDateq;
   }
    @FindBy(xpath = "//div[contains(text(),'31')]")
    private WebElement SelectEndDate16;
    
    public WebElement getSelectStartDate31() {
	return SelectStartDate16;
   }
    @FindBy(xpath = "//button[text()='Update Filter']")
    private WebElement clickUpdateFilterOption;
    
    public WebElement getclickUpdateFilterOption() {
	return clickUpdateFilterOption;
   }
    @FindBy(xpath = "//button[contains(text(),'Export To File')]")
    private WebElement ClickExportToFile;
    
    public WebElement getClickExportToFile() {
	return ClickExportToFile;
   }
    @FindBy(xpath = "//button[contains(text(),'Load more...')]")
    private WebElement ClickLoadmore;
    
    public WebElement getClickLoadmore() {
	return ClickLoadmore;
   }
	
 //Productivity Report
    
    @FindBy(xpath = "//a[contains(text(),'Productivity Report')]")
    private WebElement ClickProductivityReport;
    
    public WebElement getClickProductivityReport() {
	return ClickProductivityReport;
   }
    @FindBy(xpath = "//input[@placeholder='From Date']")
    private WebElement ClickTheFromDate;
    
    public WebElement getClickTheFromDate() {
	return ClickTheFromDate;
   }
    @FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='16'])[1]")
    private WebElement SelectTheFromDate16;
    
    public WebElement getSelectTheFromDate16() {
	return SelectTheFromDate16;
   }
    @FindBy(xpath = "//input[@placeholder='To Date']")
    private WebElement clickTheEndDate;
    
    public WebElement getclickTheEndDate() {
	return clickTheEndDate;
   }
    @FindBy(xpath = "(//div[contains(text(),'31')])[2]")
    private WebElement selectTheEndDate31;
    
    public WebElement getselectTheEndDate31() {
	return selectTheEndDate31;
   }
    @FindBy(xpath = "//select[@id='b-l-34']")
    private WebElement ClickProvider;
    
    public WebElement getClickProvider() {
	return ClickProvider;
   }
    @FindBy(xpath = "//option[@value='1']")
    private WebElement SelectProvider;
    
    public WebElement getSelectProvider() {
	return SelectProvider;
   }
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement ClickCheckBox;
    
    public WebElement getClickCheckBox() {
	return ClickCheckBox;
   }
    @FindBy(xpath = "//button[normalize-space()='Update']")
    private WebElement ClickUpdateButton;
    
    public WebElement getClickUpdateButton() {
	return ClickUpdateButton;
   }
    @FindBy(xpath = "//button[@id='load-data']")
    private WebElement ClickLoadMore;
    
    public WebElement getClickLoadMore() {
	return ClickLoadMore;
   }
    @FindBy(xpath = "//a[contains(text(),'User Report')]")
    private WebElement ClickUserreport;
    
    public WebElement getClickUserreport() {
	return ClickUserreport;
   }
    @FindBy(xpath = "//a[contains(text(),'User Report')]")
    private WebElement EnterSearchUsername;
    
    public WebElement getEnterSearchUsername() {
	return EnterSearchUsername;
   }
    @FindBy(xpath = "//input[@id='inactivedoctor']")
    private WebElement clickInactiveRadioButton;
    
    public WebElement getclickInactiveRadioButton() {
	return clickInactiveRadioButton;
   }
    @FindBy(xpath = "(//button[text()='Search'])[1]")
    private WebElement clickSearchButton;
    
    public WebElement getclickSearchButton() {
	return clickSearchButton;
   }
    @FindBy(xpath = "//div[text()='Staff']")
    private WebElement clickStaffButton;
    
    public WebElement getclickStaffButton() {
	return clickStaffButton;
   }
    @FindBy(xpath = "//div[text()='Staff']")
    private WebElement EnterUserName;
    
    public WebElement getEnterUserName() {
	return EnterUserName;
   }
    @FindBy(xpath = "//input[@id='inactivestaff']")
    private WebElement ClickInactive;
    
    public WebElement getClickInactive() {
	return ClickInactive;
   }
    @FindBy(xpath = "(//button[text()='Search'])[2]")
    private WebElement clickSearchButton1;
    
    public WebElement getclickSearchButton1() {
	return clickSearchButton1;
   }
   
	
	
	
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
