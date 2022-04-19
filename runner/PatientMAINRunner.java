package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class PatientMAINRunner extends Base_class{
	
	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// Click On Month Option

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		Clickonelement(pom.getPatient().getpatient1());
		
     	//sendkeys(pom.getPatient().getsearchpatient(), "xyz");
		
     	//Clickonelement(pom.getPatient().getsearchpatient());
     	
	Clickonelement(pom.getPatient().getcreatenewclient());

	sendkeys(pom.getPatient().gettypefirstname(), "raman");
	
	sendkeys(pom.getPatient().gettypelastname(), "k");

	sendkeys(pom.getPatient().sendtypeemail(), "xyz@gmail.com");

	sendkeys(pom.getPatient().gettypephonenumber(), "909090890");
	Clickonelement(pom.getPatient(). getcancel());
	
	//Clickonelement(pom.getPatient().getsave());
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//sendkeys(pom.getPatient().getsearchpatient(), "xyz");
	
 	//Clickonelement(pom.getPatient().getsearchpatient());
	
//	Clickonelement(pom.getPatient(). getpatientflagtype());
//	
//	
//	Clickonelement(pom.getPatient(). getaddnewpatientflag());
//	
//	sendkeys(pom.getPatient().getaddpatientflagname(), "corona");
//	
//	Clickonelement(pom.getPatient().getsaveflag());
//	
//	Clickonelement(pom.getPatient().getflagedit());
//	
//	sendkeys(pom.getPatient().getflageditdone(), "appendix");
//	Clickonelement(pom.getPatient().getflageditsave());
	Thread.sleep(2000);
	Clickonelement(pom.getPatient().getclickonRAMANclient());
	
	Thread.sleep(2000);
	
	Clickonelement(pom.getPatient().getclickaddpayment());
	
	sendkeys(pom.getPatient().getenteramount(), "20000");
	
	Clickonelement(pom.getPatient().getclickaddpaymentbutton());
	
//	Clickonelement(pom.getPatient().getclickedidinsurance());
//	
//	Clickonelement(pom.getPatient().getclickinsurancedropdown());
//	
//	Clickonelement(pom.getPatient().getclickImmunizationsdropdown());
//	
//	Clickonelement(pom.getPatient().getclickFamilyHistorydropdown());
//	
//	
//	Clickonelement(pom.getPatient().getclickMedicationdropdown());
//	
//	Clickonelement(pom.getPatient().getclickeditprofile());
//	
//	Clickonelement(pom.getPatient().getclickVitals());
	
	//Click Future Appointment
	Clickonelement(pom.getPatient().getclickFutureAppointment());
	
	//click past appointment
	Clickonelement(pom.getPatient().getclickPastAppointment());

	//click past Problems
	Clickonelement(pom.getPatient().getclickProblems());


	//click past Allergies
	Clickonelement(pom.getPatient().getclickAllergies());
	Thread.sleep(2000);
	
	Clickonelement(pom.getPatient().getclickCreateAppointment());
	
	Clickonelement(pom.getPatient().getenterPatient());
	
	Clickonelement(pom.getPatient().getclickenterPatientname());
	
	Clickonelement(pom.getPatient().getclickenterPatientname());
	
	Clickonelement(pom.getPatient().getclickSelectDate());
	
	Clickonelement(pom.getPatient().getclickSelectTime());
	
	Clickonelement(pom.getPatient().getclickAlldayEvent());

	Clickonelement(pom.getPatient().getclickclickSelectProvider());
	
	Clickonelement(pom.getPatient().getclickSelectProviderName());
	
	Clickonelement(pom.getPatient().getclickSelectProfile());
	
	Clickonelement(pom.getPatient().getclickSelkecttNoshow());
	
	Clickonelement(pom.getPatient().getclickoffice());
	
	//Select Test Facility Phar
	Clickonelement(pom.getPatient().getclickSelectTestFacilityphar());
	//click status
	
	Clickonelement(pom.getPatient().getclickStatus());
	//select LeftVisit
  
	Clickonelement(pom.getPatient().getclickLeftVisit());
     //click cancel button
	Clickonelement(pom.getPatient().getclickCancelButton());
	//click save button

	Clickonelement(pom.getPatient().getclickSaveButton());
	
	//click the Edit Button
	
	Clickonelement(pom.getPatient().getclickEditProfile());
	
	//click the Active Button
	Clickonelement(pom.getPatient().getclickActiveButoon());
	
	Clickonelement(pom.getPatient().getclicktheActivebutton());
	
	//Enter the First name
	
	sendkeys(pom.getPatient().getEntertheFiestName(), "RAJANRA");
	
	//Enter Middle Name
	sendkeys(pom.getPatient().getEntertheMiddleName(), "Balamurugan");
	//Enter Middle Name
	sendkeys(pom.getPatient().getEntertheLastName(), "Ba");
	
	//Enter Suffix
	sendkeys(pom.getPatient().getEnterSuffix(), "B");
	
	//Enter SS
	sendkeys(pom.getPatient().getEnterSS(), "t");
	
	//Enter Phone Number
	sendkeys(pom.getPatient().getEntePhoneNumber(), "8989898989");
	
	//Click VoiceMessageFReminder
	Clickonelement(pom.getPatient().getClickVoiceMessageFReminder());
	
	//Click Text Message Reminder
	Clickonelement(pom.getPatient().getClickTextMessageReminder());
	
	//click addphonenumber
	Clickonelement(pom.getPatient().getClickAddPhoneNumber());
			
	//Delete Add PhoneNumber Button
	Clickonelement(pom.getPatient().getClickAddPhoneNumberDelete());
			
	//Delete Add PhoneNumber Button
	sendkeys(pom.getPatient().getEnterTheEmailID(),"abc123@gmail.com");
			
	
	
	//Click Email Remainder
	Clickonelement(pom.getPatient().getClickTheEmailIDRemainder());

	//Click the Add Email
	Clickonelement(pom.getPatient().getClickAddEmail());
			
	 //Click the Delete Add Email
	Clickonelement(pom.getPatient().getClickDeleteAddEmail());
		

	   //Enter Street Address
		sendkeys(pom.getPatient().getEnterStreetAddress(), "Northstreet");
		
		
		//Enter City 
		sendkeys(pom.getPatient().getEnterCity(), "Erode");
		
		//Enter State
		sendkeys(pom.getPatient().getEnterState(), "TAMILNADU");
		
		//Enter ZIP Code
		sendkeys(pom.getPatient().getEnterZIPCode(), "638007");
		//EnterDOB
		Clickonelement(pom.getPatient().getEnterDOB());
		
		//Select SEX
		Clickonelement(pom.getPatient().getSelectSex());
		
		//Select FEMALE in SEX field
		Clickonelement(pom.getPatient().getSelectFEMALE());
		
		//Select Marital Status
		Clickonelement(pom.getPatient().getSelectMaritalStatus());
		
		
		//Select In Relationship
		Clickonelement(pom.getPatient().getSelectInRelationships());
				
		//Select prefered Language
		Clickonelement(pom.getPatient().getSelectPreferedLanguage());
				
		//Select Language English
		Clickonelement(pom.getPatient().getSelectLanguageEnglish());
				
		//Select Race
		Clickonelement(pom.getPatient().getSelectRace());
		
		//Select Race
		Clickonelement(pom.getPatient().getSelectRaceAsian());
		
		//Select Ethnicity
		Clickonelement(pom.getPatient().getSelectEthnicity());
		
		//Select Ethnicity
		Clickonelement(pom.getPatient().getSelectEthnicityHispanicorLatino());
		
		//CANCEL Button
		Clickonelement(pom.getPatient().getSelectCANCELbutton());
		
		//Save Button
		Clickonelement(pom.getPatient().getSelectSAVEbutton());
		
	
		//Click Insurance Button
				Clickonelement(pom.getPatient().getclickInsuranceButton());
				
				
				
				//click Primary Insurance
				Clickonelement(pom.getPatient().getclickPrimaryInsurance());
				
				//click Secondary Insurance
				Clickonelement(pom.getPatient().getclickSecondaryInsurance());
						
				//click Teritiary Insurance
				Clickonelement(pom.getPatient().getclickTertiaryInsurance());
								
				//click Self
				Clickonelement(pom.getPatient().getclickSelf());
										
				//click ClientsSpouse
				Clickonelement(pom.getPatient().getClientsSpouse());
												
				//click Clients Parent
				Clickonelement(pom.getPatient().getClientsParent());
												
				//click Oters
				Clickonelement(pom.getPatient().getClickOtherts());				
				
				//Click Insurance Player
				Clickonelement(pom.getPatient().getClickInsurancePlayer());				
				
				//Click unitedHeathcare in Insurance Player
				Clickonelement(pom.getPatient().getClickUnitedHealthcare());				
				
				//Enter Plan Id
				sendkeys(pom.getPatient().getEnterMemberID(), "13245");

				//Enter Plan Id
				sendkeys(pom.getPatient().getEnterPlanID(), "234234");
				
				//Enter Group ID
				sendkeys(pom.getPatient().getEnterGroupId(), "4234");
						
				//Enter Copay
			    sendkeys(pom.getPatient().getEnterCopay(), "34");
				
			  //Enter For SuperBills
			    sendkeys(pom.getPatient().getEnterForSuperbils(), "55");
				
			    //Enter For SuperBills
			    sendkeys(pom.getPatient().getEnterDeductible(), "90");
				
			    //Enter Insurance Payer Phone
			    sendkeys(pom.getPatient().getEnterInsPayerPhone(), "9090909090");
				
			    //Enter Insurance Payer Fax
			    sendkeys(pom.getPatient().getEnterInsPayerFax(), "80808080");
				
			  //Enter Employer/School
			    sendkeys(pom.getPatient().getEnterEmployerSchool(), "SCHOOL");
				
				//Click Cancel
				Clickonelement(pom.getPatient().getClickCancel());
				
				//Click Save
				Clickonelement(pom.getPatient().getClickSave());

		//CONTACTS	
				
				//ClickContacts
				Clickonelement(pom.getPatient().getClickContacts());
				
				//Click Add Contacts    
			    Clickonelement(pom.getPatient().getClickAddContacts());
			
			    //Enter Contact First name
			    sendkeys(pom.getPatient().getEnterContactMiddleName(), "murugan");
			
			    //Enter Contact Middle name
			    sendkeys(pom.getPatient().getEnterContactMiddleName(), "Ramu");
			
			    //Enter Contact Last name
			    sendkeys(pom.getPatient().getEnterContactLastName(), "k");
			
			    //ClickSuffix
			  	Clickonelement(pom.getPatient().getClickSuffix());
			  		
			    //Select Mr in Suffix
			  	Clickonelement(pom.getPatient().getClickMr());
			
			    //Enter Preferred name
			  	sendkeys(pom.getPatient().getEnterPreferedname(), "j");
				
			  //Select Emergency Contact
			  	Clickonelement(pom.getPatient().getClickEmergencyContact());

			    //Enter Phone Number
			  	sendkeys(pom.getPatient().getEnterPhoneNumber(), "987654321");
				
			  	 //Click Mobile Option
			  	Clickonelement(pom.getPatient().getClickMobileOptionr());

			  	//Select Mobile
			  	Clickonelement(pom.getPatient().getSelectMobile());
			
				//Select Add Phone button
			  	Clickonelement(pom.getPatient().getSelectAddPhoneOption());
			  	
			  //Enter Add Phone Number
			  	sendkeys(pom.getPatient().getEnterAddPhoneNumber(), "987654320");
			  	
				// click mobile dropdown
			  	Clickonelement(pom.getPatient().getclickmobiledropdown());
			  	
				//Select selectWORKoption in dropdown
			  	Clickonelement(pom.getPatient().getselectWORKoption());
			  	
			  //Select select delete option
			  	Clickonelement(pom.getPatient().getselectdeleteoption());
			  	
			  //Enter Email id
			  	sendkeys(pom.getPatient().getEnterEmail(), "smash001@gmail.com");
			  	
			 // click Work DropDown
			  	Clickonelement(pom.getPatient().getclickWorkBotton());
			  	
			 	
			 //Select contact
				Clickonelement(pom.getPatient().getselectcontact());
			  	
			 //Click AddEmail Option
			    Clickonelement(pom.getPatient().getClickAddButton());	
			  	
			    //Enter Add Phone Number
			  	sendkeys(pom.getPatient().getEnterphonenumber2(), "987654320");
			  		
			 	
			 //Click Home Option
			    Clickonelement(pom.getPatient().getclickHomeBotton());	
			  	
			//Select Home
			    Clickonelement(pom.getPatient().getselectHome());	
			  	
			    //Select Home
			    Clickonelement(pom.getPatient().getclickDeleteButton());		  	
			  	
			  //Enter Street Name
			  	sendkeys(pom.getPatient().getEnterStreetname(), "EastCarStreet");
			
			  //Enter Street Name
			  	sendkeys(pom.getPatient().getEnterCityname(), "Coimbatore");	
			
			  //Click State dropdown
			    Clickonelement(pom.getPatient().getClickStatename());		  
			
			  //Select California State
			    Clickonelement(pom.getPatient().getclickDeleteButton());
			    
			    //Enter ZIP Code
			  	sendkeys(pom.getPatient().getEnterZIPCode1(), "638001");		    
			    
			  //Enter Notes
			  	sendkeys(pom.getPatient().getEnterNotes(), "HI ALL");		    	    
			    
			  //Click Cancel
			    Clickonelement(pom.getPatient().getClickCancel1());	    
			    
			  //Click SAVE
			    Clickonelement(pom.getPatient().getClickCSAVE1());	    
			    
			    Thread.sleep(2000);
			    
			    
	//PATIENT FLAG TYPE		    
			    
			    
			  //Patient Flag Type
				Clickonelement(pom.getPatient().getPatientFlagType());
				
//				//Click sort1
//				Clickonelement(pom.getPatient().getClickSort1());		
//			    
//				//Click sort2
//				Clickonelement(pom.getPatient().getClickSort2());	    
		//	
				//Click Add NEW Patient Flag
			    Clickonelement(pom.getPatient().getClickAddNewPatientFlag());


				//Enter Name in Create Patient Flag Type
			    sendkeys(pom.getPatient().getEnterName(), "New");
			    
			  //Click Add NEW Patient Flag
			    Clickonelement(pom.getPatient().getSelectColour());	    
			    
			    
		      //Click Cancel
			  Clickonelement(pom.getPatient().getClickCancel2());	  	    
			    
			  //Click SAVE
			  Clickonelement(pom.getPatient().getClickSAVE2());	  	    
			  
			  
			  
			    
//CLICK PATIENT EDUCATION			    

				//click patient education
				Clickonelement(pom.getPatient().getClickPatientEducation());
				
				
			   //Click Private Radio button
				Clickonelement(pom.getPatient().getClickPatientRadiobutton());		
				
				
				//Click Practice group button
				Clickonelement(pom.getPatient().getClickPatientgroupbutton());				
				
				//Click Public button
			   Clickonelement(pom.getPatient().getClickPublicbutton());		
			   

//			   //Click Private Radio button
//				Clickonelement(pom.getPatient().getClickPatientRadiobutton1());		
//				
//				//
			   
			   //search the form
			   sendkeys(pom.getPatient().getSearchforForm(), "gfdg");
			    
				
				
	
	
	
	
	
	
	
}
}