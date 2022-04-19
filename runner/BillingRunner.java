package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class BillingRunner extends Base_class{
	

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);
	

public static void main(String[] args)  throws InterruptedException {
	
	geturl("https://ehr.vozo.xyz:444/");

	// Enter Username
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	sendkeys(pom.getinstance().getUsername(), "tech1");

	// Enter Password

	sendkeys(pom.getinstance().getPassword(), "capminds@03");

	// Click Signin Button '

	Clickonelement(pom.getinstance().getSigninbtn());

	// Click On Month Option

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	// click Billing Module
	Clickonelement(pom.getBilling().getClickBillingModule());

	
	
	//////////      Insurance claim        //////////////////
	
	
	
	
	//Enter client name
	sendkeys(pom.getBilling().getEnterclientname(), "dineshvarma");
	
	//Enter Payer name
	sendkeys(pom.getBilling().getEnterPayername(), "UNITED HEALTHCARE");
	
	//select UNITED HEALTHCARE
	Clickonelement(pom.getBilling().getSelectUNITEDHEALTHCARE());
		
	//click Office drop down
	Clickonelement(pom.getBilling().getClickOfficeDropdown());
	
	//select Test facility phar
	Clickonelement(pom.getBilling().getSelectTestFacilityPhar());
	
	//click Billing status
	Clickonelement(pom.getBilling().getClickByBillingStatus());
	
	// select Paid In full 
	Clickonelement(pom.getBilling().getSelectPaidInFull());
	
	//click By claim status
	Clickonelement(pom.getBilling().getClickByClaimStatus());
	
	//select claimed option
	Clickonelement(pom.getBilling().getselectClaimed());
		
	//click date
	Clickonelement(pom.getBilling().getclickdate());
	
	//select Start date
	Clickonelement(pom.getBilling().getselectStartDate());
	
	//select End date
	Clickonelement(pom.getBilling().getselectEndDate());
		
	//Click the Search button
	Clickonelement(pom.getBilling().getClickSearchButton());
		
	//Click Generate form button
	Clickonelement(pom.getBilling().getClickGenerateFormButton());
	
	//Click HCFA(PDF)
	Clickonelement(pom.getBilling().getClickHCPAPDF());
	
	// Click Validate Only
	Clickonelement(pom.getBilling().getClickValidateOnly());
	
	// Click Close button
	Clickonelement(pom.getBilling().getClickClose());
	
	
		
       //////////////////////   Patient balance /ledger        //////////////	
	
	
    // click On Insurance claim 
	Clickonelement(pom.getBilling().getclickInsuranceClaim());
	
	// click Patient balance Ledger
	Clickonelement(pom.getBilling().getClickPatientBalanceLedger());
	
	//Enter client name
	sendkeys(pom.getBilling().getEnterClientName(), "John");
	
	// click select john peter
	Clickonelement(pom.getBilling().getSelectJonPeter());
	
	
	// click top on Patient balance Ledger details 
	Clickonelement(pom.getBilling().getclickledger());
		
	// click Billing Module
		Clickonelement(pom.getBilling().getClickBillingModule());
		
		//click date
		Clickonelement(pom.getBilling().getclickdate());
		
		//select Start date
		Clickonelement(pom.getBilling().getselectStartDate());
		
		//select End date
		Clickonelement(pom.getBilling().getselectEndDate());
			
		//Click the Search button
		Clickonelement(pom.getBilling().getClickSearchButton());
			
		 // click On Insurance claim 
		Clickonelement(pom.getBilling().getclickInsuranceClaim());
			
		// click Patient balance Ledger
		Clickonelement(pom.getBilling().getClickPatientBalanceLedger());
			
			
		/////////////////////  FEES SCHEDULE   ////////////////////////////
			
			
		////ICD9
			
		Thread.sleep(6000);
			
		// Click Fees Schedule
		Clickonelement(pom.getBilling().getclickFeesSchedule());
		
		Thread.sleep(6000);
		
		// Click ICD 9
		Clickonelement(pom.getBilling().getclickICD9());
		
		//enter ICD code
		sendkeys(pom.getBilling().getEnterICDCode(), "670");
		
		Thread.sleep(4000);

		// Select ICD code
		Clickonelement(pom.getBilling().getSelectICDCode());
		
		//enter Pick list
		sendkeys(pom.getBilling().getEnterPickList(), "White");
		
		// Select Orange pick list
		Clickonelement(pom.getBilling().getSelecWhite());
		
		// Click Update
		Clickonelement(pom.getBilling().getClickUpdate());
		
		// Click Edit option
		Clickonelement(pom.getBilling().getClickEDit());
		
//		//select ICD 9
//	    Selectone(pom.getBilling().getselectCodeType1(),"ICD-9" );
	//    
//	    //Clear Codes
//	    ClearText(pom.getBilling().getclearcode()); 
	//    
	//  //enter Pick list
//	  	sendkeys(pom.getBilling().getEntercode(), "670.0");
		
		
		Thread.sleep(4000);
		
		// Click Edit option
		Clickonelement(pom.getBilling().getClickCancel());
				
		// Click Add New Option
		Clickonelement(pom.getBilling().getClickAddNew());
		
		// Click in code type
		Clickonelement(pom.getBilling().getClickCodeType());
			
		// select Code Type
		Clickonelement(pom.getBilling().getSelectCodeType());
					
		//enter Pick list
		sendkeys(pom.getBilling().getEnterCode(), "6");
		
		// select Enter Code 
		Clickonelement(pom.getBilling().getSelectEnterCode());
		
		//click in  office
		Clickonelement(pom.getBilling().getClickOffice());
		
		//Select Test Facility Phar
		Clickonelement(pom.getBilling().getSelectTestFacilityPhar1());
		
		//enter Custom description
		sendkeys(pom.getBilling().getEnterDescription(), "Fever");
		
		//enter Pick list category
		sendkeys(pom.getBilling().getEnterPicklistCategory(), "Normal check up");
		
		//Select Cancel
//		Clickonelement(pom.getBilling().getClickCancel1());
		
		//Select Save
		Clickonelement(pom.getBilling().getClicksave());
		
		
		       /////////////////    ICD 10     ///////////////////
		
		Thread.sleep(6000);
		
		//Click ICD 10
		Clickonelement(pom.getBilling().getClickICD10());
		
		//enter TCD 10 CODE
		sendkeys(pom.getBilling().getEnterICD10(), "40");
			
		//Select ICD code
		Clickonelement(pom.getBilling().getSelectICD10());
		
		//Enter PickList
		sendkeys(pom.getBilling().getEnterPickList1(), "Rose");
		
		//Select ICD code
		Clickonelement(pom.getBilling().getSelectRose());
			
		//Select Update Button
		Clickonelement(pom.getBilling().getSelectUpdate());
		
		Thread.sleep(3000);
		
		//Click Edit
		Clickonelement(pom.getBilling().getClickEdit());
			
		//Click Cancel
		Clickonelement(pom.getBilling().getClickCancel2());
		Thread.sleep(3000);
			
		//Click Add new  Button
		Clickonelement(pom.getBilling().getClickaddNew());
			
		//Click Cod type
		Clickonelement(pom.getBilling().getClickcodeType());
		
		//Click select code type
		Clickonelement(pom.getBilling().getSelectcodeType());
				
		//Enter Code
		sendkeys(pom.getBilling().getClickCode(), "5");
		
		//select code type
		Clickonelement(pom.getBilling().getSelectCode());
					
		//Click Office
		Clickonelement(pom.getBilling().getClickoffice());
					
		//select code type
		Clickonelement(pom.getBilling().getselectTestfacilityphar());
		
		//Enter Code description
		sendkeys(pom.getBilling().getEnterCodeDescription(), "Normal");
		
		//Enter Code description
		sendkeys(pom.getBilling().getEnterPicklistcategory(), "Normality ");
		
		//select code type
		Clickonelement(pom.getBilling().getClickSave());
			
		//select code type
		//Clickonelement(pom.getBilling().getClickCance());	
			
			
			
	           /////////////////      EOB  Add Payment        ///////////////////
		
			
		// Click EOB
		Clickonelement(pom.getBilling().getClickEOB());	
			
		// Click Add Payment
		Clickonelement(pom.getBilling().getClickAddPyment());	
				
		// Click date
		Clickonelement(pom.getBilling().getClickDate());	
		
		// Click Select Date
		Clickonelement(pom.getBilling().getSelectDate());	
		
		// Click Payer
		Clickonelement(pom.getBilling().getClickPayer());	

		// Click United Health care
		Clickonelement(pom.getBilling().getSelectUnitedHealth());	
			
		// Click SelectPaymentMethod
		Clickonelement(pom.getBilling().getSelectPaymentMethod());	
		
		// Click Authorize.net
		Clickonelement(pom.getBilling().getSelectAutorize());	
			
		//Enter Payment Number
		sendkeys(pom.getBilling().getEnterPaymentNumber(), "45767888 ");
		
		//Enter Amount
		sendkeys(pom.getBilling().getEnterAmount(), "1000");
		
		// Click Save button
		Clickonelement(pom.getBilling().getSelectSave());	
		
		// Click Cancel button
		Clickonelement(pom.getBilling().getSelectCancel());	
		

	
	
}

}
