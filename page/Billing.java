package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing {
	
	public WebDriver driver;
	
	public Billing(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	              //////////      Insurance claim        //////////////////

	
	
	@FindBy(xpath = "//a[normalize-space()='Billing']")
    private WebElement ClickBillingModule;

    public WebElement getClickBillingModule() {
	return ClickBillingModule;
   }
    
    @FindBy(xpath = "//div[contains(@class,'ins-top-btn ins-p-s vo_1_1')]//input[@id='search-btn-hover']")
    private WebElement Enterclientname;

    public WebElement getEnterclientname() {
	return Enterclientname;
   }
    @FindBy(xpath = "(//input[@id='search-btn-hover'])[2]")
    private WebElement EnterPayername;

    public WebElement getEnterPayername() {
	return EnterPayername;
   }
    @FindBy(xpath = "//div[@name='UNITED HEALTHCARE']")
    private WebElement SelectUNITEDHEALTHCARE;

    public WebElement getSelectUNITEDHEALTHCARE() {
	return SelectUNITEDHEALTHCARE;
   }
    @FindBy(xpath = "//div[contains(@class,'insurance_claim_form_1')]//select[@id='select-btn-hover']")
    private WebElement ClickOfficeDropdown;

    public WebElement getClickOfficeDropdown() {
	return ClickOfficeDropdown;
   }
    @FindBy(xpath = "//option[normalize-space()='Test Facility Phar']")
    private WebElement SelectTestFacilityPhar;

    public WebElement getSelectTestFacilityPhar() {
	return SelectTestFacilityPhar;
   }
    @FindBy(xpath = "(//select[@id='select-btn-hover'])[2]")
    private WebElement ClickByBillingStatus;

    public WebElement getClickByBillingStatus() {
	return ClickByBillingStatus;
    }
    @FindBy(xpath = "//option[@value='Paid In Full']")
    private WebElement SelectPaidInFull;

    public WebElement getSelectPaidInFull() {
	return SelectPaidInFull;
   }
    @FindBy(xpath = "(//select[@id='select-btn-hover'])[3]")
    private WebElement ClickByClaimStatus;

    public WebElement getClickByClaimStatus() {
	return ClickByClaimStatus;
   }
    @FindBy(xpath = "//option[normalize-space()='Claimed']")
    private WebElement selectClaimed;

    public WebElement getselectClaimed() {
	return selectClaimed;
   }
    @FindBy(xpath = "//input[contains(@placeholder,'Start date')]")
    private WebElement clickdate;

    public WebElement getclickdate() {
	return clickdate;
   }
    @FindBy(xpath = "//td[contains(@title,'2022-04-01')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='1']")
    private WebElement selectStartDate;

    public WebElement getselectStartDate() {
	return selectStartDate;
   }
    @FindBy(xpath = "//td[contains(@title,'2022-04-06')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='6']")
    private WebElement selectEndDate;

    public WebElement getselectEndDate() {
	return selectEndDate;
   }
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement ClickSearchButton;

    public WebElement getClickSearchButton() {
	return ClickSearchButton;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
    private WebElement ClickGenerateFormButton;

    public WebElement getClickGenerateFormButton() {
	return ClickGenerateFormButton;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]/button[1]")
    private WebElement ClickHCPAPDF;

    public WebElement getClickHCPAPDF() {
	return ClickHCPAPDF;
   }
    @FindBy(xpath = "//button[normalize-space()='Validate Only']")
    private WebElement ClickValidateOnly;

    public WebElement getClickValidateOnly() {
	return ClickValidateOnly;
   }
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement ClickClose;

    public WebElement getClickClose() {
	return ClickClose;
   }
	
	
	
    //////////////////////   Patient balance /ledger        //////////////	
    
    @FindBy(xpath = "//a[normalize-space()='Insurance Claim']")
    private WebElement clickInsuranceClaim;

    public WebElement getclickInsuranceClaim() {
	return clickInsuranceClaim;
   }
    @FindBy(xpath = "//a[normalize-space()='Patient balance /ledger']")
    private WebElement ClickPatientBalanceLedger;

    public WebElement getClickPatientBalanceLedger() {
	return ClickPatientBalanceLedger;
   }
    @FindBy(xpath = "//input[@placeholder='Search Patient']")
    private WebElement EnterClientName;

    public WebElement getEnterClientName() {
	return EnterClientName;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement SelectJonPeter;

    public WebElement getSelectJonPeter() {
	return SelectJonPeter;
   }
    @FindBy(xpath = "//tbody/tr[@class='MuiTableRow-root table-data-row schedule-body-row']/td[2]")
    private WebElement clickledger;

    public WebElement getclickledger() {
	return clickledger;
   }   
	
	/////////////////////  FEES SCHEDULE   ////////////////////////////
    
    ////ICD9
	
    @FindBy(xpath = "//a[normalize-space()='Fee schedule']")
    private WebElement clickFeesSchedule;

    public WebElement getclickFeesSchedule() {
	return clickFeesSchedule;
   } 
    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-2']")
    private WebElement clickICD9;

    public WebElement getclickICD9() {
	return clickICD9;
   } 
    @FindBy(xpath = "//input[@placeholder='ICD 9']")
    private WebElement EnterICDCode;

    public WebElement getEnterICDCode() {
	return EnterICDCode;
   } 
    @FindBy(xpath = "(//div[@class='title'])[1]")
    private WebElement SelectICDCode;

    public WebElement getSelectICDCode() {
	return SelectICDCode;
   } 
    @FindBy(xpath = "//div[@class='ins-top-btn ins-p-s m-l-15 i_p_e_1 for-icd-9-srch-box-res']//input[@placeholder='Picklist Category']")
    private WebElement EnterPickList;

    public WebElement getEnterPickList() {
	return EnterPickList;
   } 
    @FindBy(xpath = "(//div[@class='title'])[2]")
    private WebElement SelecWhite;

    public WebElement getSelecWhite() {
	return SelecWhite;
   } 
    @FindBy(xpath = "//button[@class='m-l-15 create-appt edit-note h-34 input-size u_b_h for-icd-9-srch-box-res-but btn-fnt-wgt btn btn-primary']")
    private WebElement ClickUpdate;

    public WebElement getClickUpdate() {
	return ClickUpdate;
   }
    @FindBy(xpath = "//tbody/tr[1]/td[4]/button[1]//*[name()='svg']")
    private WebElement ClickEDit;

    public WebElement getClickEDit() {
	return ClickEDit;
   }
    @FindBy(xpath = "//option[normalize-space()='ICD-9']")
    private WebElement selectCodeType;

    public WebElement getselectCodeType1() {
	return selectCodeType;
   }
    @FindBy(xpath = "//input[@id='icd9codescval']")
    private WebElement clearcode;

    public WebElement getclearcode() {
	return clearcode;
   }
    @FindBy(xpath = "//input[@id='icd9codescval']")
    private WebElement Entercode;

    public WebElement getEntercode() {
	return Entercode;
   }
    @FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
    private WebElement ClickCancel;

    public WebElement getClickCancel() {
	return ClickCancel;
   }
    @FindBy(xpath = "//div[@id='rc-tabs-0-panel-2']//div//button[@type='button'][normalize-space()='Add New']")
    private WebElement ClickAddNew;

    public WebElement getClickAddNew() {
	return ClickAddNew;
   }
    @FindBy(xpath = "//select[@id='code_typeval']")
    private WebElement ClickCodeType;

    public WebElement getClickCodeType() {
	return ClickCodeType;
   }
    @FindBy(xpath = "//option[@value='2']")
    private WebElement SelectCodeType;

    public WebElement getSelectCodeType() {
	return SelectCodeType;
   }
    @FindBy(xpath = "//input[@id='icd9codescval']")
    private WebElement EnterCode;

    public WebElement getEnterCode() {
	return EnterCode;
   }
    @FindBy(xpath = "//div[contains(text(),'058.21-- Human herpesvirus 6 encephalitis')]")
    private WebElement SelectEnterCode;

    public WebElement getSelectEnterCode() {
	return SelectEnterCode;
   }
    @FindBy(xpath = "//select[@id='scoffice']")
    private WebElement ClickOffice;

    public WebElement getClickOffice() {
	return ClickOffice;
   }
    @FindBy(xpath = "//option[@value='3']")
    private WebElement SelectTestFacilityPhar1;

    public WebElement getSelectTestFacilityPhar1() {
	return SelectTestFacilityPhar;
   } 
    @FindBy(xpath = "//input[@id='customdesc']")
    private WebElement EnterDescription;

    public WebElement getEnterDescription() {
	return EnterDescription;
   }  
    @FindBy(xpath = "//input[@id='pickcat']")
    private WebElement EnterPicklistCategory;

    public WebElement getEnterPicklistCategory() {
	return EnterPicklistCategory;
   } 
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement Clicksave ;

    public WebElement getClicksave() {
	return Clicksave;
   }
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel1 ;

    public WebElement getClickCancel1() {
	return ClickCancel1;
   }
    
                      ///////ICD 10
    
    
    @FindBy(xpath = "(//div[contains(text(),'ICD-10')])[1]")
    private WebElement ClickICD10;

    public WebElement getClickICD10() {
	return ClickICD10;
   }
    @FindBy(xpath = "(//input[@placeholder='ICD 10'])[1]")
    private WebElement EnterICD10;

    public WebElement getEnterICD10() {
	return EnterICD10;
   } 
    @FindBy(xpath = "//div[contains(@class,'title')][normalize-space()='R40.2433:Glasgow coma scale score 3-8, at hospital admission']")
    private WebElement SelectICD10;

    public WebElement getSelectICD10() {
	return SelectICD10;
   } 
    @FindBy(xpath = "//div[@class='ins-top-btn ins-p-s m-l-15 f_s_i_d for-icd-9-srch-box-res']//input[@placeholder='Picklist Category']")
    private WebElement EnterPickList1;

    public WebElement getEnterPickList1() {
	return EnterPickList1;
   } 
    @FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='Rose'])[1]")
    private WebElement SelectRose;

    public WebElement getSelectRose() {
	return SelectRose;
   } 
    @FindBy(xpath = "//span[normalize-space()='Update']")
    private WebElement SelectUpdate;

    public WebElement getSelectUpdate() {
	return SelectUpdate;
   }  
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]/*[name()='svg'][1]")
    private WebElement ClickEdit;

    public WebElement getClickEdit() {
	return ClickEdit;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel2;

    public WebElement getClickCancel2() {
	return ClickCancel2;
   } 
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    private WebElement ClickaddNew;

    public WebElement getClickaddNew() {
	return ClickaddNew;
   } 
    @FindBy(xpath = "//select[@id='code_typeval']")
    private WebElement ClickcodeType;

    public WebElement getClickcodeType() {
	return ClickcodeType;
   }  
    @FindBy(xpath = "(//option[@value='102'])[1]")
    private WebElement SelectycodeType;

    public WebElement getSelectcodeType() {
	return SelectycodeType;
   }  
    @FindBy(xpath = "//input[@id='icd10codescval']")
    private WebElement ClickCode;

    public WebElement getClickCode() {
	return ClickCode;
   } 
    @FindBy(xpath = "//div[contains(text(),'R29.705--NIHSS score 5')]")
    private WebElement SelectCode;

    public WebElement getSelectCode() {
	return SelectCode;
   }  
    @FindBy(xpath = "//select[@id='scoffice']")
    private WebElement Clickoffice;

    public WebElement getClickoffice() {
	return Clickoffice;
   } 
    @FindBy(xpath = "//option[@value='3']")
    private WebElement selectTestfacilityphar;

    public WebElement getselectTestfacilityphar() {
	return selectTestfacilityphar;
   } 
    @FindBy(xpath = "//input[@id='customdesc']")
    private WebElement EnterCodeDescription;

    public WebElement getEnterCodeDescription() {
	return EnterCodeDescription;
   }
    @FindBy(xpath = "//input[@id='pickcat']")
    private WebElement EnterPicklistcategory;

    public WebElement getEnterPicklistcategory() {
	return EnterPicklistcategory;
   }
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSave;

    public WebElement getClickSave() {
	return ClickSave;
   } 
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCance;

    public WebElement getClickCance() {
	return ClickCance;
   } 
    
    
    ///////////////////////   EOB  Add Payment        ///////////////////
    
    
    
    @FindBy(xpath = "//a[normalize-space()='EOB']")
    private WebElement ClickEOB;

    public WebElement getClickEOB() {
	return ClickEOB;
   } 
    @FindBy(xpath = "//button[normalize-space()='Add Payment']")
    private WebElement ClickAddPyment;

    public WebElement getClickAddPyment() {
	return ClickAddPyment;
   }
    @FindBy(xpath = "//input[@id='mydate']")
    private WebElement ClickDate;

    public WebElement getClickDate() {
	return ClickDate;
   }
    @FindBy(xpath = "//td[@title='2022-04-07']//div[@class='ant-picker-cell-inner'][normalize-space()='7']")
    private WebElement SelectDate;

    public WebElement getSelectDate() {
	return SelectDate;
   }
    @FindBy(xpath = "//select[@id='payerid']")
    private WebElement ClickPayer;

    public WebElement getClickPayer() {
	return ClickPayer;
   }
    @FindBy(xpath = "//option[@value='2']")
    private WebElement SelectUnitedHealh;

    public WebElement getSelectUnitedHealth() {
	return SelectUnitedHealh;
   }
    @FindBy(xpath = "//select[@id='pay_method']")
    private WebElement SelectPaymentMethod;

    public WebElement getSelectPaymentMethod() {
	return SelectPaymentMethod;
   } 
    @FindBy(xpath = "//option[@value='Authorize.net']")
    private WebElement SelectAutorize;

    public WebElement getSelectAutorize() {
	return SelectAutorize;
   }
    @FindBy(xpath = "//div[1]//div[4]//div[1]//div[2]//input[1]")
    private WebElement EnterPaymentNumber;

    public WebElement getEnterPaymentNumber() {
	return EnterPaymentNumber;
   }
    @FindBy(xpath = "(//input[contains(@type,'text')])[3]")
    private WebElement EnterAmount;

    public WebElement getEnterAmount() {
	return EnterAmount;
   }
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement SelectSave;

    public WebElement getSelectSave() {
	return SelectSave;
   }
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement SelectCancel;

    public WebElement getSelectCancel() {
	return SelectCancel;
   } 
    
    
}
