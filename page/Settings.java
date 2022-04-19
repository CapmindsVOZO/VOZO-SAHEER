package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {

	
	public WebDriver driver;

	public Settings(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@FindBy(xpath = "//a[text()='Settings']")
    private WebElement ClickSettingsModule;

    public WebElement getClickSettingsModule() {
	return ClickSettingsModule;
   }	
    @FindBy(xpath = "//div[text()='Features']")
    private WebElement ClickFeatures;

    public WebElement getClickFeatures() {
	return ClickFeatures;
   }	
    @FindBy(xpath = "//a[normalize-space()='Document']")
    private WebElement ClickDocument;

    public WebElement getClickDocument() {
	return ClickDocument;
   }
    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[1]")
    private WebElement ClickRadioButton;

    public WebElement getClickRadioButton() {
	return ClickRadioButton;
   }
    @FindBy(xpath = "//div[@class='right-block m-l-250']//div[2]//div[5]//div[1]//textarea[1]")
    private WebElement EnterFooderInfo;

    public WebElement getEnterFooderInfo() {
	return EnterFooderInfo;
   }
    @FindBy(xpath = "//div[@class='right-block m-l-250']//div[2]//div[6]//div[1]//button[1]")
    private WebElement ClickEdit;

    public WebElement getClickEdit() {
	return ClickEdit;
   }
    @FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")
    private WebElement ClickClinicianOption;

    public WebElement getClickClinicianOption() {
	return ClickClinicianOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[1]")
    private WebElement ClickPracticeOption;

    public WebElement getClickPracticeOption() {
	return ClickPracticeOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[2]")
    private WebElement ClickClientOption;

    public WebElement getClickClientOption() {
	return ClickClientOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[3]")
    private WebElement ClickAppointmentOption;

    public WebElement getClickAppointmentOption() {
	return ClickAppointmentOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[4]")
    private WebElement ClickLinksOption;

    public WebElement getClickLinksOption() {
	return ClickLinksOption;
   }
    @FindBy(xpath = "(//textarea[@id='invoicemessage'])[1]")
    private WebElement EnterSubject;

    public WebElement getEnterSubject() {
	return EnterSubject;
   }
    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement ClickCancel;

    public WebElement getClickCancel() {
	return ClickCancel;
   } 
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement ClickSave;

    public WebElement getClickSave() {
	return ClickSave;
   } 
    
    @FindBy(xpath = "//input[@id='statemntlogo']")
    private WebElement ClickRadioButton1;

    public WebElement getClickRadioButton1() {
	return ClickRadioButton1;
   }
    
    @FindBy(xpath = "//textarea[contains(@name,'statemntfooter')]")
    private WebElement ClickFooterInfo;

    public WebElement getClickFooterInfo() {
	return ClickFooterInfo;
   } 
    @FindBy(xpath = "//div[@class='mar-top']//div[4]//div[1]//button[1]")
    private WebElement ClickEdit1;

    public WebElement getClickEdit1() {
	return ClickEdit1;
   }  
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement ClickClinicianOption1;

    public WebElement getClickClinicianOption1() {
	return ClickClinicianOption1;
   }   
    @FindBy(xpath = "//div[@class='modal-content']//div//div[2]//select[1]")
    private WebElement ClickPracticeOption1;

    public WebElement getClickPracticeOption1() {
	return ClickPracticeOption1;
   }  
    @FindBy(xpath = "//div[@class='m-t-10 form-row']//div[3]//select[1]")
    private WebElement ClickClientOption1;

    public WebElement getClickClientOption1() {
	return ClickClientOption1;
   }  
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")
    private WebElement ClickAppointmentOption1;

    public WebElement getClickAppointmentOption1() {
	return ClickAppointmentOption1;
   }   
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")
    private WebElement ClickLinksOption1;

    public WebElement getClickLinksOption1() {
	return ClickLinksOption1;
   }  
    @FindBy(xpath = "//input[@id='statemntsubject']")
    private WebElement EnterSubject1;

    public WebElement getEnterSubject1() {
	return EnterSubject1;
   } 
    @FindBy(xpath = "//textarea[@id='statemntmessage']")
    private WebElement Entermsg;

    public WebElement getEntermsg() {
	return Entermsg;
   }
    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement ClickCancel1;

    public WebElement getClickCancel1() {
	return ClickCancel1;
   }  
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement ClickSave1;

    public WebElement getClickSave1() {
	return ClickSave1;
   } 
    @FindBy(xpath = "//input[@id='superbillslogo']")
    private WebElement ClickIncludeLogo1;

    public WebElement getClickIncludeLogo1() {
	return ClickIncludeLogo1;
   }   
    @FindBy(xpath = "//input[@id='superbillssign']")
    private WebElement ClickIncludeSignatureLine;

    public WebElement getClickIncludeSignatureLine() {
	return ClickIncludeSignatureLine;
   }   
    @FindBy(xpath = "//input[@id='superbillsdesc']")
    private WebElement ClickIncludeDiagnosis;

    public WebElement getClickIncludeDiagnosis() {
	return ClickIncludeDiagnosis;
   } 
    @FindBy(xpath = "//div[@class='mar-top']//div[5]//div[1]//textarea[1]")
    private WebElement ClearFooderInfo;

    public WebElement getClearFooderInfo() {
	return ClearFooderInfo;
   }
    @FindBy(xpath = "//div[@class='mar-top']//div[5]//div[1]//textarea[1]")
    private WebElement EnterFooderInformation;

    public WebElement getEnterFooderInformation() {
	return EnterFooderInformation;
   }
    @FindBy(xpath = "//div[@class='mar-top']//div[6]//div[1]//button[1]")
    private WebElement clcickEditOption;

    public WebElement getclcickEditOption() {
	return clcickEditOption;
   } 
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement ClickClinicianOption2;

    public WebElement getClickClinicianOption2() {
	return ClickClinicianOption2;
   }   
    @FindBy(xpath = "//div[@class='modal-content']//div//div[2]//select[1]")
    private WebElement ClickPracticeOption2;

    public WebElement getClickPracticeOption2() {
	return ClickPracticeOption2;
   }
    @FindBy(xpath = "//div[@class='m-t-10 form-row']//div[3]//select[1]")
    private WebElement ClickClientOption2;

    public WebElement getClickClientOption2() {
	return ClickClientOption2;
   } 
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")
    private WebElement ClickAppointmentOption2;

    public WebElement getClickAppointmentOption2() {
	return ClickAppointmentOption2;
   }  
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")
    private WebElement ClickLinksOption2;

    public WebElement getClickLinksOption2() {
	return ClickLinksOption2;
   }  
    @FindBy(xpath = "//input[@id='superbillsubject']")
    private WebElement clearSubject;

    public WebElement getclearSubject() {
	return clearSubject;
   }  
    @FindBy(xpath = "//input[@id='superbillsubject']")
    private WebElement EnterSubject2;

    public WebElement getEnterSubject2() {
	return EnterSubject2;
   } 
    @FindBy(xpath = "//textarea[@id='superbillmessage']")
    private WebElement clearMsg;

    public WebElement getclearMsg() {
	return clearMsg;
   }  
    @FindBy(xpath = "//textarea[@id='superbillmessage']")
    private WebElement Entermsg2;

    public WebElement getEntermsg2() {
	return Entermsg2;
   }  
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel2;

    public WebElement getClickCancel2() {
	return ClickCancel2;
   }  
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSave2;

    public WebElement getClickSave2() {
	return ClickSave2;
   }  
    @FindBy(xpath = "//input[@id='documentlogo']")
    private WebElement ClickIncludeLogo;

    public WebElement getClickIncludeLogo(){
	return ClickIncludeLogo;
   }
    @FindBy(xpath = "//div[@class='doc-footer']//textarea[1]")
    private WebElement clearFooterInfor;

    public WebElement getclearFooterInfor(){
	return clearFooterInfor;
   }
    @FindBy(xpath = "//div[@class='doc-footer']//textarea[1]")
    private WebElement EnterFooterInfor;

    public WebElement getEnterFooterInfor(){
	return EnterFooterInfor;
   }
    
    @FindBy(xpath = "//button[normalize-space()='Save Documents']")
    private WebElement ClickSAVE;

    public WebElement getClickSAVE(){
	return ClickSAVE;
   } 
    
    
    
////Billing and Services
   
    @FindBy(xpath = "//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow3']")
    private WebElement ClickBilligandServices;

    public WebElement getClickBilligandServices(){
	return ClickBilligandServices;
   } 
    @FindBy(xpath = "(//a[text()='Billing'])[2]")
    private WebElement ClickBillig;

    public WebElement getClickBillig(){
	return ClickBillig;
   } 
    @FindBy(xpath = "(//option[@value='$'])[1]")
    private WebElement ClickBilligCurrency;

    public WebElement getClickBilligCurrency(){
	return ClickBilligCurrency;
   }  
    @FindBy(xpath = "//option[@value='$']")
    private WebElement SelectUSD;

    public WebElement getSelectUSD(){
	return SelectUSD;
   }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement EnterTaxID;

    public WebElement getEnterTaxID(){
	return EnterTaxID;
   }
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    private WebElement EnterOrgNPI;

    public WebElement getEnterOrgNPI(){
	return EnterOrgNPI;
   }   
    @FindBy(xpath = "//button[contains(text(),'Send Verification Email')]")
    private WebElement clickSendVerification;

    public WebElement getclickSendVerification(){
	return clickSendVerification;
   } 
    @FindBy(xpath = "(//input[@id='otp_val'])[1]")
    private WebElement EnterVerificationCode;

    public WebElement getEnterVerificationCode(){
	return EnterVerificationCode;
    }
    @FindBy(xpath = "//button[contains(text(),'Close')]")
    private WebElement clickClose;

    public WebElement getclickClose(){
	return clickClose;
   }
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    private WebElement clickSubmit;

    public WebElement getclickSubmit(){
	return clickSubmit;
   } 
    @FindBy(xpath = "//button[normalize-space()='Save information']")
    private WebElement clickSaveInformation;

    public WebElement getclickSaveInformation(){
	return clickSaveInformation;
   } 
    @FindBy(xpath = "//a[normalize-space()='Services']")
    private WebElement clickServicesbutton;

    public WebElement getclickServicesbutton(){
	return clickServicesbutton;
   } 
    @FindBy(xpath = "//button[normalize-space()='Add Services']")
    private WebElement clickAddServicesbutton;

    public WebElement getclickAddServicesbutton(){
	return clickAddServicesbutton;
   } 
    @FindBy(xpath = "//select[@id='CodeTypeval']")
    private WebElement SelectCVXImmunization;

    public WebElement getSelectCVXImmunization(){
	return SelectCVXImmunization;
   }    
    @FindBy(xpath = "//input[@id='Codeval']")
    private WebElement EnterCode;

    public WebElement getEnterCode(){
	return EnterCode;
   }    
    @FindBy(xpath = "//input[@id='feesval']")
    private WebElement EnterFees;

    public WebElement getEnterFees(){
	return EnterFees;
   } 
    @FindBy(xpath = "//textarea[@id='descriptionval']")
    private WebElement EnterDescription;

    public WebElement getEnterDescription(){
	return EnterDescription;
   }  
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancelButton;

    public WebElement getClickCancelButton(){
	return ClickCancelButton;
   }   
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickSaveButton;

    public WebElement getClickSaveButton(){
	return ClickSaveButton;
   }   
    @FindBy(xpath = "//a[normalize-space()='Payer Search']")
    private WebElement ClickPayerSearch;

    public WebElement getClickPayerSearch(){
	return ClickPayerSearch;
   } 
    @FindBy(xpath = "//button[normalize-space()='New Payer']")
    private WebElement ClickNewPayer;

    public WebElement getClickNewPayer(){
	return ClickNewPayer;
   }  
    @FindBy(xpath = "//textarea[@name='payername']")
    private WebElement EnterPayerName;

    public WebElement getEnterPayerName(){
	return EnterPayerName;
   } 
    @FindBy(xpath = "//textarea[@name='payeraddress']")
    private WebElement EnterPayerAddress;

    public WebElement getEnterPayerAddress(){
	return EnterPayerAddress;
   }
    @FindBy(xpath = "//input[@name='payercity']")
    private WebElement EnterPayerCity;

    public WebElement getEnterPayerCity(){
	return EnterPayerCity;
   }
   
    @FindBy(xpath = "//select[@name='payerstate']")
    private WebElement SlectPayerState;

    public WebElement getSlectPayerState(){
	return SlectPayerState;
   }
      
    @FindBy(xpath = "//input[@name='payerzip']")
    private WebElement EnterPayerZIP;

    public WebElement getEnterPayerZIP(){
	return EnterPayerZIP;
   }
    
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement Clickclose;

    public WebElement getClickclose(){
	return Clickclose;
   }  
    
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSAVEButton;

    public WebElement getClickSAVEButton(){
	return ClickSAVEButton;
   }   
    
    @FindBy(xpath = "//a[normalize-space()='Lab']")
    private WebElement ClickLAB;

    public WebElement getClickLAB(){
	return ClickLAB;
   }  
    @FindBy(xpath = "//button[normalize-space()='Add New']")
    private WebElement ClickAddNew;

    public WebElement getClickAddNew(){
	return ClickAddNew;
   }  
     
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement EnterOrganisation;

    public WebElement getEnterOrganisation(){
	return EnterOrganisation;
   }   
    
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    private WebElement EnterPhone;

    public WebElement getEnterPhone(){
	return EnterPhone;
   }    
    
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    private WebElement EnterMobile;

    public WebElement getEnterMobile(){
	return EnterMobile;
   }  
    @FindBy(xpath = "(//input[@placeholder='mailaddress@domain.com'])[1]")
    private WebElement EnterEmail;

    public WebElement getEnterEmail(){
	return EnterEmail;
   }  
    
    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    private WebElement EnterAddress;

    public WebElement getEnterAddress(){
	return EnterAddress;
   }  
    
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    private WebElement EnterCity;

    public WebElement getEnterCity(){
	return EnterCity;
   }  
     
    @FindBy(xpath = "(//input[@placeholder='State/Country'])[1]")
    private WebElement EnterState;

    public WebElement getEnterState(){
	return EnterState;
   }
    @FindBy(xpath = "(//input[@class='form-control'])[8]")
    private WebElement EnterPINcode;

    public WebElement getEnterPINcode(){
	return EnterPINcode;
    } 
    
    @FindBy(xpath = "(//input[@class='form-control'])[9]")
    private WebElement EnterUPIN;

    public WebElement getEnterUPIN(){
	return EnterUPIN;
    }
    
    @FindBy(xpath = "(//input[@class='form-control'])[10]")
    private WebElement EnterNPI;

    public WebElement getEnterNPI(){
	return EnterNPI;
    }
    
    @FindBy(xpath = "(//input[@class='form-control'])[11]")
    private WebElement EnterTIN;

    public WebElement getEnterTIN(){
	return EnterTIN;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[12]")
    private WebElement EnterTaxonomy;

    public WebElement getEnterTaxonomy(){
	return EnterTaxonomy;
    } 
    
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancelButto;

    public WebElement getClickCancelButto(){
	return ClickCancelButto;
    } 
    
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSaveButto;

    public WebElement getClickSaveButto(){
	return ClickSaveButto;
    } 
    
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement ClickLabConfig;

    public WebElement getClickLabConfig(){
	return ClickLabConfig;
    }
    
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement CheckActiveRadiobutton;

    public WebElement getCheckActiveRadiobutton(){
	return CheckActiveRadiobutton;
    }
    
    @FindBy(xpath = "(//input[@placeholder='Enter Application Name'])[1]")
    private WebElement EnterApplicantname;

    public WebElement getEnterApplicantname(){
	return EnterApplicantname;
    }
    
    @FindBy(xpath = "(//input[@placeholder='Enter Facility Name'])[1]")
    private WebElement EnterFacilityname;

    public WebElement getEnterFacilityname(){
	return EnterFacilityname;
    }
    
    @FindBy(xpath = "(//input[@placeholder='Enter Application Name'])[2]")
    private WebElement EnterApplicantname1;

    public WebElement getEnterApplicantname1(){
	return EnterApplicantname1;
    }
    
    @FindBy(xpath = "(//input[@placeholder='Enter Facility Name'])[2]")
    private WebElement EnterFacilityname1;

    public WebElement getEnterFacilityname1(){
	return EnterFacilityname1;
    }
    
    @FindBy(xpath = "//select[@class='arrow-adj form-control']")
    private WebElement SelectProtocal;

    public WebElement getSelectProtocal(){
	return SelectProtocal;
    }
    
    @FindBy(xpath = "//input[@placeholder='Enter user Login Id']")
    private WebElement EnterLoginID;

    public WebElement getEnterLoginID(){
	return EnterLoginID;
    }
    @FindBy(xpath = "(//input[@type='text'])[7]")
    private WebElement EnterRemoteHost;

    public WebElement getEnterRemoteHost(){
	return EnterRemoteHost;
    }
    
    @FindBy(xpath = "(//input[@type='text'])[8]")
    private WebElement EnterResultPath;

    public WebElement getEnterResultPath(){
	return EnterResultPath;
    }  
    
    @FindBy(xpath = "(//input[@type='text'])[9]")
    private WebElement EnterOrdersPath;

    public WebElement getEnterOrdersPath(){
	return EnterOrdersPath;
    }
    
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancelButto1;

    public WebElement getClickCancelButto1(){
	return ClickCancelButto1;
    }  
    
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSaveButto1;

    public WebElement getClickSaveButto1(){
	return ClickSaveButto1;
    }
    
    @FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[8]")
    private WebElement ClickDelete;

    public WebElement getClickDelete(){
	return ClickDelete;
    }
    @FindBy(xpath = "//tbody/tr[2]/td[4]//*[name()='svg']//*[name()='path' and contains(@d,'M16.5 3.5a')]")
    private WebElement ClickEditButton;

    public WebElement getClickEditButton(){
	return ClickEditButton;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")
    private WebElement ClickCancel1Button;

    public WebElement getClickCancel1Button(){
	return ClickCancel1Button;
    }
  
}