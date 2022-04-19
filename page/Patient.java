package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient {
	public WebDriver driver;

	public Patient(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	
	@FindBy( xpath ="//body/div[@id='root']/div[1]/nav[1]/div[1]/a[2]")
  private WebElement patient1;

 public WebElement getpatient1() {
	return patient1;
  }	
//  
//  @FindBy( xpath ="//input[@placeholder='Search']")
//  private WebElement searchpatient;
//
//  public WebElement getsearchpatient() {
//	return searchpatient;
//  }
//	

	
    @FindBy(xpath = "//button[text()='Create New Client']")
    private WebElement createnewclient;

    public WebElement getcreatenewclient() {
	return createnewclient;
   }	
	@FindBy(xpath = "//input[@id='formGridEmail']")
    private WebElement typefirstname;

   public WebElement gettypefirstname() {
    	
	return typefirstname;	
	
    }
	@FindBy(xpath = "//input[@id='formGridPassword']")
    private WebElement typelastname;

    public WebElement gettypelastname() {
	return typelastname;
    }
	
     @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]")
    private WebElement typeemail;

    public WebElement sendtypeemail() {
	return typeemail;
	}
  
	
	
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/input[1]")
    private WebElement typephonenumber;

    public WebElement gettypephonenumber() {
	return typephonenumber;

    }
    
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    private WebElement cancel;

    public WebElement getcancel() {
	return cancel;
}
	
    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement save;

    public WebElement getsave() {
	return save;
}
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/label[1]/span[1]/span[1]/input[1]")
//    private WebElement allclients;
//
//    public WebElement getallclients() {
//	return allclients;
//}
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/label[2]/span[1]/span[1]/input[1]")
//    private WebElement myclients;
//
//    public WebElement getmyclients() {
//	return myclients;
//}
//    @FindBy(xpath = "//td[contains(text(),'golkondakarthi@gmail.com')]")
//    private WebElement text;
//
//    public WebElement gettext() {
//	return text;
    
//    @FindBy( xpath ="//input[@placeholder='Search']")
//  
//     private WebElement searchpatient;
//
//     public WebElement getsearchpatient() {
//	return searchpatient;
//     }

//    @FindBy(xpath = "//a[contains(text(),'Patient Flag Types')]")
//
//    private WebElement patientflagtype;
//
//    public WebElement getpatientflagtype() {
//	
//     return patientflagtype;
//}
//    @FindBy(xpath = "//button[@id='btn_selected']")
//
//    private WebElement addnewpatientflag;
//
//    public WebElement getaddnewpatientflag() {
//	
//     return addnewpatientflag;
//
//    }
//    @FindBy(xpath = "//input[@id='']")
//
//    private WebElement addpatientflagname;
//
//    public WebElement getaddpatientflagname() {
//	
//     return addpatientflagname;
//
//    }
//    @FindBy(xpath = "//button[contains(text(),'Save')]")
//
//    private WebElement saveflag;
//
//    public WebElement getsaveflag() {
//	
//     return saveflag;
//
//    }
//
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/div[3]/div[1]/div[1]/button[1]/span[1]")
//
//    private WebElement flagedit;
//
//    public WebElement getflagedit() {
//	
//     return flagedit;
//
//    }
//    
//    @FindBy(xpath = "//input[@id='']")
//
//    private WebElement flageditdone;
//
//    public WebElement getflageditdone() {
//	
//     return flageditdone;
//
//    }
//    @FindBy(xpath = "//button[contains(text(),'Save')]")
//
//    private WebElement flageditsave;
//
//    public WebElement getflageditsave() {
//	
//     return flageditsave;

    
    @FindBy( xpath ="//tbody/tr[3]/th[1]")

    private WebElement clickonRAMANclient;

    public WebElement getclickonRAMANclient() {
    return clickonRAMANclient;
}
    
    
    
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[4]")

    private WebElement clickaddpayment;

    public WebElement getclickaddpayment() {
    return clickaddpayment;
}
    @FindBy( xpath ="//input[@id='amountval']")

    private WebElement enteramount;

    public WebElement getenteramount() {
    return enteramount;
}
    @FindBy( xpath ="//button[contains(text(),'Add Payment')]")

    private WebElement clickaddpaymentbutton;

    public WebElement getclickaddpaymentbutton() {
    return clickaddpaymentbutton;
}
    @FindBy( xpath ="//span[contains(text(),'Edit')]")

    private WebElement clickedidinsurance;

    public WebElement getclickedidinsurance() {
    return clickedidinsurance;
}
    
    @FindBy( xpath ="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/button[1]/svg[1]/path[1]")

    private WebElement clickinsurancedropdown;

    public WebElement getclickinsurancedropdown() {
    return clickinsurancedropdown;
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[5]/div[1]/button[1]/*[1])")

    private WebElement clickImmunizationsdropdown;

    public WebElement getclickImmunizationsdropdown() {
    return clickImmunizationsdropdown;
    
    
    } 
    
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[7]/div[1]/button[1]/*[1]")

    private WebElement clickFamilyHistorydropdown;

    public WebElement  getclickFamilyHistorydropdown(){
    return clickFamilyHistorydropdown;
    
    
    } 
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[3]/div[9]/div[1]/button[1]/*[1]")

    private WebElement  Medicationdropdown;

    public WebElement  getclickMedicationdropdown(){
    return Medicationdropdown;
    }
   
    
//    } @FindBy( xpath ="//a[contains(text(),'Edit Profile')]")
//
//    private WebElement clickeditprofile;
//
//    public WebElement getclickeditprofile() {
//    return clickeditprofile;
//    
   // }
    @FindBy( xpath ="//button[@class='close-btn vitals-btn btn btn-light']")
    private WebElement clickVitals;

    public WebElement getclickVitals() {
    return clickVitals;
} 
    @FindBy( xpath ="//div[text()='Future Appointments']")

    private WebElement clickFutureAppointment;

    public WebElement getclickFutureAppointment() {
    return clickFutureAppointment;    
}
    @FindBy( xpath ="//div[text()='Past Appointments']")

    private WebElement clickPastAppointment;

    public WebElement getclickPastAppointment() {
    return clickPastAppointment;    
}
    @FindBy( xpath ="//div[text()='Problems']")

    private WebElement clickProblems;

    public WebElement getclickProblems() {
    return clickProblems;    
}
    @FindBy( xpath ="//div[text()='Allergies']")

    private WebElement clickAllergies;

    public WebElement getclickAllergies() {
    return clickAllergies;    
} 
    
    @FindBy( xpath ="//button[text()='Create Appointment']")

    private WebElement clickCreateAppointment;

    public WebElement getclickCreateAppointment() {
    return clickCreateAppointment;
     
}
    
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/input[1]\r\n")
    private WebElement clickenterPatient;
   
    public WebElement getenterPatient() {
    return clickenterPatient;  
}
    
    @FindBy( xpath ="//div[@id='6']")
    private WebElement clickenterPatientname;
   
    public WebElement getclickenterPatientname() {
    return clickenterPatientname;  
} 
    
    @FindBy( xpath ="//input[@placeholder='Select date']")
    private WebElement clickSelectDate;
   
    public WebElement getclickSelectDate() {
    return clickSelectDate;  
} 
    @FindBy( xpath ="//div[contains(text(),'11')]")
    private WebElement clickSelectTime;
   
    public WebElement getclickSelectTime() {
    return clickSelectTime;  
} 
    @FindBy( xpath =" //input[@id='new-app-all-day']")
    private WebElement clickAlldayEvent;
   
    public WebElement getclickAlldayEvent() {
    return clickAlldayEvent;  
} 
    
    @FindBy( xpath ="//div[contains(text(),'Search Provider')]")
    private WebElement clickSelectProvider;
   
    public WebElement getclickclickSelectProvider() {
    return clickSelectProvider;  
} 
    
    
    @FindBy( xpath ="//span[contains(text(),'freeadmin')]")
    private WebElement clickSelectProviderName;
   
    public WebElement getclickSelectProviderName() {
    return clickSelectProviderName;  
} 
    
    @FindBy( xpath =" //body/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/input[1]")
    private WebElement clickSelectProfile;
   
    public WebElement getclickSelectProfile() {
    return clickSelectProfile;  
} 
    @FindBy( xpath ="//span[contains(text(),'No Show')]")
    private WebElement clickSelectNoshow;
   
    public WebElement getclickSelkecttNoshow() {
    return clickSelectNoshow;  
} 
    
    @FindBy( xpath ="//div[text()='Office']")
    private WebElement clickoffice;
   
    public WebElement getclickoffice() {
    return clickoffice;  
} 
    
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[9]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]\r\n")
    private WebElement clickSelectTestFacilityphar;
   
    public WebElement getclickSelectTestFacilityphar() {
    return clickSelectTestFacilityphar;  
} 
    @FindBy( xpath ="//div[text()='Status']")
    private WebElement clickStatus;
   
    public WebElement getclickStatus() {
    return clickStatus;  
} 
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[10]/div[1]/div[2]/div[1]/div[2]/div[1]")
    private WebElement clickLeftVisit;
   
    public WebElement getclickLeftVisit() {
    return clickLeftVisit;  
} 
    @FindBy( xpath ="//button[contains(text(),'Cancel')]")
    private WebElement clickCancelButton;
   
    public WebElement getclickCancelButton() {
    return clickCancelButton;   
}
    @FindBy( xpath ="//button[contains(text(),'Save')]")
    private WebElement clickSaveButton;
   
    public WebElement getclickSaveButton() {
    return clickSaveButton;      
    }	
    @FindBy( xpath ="//a[text()='Edit Profile']")
    private WebElement clickEditProfile;
   
    public WebElement getclickEditProfile() {
    return clickEditProfile;      
    }
    @FindBy( xpath ="//span[@class='active-badge-pat badge badge-pill badge-success']")
    private WebElement clickActiveButoon;
   
    public WebElement getclickActiveButoon() {
    return clickActiveButoon;      
    }
    @FindBy( xpath ="//a[contains(text(),'Active')]")
    private WebElement clicktheActivebutton;
   
    public WebElement getclicktheActivebutton() {
    return clicktheActivebutton;      
    }
    @FindBy( xpath ="(//input[@class='form-control'])[1]")
    private WebElement EntertheFiestName;
   
    public WebElement getEntertheFiestName() {
    return EntertheFiestName;      
    }
    
    @FindBy( xpath ="(//input[@class='form-control'])[2]")
    private WebElement EntertheMiddleName;
   
    public WebElement getEntertheMiddleName() {
    return EntertheMiddleName;      
    } 
    @FindBy( xpath ="(//input[@class='form-control'])[3]")
    private WebElement EnterLastName;
   
    public WebElement getEntertheLastName() {
    return EnterLastName;      
    } 
    @FindBy( xpath ="(//input[@class='form-control'])[4]")
    private WebElement EnterSuffix;
   
    public WebElement getEnterSuffix() {
    return EnterSuffix;      
    }
    @FindBy( xpath ="(//input[@class='form-control'])[5]")
    private WebElement EnterSS;
   
    public WebElement getEnterSS() {
    return EnterSS;      
    }
    @FindBy( xpath ="(//input[@class='form-control'])[6]")
    private WebElement EntePhoneNumber;
   
    public WebElement getEntePhoneNumber() {
    return EntePhoneNumber;      
    }
    @FindBy( xpath ="//input[@id='voice_check_']")
    private WebElement ClickVoiceMessageFReminder;
   
    public WebElement getClickVoiceMessageFReminder() {
    return ClickVoiceMessageFReminder;      
    }
    
    ///////////////////////////////////////11/03/2022
    @FindBy( xpath ="//input[@id='textsms_check_']")
    private WebElement ClickTextMessageReminder;
   
    public WebElement getClickTextMessageReminder() {
    return ClickTextMessageReminder;      
    }
    @FindBy( xpath ="(//button[@class='btn btn-primary'])[1]")
    private WebElement ClickAddPhoneNumber;
   
    public WebElement getClickAddPhoneNumber() {
    return ClickAddPhoneNumber;      
    }
    @FindBy( xpath ="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[3]/div[1]/div[3]/div[1]/svg[1]/path[1]")
    private WebElement ClickAddPhoneNumberDelete;
   
    public WebElement getClickAddPhoneNumberDelete() {
    return ClickAddPhoneNumberDelete;      
    }
    @FindBy( xpath ="(//input[@class='form-control'])[7]")
    private WebElement EnterTheEmailID;
   
    public WebElement getEnterTheEmailID() {
    return EnterTheEmailID;      
    }
    @FindBy( xpath ="//input[@id='email_check_']")
    private WebElement ClickTheEmailIDRemainder;
   
    public WebElement getClickTheEmailIDRemainder() {
    return ClickTheEmailIDRemainder;      
    }
    @FindBy( xpath ="(//button[@class='btn btn-primary'])[2]")
    private WebElement ClickAddEmail;
   
    public WebElement getClickAddEmail() {
    return ClickAddEmail;      
    }
    @FindBy( xpath ="(//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[3]/div[1]/div[3]/div[1]/*[1]")
    private WebElement ClickDeleteAddEmail;
   
    public WebElement getClickDeleteAddEmail() {
    return ClickDeleteAddEmail;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
    private WebElement EnterStreetAddress;
   
    public WebElement getEnterStreetAddress() {
    return EnterStreetAddress;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/input[1]")
    private WebElement EnterCity;
   
    public WebElement getEnterCity() {
    return EnterCity;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/div[2]/div[1]/input[1]")
    private WebElement EnterState;
   
    public WebElement getEnterState() {
    return EnterState;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/div[3]/div[1]/input[1]")
    private WebElement EnterZIPCode;
   
    public WebElement getEnterZIPCode() {
    return EnterZIPCode;      
    }
    @FindBy( xpath ="//input[@id='patientinfodobval']")
    private WebElement EnterDOB;
   
    public WebElement getEnterDOB() {
    return EnterDOB;      
    }
    @FindBy( xpath ="//input[@id='patientinfodobval']")
    private WebElement SelectSex;
   
    public WebElement getSelectSex() {
    return SelectSex;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/select[1]/option[2]")
    private WebElement SelectFEMALE;
   
    public WebElement getSelectFEMALE() {
    return SelectFEMALE;      
    }
    @FindBy( xpath ="//select[@id='exampleForm.ControlSelect4']")
    private WebElement SelectMaritalStatus;
   
    public WebElement getSelectMaritalStatus() {
    return SelectMaritalStatus;      
    }
    @FindBy( xpath ="//option[contains(text(),'In a Relationship')]")
    private WebElement SelectInRelationship;
   
    public WebElement getSelectInRelationships() {
    return SelectInRelationship;      
    }
    
    @FindBy( xpath ="//select[@id='exampleForm.ControlSelect1']")
    private WebElement SelectPreferedLanguage;
   
    public WebElement getSelectPreferedLanguage() {
    return SelectPreferedLanguage;      
    }
    @FindBy( xpath ="//option[contains(text(),'English')]")
    private WebElement SelectLanguageEnglish;
   
    public WebElement getSelectLanguageEnglish() {
    return SelectLanguageEnglish;      
    }
    
    @FindBy( xpath ="//select[@id='exampleForm.ControlSelect2']")
    private WebElement SelectRace;
   
    public WebElement getSelectRace() {
    return SelectRace;      
    }
    @FindBy( xpath ="//option[contains(text(),'Asian')]")
    private WebElement SelectRaceAsian;
   
    public WebElement getSelectRaceAsian() {
    return SelectRaceAsian;      
    }
    @FindBy( xpath ="//select[@id='exampleForm.ControlSelect2']")
    private WebElement SelectEthnicity;
   
    public WebElement getSelectEthnicity() {
    return SelectEthnicity;      
    }
    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[3]/div[3]/div[1]/div[1]/select[1]/option[2]")
    private WebElement SelectEthnicityHispanicorLatino;
   
    public WebElement getSelectEthnicityHispanicorLatino() {
    return SelectEthnicityHispanicorLatino;      
    }
    @FindBy( xpath ="//button[contains(text(),'Cancel')]")
    private WebElement SelectCANCELbutton;
   
    public WebElement getSelectCANCELbutton() {
    return SelectCANCELbutton;      
    }
    @FindBy( xpath ="//button[contains(text(),'Save Patient')]")
    private WebElement SelectSAVEbutton;
   
    public WebElement getSelectSAVEbutton() {
    return SelectSAVEbutton;      
    }
    
    @FindBy( xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement clickInsuranceButton;
   
    public WebElement getclickInsuranceButton() {
    return clickInsuranceButton;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[1]")
    private WebElement clickPrimaryInsurance;
   
    public WebElement getclickPrimaryInsurance() {
    return clickPrimaryInsurance;      
    }
    @FindBy( xpath ="(//input[@class='ant-radio-input'])[2]")
    private WebElement clickSecondaryInsurance;
   
    public WebElement getclickSecondaryInsurance() {
    return clickSecondaryInsurance;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[3]")
    private WebElement clickTertiaryInsurance;
   
    public WebElement getclickTertiaryInsurance() {
    return clickTertiaryInsurance;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[4]")
    private WebElement clickSelf;
   
    public WebElement getclickSelf() {
    return clickSelf;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[5]")
    private WebElement ClientsSpouse;
   
    public WebElement getClientsSpouse() {
    return ClientsSpouse;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[6]")
    private WebElement ClientsParent;
   
    public WebElement getClientsParent() {
    return ClientsParent;      
    }
    @FindBy( xpath ="//input[@class='ant-radio-input'])[7]")
    private WebElement ClickOtherts;
   
    public WebElement getClickOtherts() {
    return ClickOtherts;      
    }
    @FindBy( xpath ="(//select[@class='arrow-adj form-control'])[1]")
    private WebElement ClickInsurancePlayer;
   
    public WebElement getClickInsurancePlayer() {
    return ClickInsurancePlayer;      
    }
    @FindBy( xpath ="//option[contains(text(),'UNITED HEALTHCARE')]")
    private WebElement ClickUnitedHealthcare;
   
    public WebElement getClickUnitedHealthcare() {
    return ClickUnitedHealthcare;      
    } 
    @FindBy( xpath ="(//input[@name='memberid'])[1]")
    private WebElement EnterMemberID;
   
    public WebElement getEnterMemberID() {
    return EnterMemberID;      
    } 
    @FindBy( xpath ="(//input[@name='planid'])[1]")
    private WebElement EnterPlanID;
   
    public WebElement getEnterPlanID() {
    return EnterPlanID;      
    }
    @FindBy( xpath ="(//input[@name='groupid'])[1]")
    private WebElement EnterGroupId;
   
    public WebElement getEnterGroupId() {
    return EnterGroupId;      
    }
    @FindBy( xpath ="(//input[@name='copay'])[1]")
    private WebElement EnterCopay;
   
    public WebElement getEnterCopay() {
    return EnterCopay;      
    }
    @FindBy( xpath ="(//input[@name='superbills'])[1]")
    private WebElement EnterForSuperbils;
   
    public WebElement getEnterForSuperbils() {
    return EnterForSuperbils;      
    }
    @FindBy( xpath ="(//input[@name='dedictible'])[1]")
    private WebElement EnterDeductible;
   
    public WebElement getEnterDeductible() {
    return EnterDeductible;      
    }
    @FindBy( xpath ="//input[@name='inspayerphone']")
    private WebElement EnterInsPayerPhone;
   
    public WebElement getEnterInsPayerPhone() {
    return EnterInsPayerPhone;      
    }
    @FindBy( xpath ="//input[@name='inspayerfax']")
    private WebElement EnterInsPayerFax;
   
    public WebElement getEnterInsPayerFax() {
    return EnterInsPayerFax;      
    }
    @FindBy( xpath ="//input[@name='emplschool']")
    private WebElement EnterEmployerSchool;
   
    public WebElement getEnterEmployerSchool() {
    return EnterEmployerSchool;      
    }
    @FindBy( xpath ="(//button[text()='Cancel'])[2]")
    private WebElement ClickCancel;
   
    public WebElement getClickCancel() {
    return ClickCancel;      
    }
    @FindBy( xpath ="(//button[text()='Save Patient'])[2]")
    private WebElement ClickSave;
   
    public WebElement getClickSave() {
    return ClickSave;      
    }
    
    
//CONTACTS
    @FindBy( xpath ="//div[text()='Contacts']")
    private WebElement ClickContacts;
   
    public WebElement getClickContacts() {
    return ClickContacts;      
    }
    @FindBy( xpath ="//button[@id='Dropdown-basic4']")
    private WebElement ClickAddContacts;
   
    public WebElement getClickAddContacts() {
    return ClickAddContacts;      
    }
    @FindBy( xpath ="//input[@id='contactfname']")
    private WebElement EnterContactFirstName;
   
    public WebElement getEnterContactFirstName() {
    return EnterContactFirstName;      
    }
    @FindBy( xpath ="//input[@id='contactmname']")
    private WebElement EnterContactMiddleName;
   
    public WebElement getEnterContactMiddleName() {
    return EnterContactMiddleName;      
    }
    @FindBy( xpath ="//input[@id='contactlname']")
    private WebElement EnterContactLastName;
   
    public WebElement getEnterContactLastName() {
    return EnterContactLastName;      
    }
    @FindBy( xpath ="//select[@id='contactsuffix']")
    private WebElement ClickSuffix;
   
    public WebElement getClickSuffix() {
    return ClickSuffix;      
    }
    @FindBy( xpath ="//option[text()='Mr']")
    private WebElement ClickMr;
   
    public WebElement getClickMr() {
    return ClickSuffix;      
    }
    @FindBy( xpath ="//option[text()='Mr']")
    private WebElement EnterPreferedname;
   
    public WebElement getEnterPreferedname() {
    return EnterPreferedname;      
    }
    @FindBy( xpath ="(//input[@type='checkbox'])[4]")
    private WebElement ClickEmergencyContact;
   
    public WebElement getClickEmergencyContact() {
    return ClickEmergencyContact;      
    }
    @FindBy( xpath ="(//input[@name='phone'])[2]")
    private WebElement EnterPhoneNumber ;
   
    public WebElement getEnterPhoneNumber() {
    return EnterPhoneNumber;      
    }
    @FindBy( xpath ="(//select[@name='type'])[3]")
    private WebElement ClickMobileOption ;
   
    public WebElement getClickMobileOptionr() {
    return ClickMobileOption;      
    }
    @FindBy( xpath ="//option[text()='Mobile']")
    private WebElement SelectMobile;
   
    public WebElement getSelectMobile() {
    return SelectMobile;      
    }
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[3]/div[2]/button[1]")
    private WebElement SelectAddPhoneOption;
   
    public WebElement getSelectAddPhoneOption() {
    return SelectAddPhoneOption;      
    }
    @FindBy( xpath ="(//input[@placeholder='Enter phone number'])[3]")
    private WebElement EnterAddPhoneNumber;
   
    public WebElement getEnterAddPhoneNumber() {
    return EnterAddPhoneNumber;      
    }
    @FindBy( xpath ="(//select[@name='type'])[3]")
    private WebElement clickmobiledropdown;
   
    public WebElement getclickmobiledropdown() {
    return clickmobiledropdown;      
    }
    @FindBy( xpath ="(//select[@name='type'])[3]")
    private WebElement selectWORKoption;
   
    public WebElement getselectWORKoption() {
    return selectWORKoption;      
    }
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[4]/div[1]/div[3]/div[1]/*[1]")
    private WebElement selectdeleteoption;
   
    public WebElement getselectdeleteoption() {
    return selectdeleteoption;      
    }
    @FindBy( xpath ="(//input[@name='email'])[2]")
    private WebElement EnterEmail;
   
    public WebElement getEnterEmail() {
    return EnterEmail;      
    }
    @FindBy( xpath ="(//select[@name='type'])[3]")
    private WebElement clickWorkBotton;
   
    public WebElement getclickWorkBotton() {
    return clickWorkBotton;      
    }
    @FindBy( xpath ="(//option[@value='contact'])[2]")
    private WebElement selectcontact;
   
    public WebElement getselectcontact() {
    return selectcontact;      
    }
    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[3]/div[2]/button[1]\r\n")
    private WebElement ClickAddButton;
   
    public WebElement getClickAddButton() {
    return ClickAddButton;      
    }
    @FindBy( xpath ="(//input[@name='email'])[3]")
    private WebElement Enterphonenumer;
   
    public WebElement getEnterphonenumber2() {
    return Enterphonenumer;      
    }
    @FindBy( xpath ="(//input[@name='email'])[3]")
    private WebElement clickHomeBotton;
   
    public WebElement getclickHomeBotton() {
    return clickHomeBotton;      
    }
    @FindBy( xpath ="(//option[text()='Home'])[4]")
    private WebElement selectHome;
   
    public WebElement getselectHome() {
    return selectHome;      
    }
    @FindBy( xpath ="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[4]/div[1]/div[3]/div[1]/svg[1]/path[1]")
    private WebElement clickDeleteButton;
   
    public WebElement getclickDeleteButton() {
    return clickDeleteButton;      
    }
    @FindBy( xpath ="//input[@id='contactstreet']")
    private WebElement EnterStreetname;
   
    public WebElement getEnterStreetname() {
    return EnterStreetname;      
    }
    @FindBy( xpath ="//input[@id='contactcity']")
    private WebElement EnterCityname;
   
    public WebElement getEnterCityname() {
    return EnterCityname;      
    }
    @FindBy( xpath ="//select[@id='contactstate']")
    private WebElement ClickStatename;
   
    public WebElement getClickStatename() {
    return ClickStatename;      
    }
    @FindBy( xpath ="//option[contains(text(),'California')]")
    private WebElement SelectCalifornia;
   
    public WebElement getSelectCalifornia() {
    return SelectCalifornia;      
    }
    @FindBy( xpath ="//input[@id='contactzip']")
    private WebElement EnterZIPCode1;
   
    public WebElement getEnterZIPCode1() {
    return EnterZIPCode1;      
    }
    @FindBy( xpath ="//textarea[@id='contactnotes']")
    private WebElement EnterNotes;
   
    public WebElement getEnterNotes() {
    return EnterNotes;      
    }
    @FindBy( xpath ="(//button[text()='Cancel'])[2]")
    private WebElement ClickCancel1;
   
    public WebElement getClickCancel1() {
    return ClickCancel1;      
    }
    @FindBy( xpath ="(//button[text()='Save'])")
    private WebElement ClickCSAVE1;
   
    public WebElement getClickCSAVE1() {
    return ClickCSAVE1;      
    }
  
  //Patient Flag Type  
    
    
    
    
    @FindBy( xpath ="//a[contains(text(),'Patient Flag Types')]")
    private WebElement PatientFlagType;
   
    public WebElement getPatientFlagType() {
    return PatientFlagType;      
    } 
//    @FindBy( xpath ="//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]")
//    private WebElement ClickSort1;
//   
//    public WebElement getClickSort1() {
//    return ClickSort1;      
//    } 
//    @FindBy( xpath ="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/svg[1]/path[1]")
//    private WebElement ClickSort2;
//   
//    public WebElement getClickSort2() {
//    return ClickSort2;      
//    } 
    @FindBy( xpath ="//button[@id='btn_selected']")
    private WebElement ClickAddNewPatientFlag;
   
    public WebElement getClickAddNewPatientFlag() {
    return ClickAddNewPatientFlag;      
    } 
    @FindBy( xpath ="//input[@name='patientflag']")
    private WebElement EnterName;
   
    public WebElement getEnterName() {
    return EnterName;      
    }
    @FindBy( xpath ="//input[@type='color']")
    private WebElement ClickColour;
   
    public WebElement getSelectColour() {
    return ClickColour;      
    }
    @FindBy( xpath ="//button[contains(text(),'Cancel')]")
    private WebElement ClickCancel2;
   
    public WebElement getClickCancel2() {
    return ClickCancel2;      
    }
    @FindBy( xpath ="//button[contains(text(),'Save')]")
    private WebElement ClickSAVE2;
   
    public WebElement getClickSAVE2() {
    return ClickSAVE2;      
    }
 
    
    //PATIENT EDUCATION
    
    @FindBy( xpath ="//a[contains(text(),'Patient Education')]")
    private WebElement ClickPatientEducation;
   
    public WebElement getClickPatientEducation() {
    return ClickPatientEducation;      
    }
    @FindBy( xpath ="//input[@id='privatecheck']")
    private WebElement ClickPatientRadiobutton;
   
    public WebElement getClickPatientRadiobutton() {
    return ClickPatientRadiobutton;      
    }
    @FindBy( xpath ="//input[@id='privategroupcheck']")
    private WebElement ClickPatientgroupbutton;
   
    public WebElement getClickPatientgroupbutton() {
    return ClickPatientgroupbutton;      
    }
    
    @FindBy( xpath ="//input[@id='publiccheck']")
    private WebElement ClickPublicbutton;
   
    public WebElement getClickPublicbutton() {
    return ClickPublicbutton;      
    }
    
    
//    
//    @FindBy( xpath ="//input[@id='privatecheck']")
//    private WebElement ClickPatientRadiobutton1;
//   
//    public WebElement getClickPatientRadiobutton1() {
//    return ClickPatientRadiobutton1;      
//    }
    
    
    
    
    @FindBy( xpath ="//input[@placeholder='Search for Form']")
    private WebElement SearchforForm;
   
    public WebElement getSearchforForm() {
    return SearchforForm;      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
