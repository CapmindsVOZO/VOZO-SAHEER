package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class SettingsRunner extends Base_class{

	
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
		
//SETTINGS MODULE(FEATURES-DOCUMENT)
		
		//click Settings Module
				Clickonelement(pom.getSettings().getClickSettingsModule());
				
				Thread.sleep(4000);
				
				//click Features Button
				Clickonelement(pom.getSettings().getClickFeatures());		
				
				//click Document Button
				Clickonelement(pom.getSettings().getClickDocument());  
				
				Thread.sleep(2000);
				//click Include Logo  Radio Button
				Clickonelement(pom.getSettings().getClickRadioButton());  
				
				//Enter Fooder Information
				sendkeys(pom.getSettings().getEnterFooderInfo(), "Hi Team");	

				//click Edit option
				Clickonelement(pom.getSettings().getClickEdit());  
				
				//click Macro Clinicion Option
				Clickonelement(pom.getSettings().getClickClinicianOption());  		
				
				//click Macro Practice Option
				Clickonelement(pom.getSettings().getClickPracticeOption());  				
					
				//click Macro client Option
				Clickonelement(pom.getSettings().getClickClientOption());  				
									
				//click Macro Appointment Option
				Clickonelement(pom.getSettings().getClickAppointmentOption());  				
													
				//click Macro Links Option
				Clickonelement(pom.getSettings().getClickLinksOption());  				
																	
				//Enter Subject
				sendkeys(pom.getSettings().getEnterSubject(), "Hi All");			
				
				//click Cancel Option
				Clickonelement(pom.getSettings().getClickCancel());  
				
//				//click SAVE Option
//				Clickonelement(pom.getSettings().getClickSave());  		
				
				//click Include Logo  Radio Button
				Clickonelement(pom.getSettings().getClickRadioButton1());  
						
				
				//Enter Fooder Information
				sendkeys(pom.getSettings().getClickFooterInfo(), "GOOD MORNING");			
				
				//click Edit option
				Clickonelement(pom.getSettings().getClickEdit1());  					
				
				//click Macro Clinicion Option
				Clickonelement(pom.getSettings().getClickClinicianOption1());  		
						
				//click Macro Practice Option
				Clickonelement(pom.getSettings().getClickPracticeOption1());  				
							
				//click Macro client Option
				Clickonelement(pom.getSettings().getClickClientOption1());  				
											
				//click Macro Appointment Option
				Clickonelement(pom.getSettings().getClickAppointmentOption1());  				
															
				//click Macro Links Option
				Clickonelement(pom.getSettings().getClickLinksOption1());  				
																			
				//Enter Subject
				sendkeys(pom.getSettings().getEnterSubject1(), "Hi All");			
				
				//Enter MSG
				sendkeys(pom.getSettings().getEntermsg(), "good morning to all");
				
				//click Cancel Option
				Clickonelement(pom.getSettings().getClickCancel1());  
						
//				//click SAVE Option
//				Clickonelement(pom.getSettings().getClickSave1());  		
								
	//Superbills
				
				//click Include Logo Option
				Clickonelement(pom.getSettings().getClickIncludeLogo1());  
										
				//click Include Signature line option
				Clickonelement(pom.getSettings().getClickIncludeSignatureLine());  		
				
				//click	Include Diagnosis Description option
				Clickonelement(pom.getSettings().getClickIncludeDiagnosis());  		
				
				//clear the already stored text
				ClearText(pom.getSettings().getClearFooderInfo());  
				
				//Enter Footer Information
				sendkeys(pom.getSettings().getEnterFooderInformation(), "good ");
								
				//Default Superbill Email Edit option
				Clickonelement(pom.getSettings().getclcickEditOption());  		
							
				//click Macro Clinicion Option
				Clickonelement(pom.getSettings().getClickClinicianOption2());  		
								
				//click Macro Practice Option
				Clickonelement(pom.getSettings().getClickPracticeOption2());  				
									
				//click Macro client Option
				Clickonelement(pom.getSettings().getClickClientOption2());  				
													
				//click Macro Appointment Option
				Clickonelement(pom.getSettings().getClickAppointmentOption2());  				
																	
				//click Macro Links Option
				Clickonelement(pom.getSettings().getClickLinksOption2());  				
				
				//clear the already stored text
				ClearText(pom.getSettings().getclearSubject());  
				
				//Enter Subject
				sendkeys(pom.getSettings().getEnterSubject2(), "Hello All");			
					
				//clear the already stored text
				ClearText(pom.getSettings().getclearMsg());  
				
				//Enter MSG
				sendkeys(pom.getSettings().getEntermsg2(), "good morning to all");
						
				//click Cancel Option
				Clickonelement(pom.getSettings().getClickCancel2());  
								
				//click SAVE Option
				//Clickonelement(pom.getSettings().getClickSave2());  		
										
				//click Cancel Option
				Clickonelement(pom.getSettings().getClickIncludeLogo());  		
				
				//clear the already stored text
				ClearText(pom.getSettings().getclearFooterInfor());  		
			
				//Enter Footer info
				sendkeys(pom.getSettings().getEnterFooterInfor(), "good morning to all");		
				
				//click SAVE Option
				//Clickonelement(pom.getSettings().getClickSAVE());  		
				
				
//BILLING AND SERVICES
				
				
				//click Settings Module
				Clickonelement(pom.getSettings().getClickSettingsModule());
				
				Thread.sleep(6000);
				
				//click Features
				Clickonelement(pom.getSettings().getClickFeatures());
				
				Thread.sleep(2000);
				
				//click Billing and Services 
				Clickonelement(pom.getSettings().getClickBilligandServices());
					
				Thread.sleep(6000);

//Billing				
				//click Billing  
				Clickonelement(pom.getSettings().getClickBillig());		
					
				//click Billing  Currency
				Clickonelement(pom.getSettings().getClickBilligCurrency());	
					
				//Select USD
				Clickonelement(pom.getSettings().getSelectUSD());
				Thread.sleep(2000);
				
				//Enter TaxID 
				sendkeys(pom.getSettings().getEnterTaxID(), "123456");	
				Thread.sleep(2000);
				
				// Enter Organization NPI
				sendkeys(pom.getSettings().getEnterOrgNPI(), "456");	
						
			    //click Send Verification Button	
				Clickonelement(pom.getSettings().getclickSendVerification());
				
				Thread.sleep(2000);
				
				//Enter verification Code
				sendkeys(pom.getSettings().getEnterVerificationCode(), "4566");
				
				Thread.sleep(2000);
				
				//click close
				Clickonelement(pom.getSettings().getclickClose());		
				
				//click Submit
				//Clickonelement(pom.getSettings().getclickSubmit());		
						
				
			   //click Send Verification Button	
			   //Clickonelement(pom.getSettings().getclickSaveInformation());				
	
//Services Button
				
				
				   //click Services Button	
				    Clickonelement(pom.getSettings().getclickServicesbutton());		
					
					
					//click Add services Button	
				    Clickonelement(pom.getSettings().getclickAddServicesbutton());			
					
				   //Select code type CVX Immunization
				    Selectone(pom.getSettings().getSelectCVXImmunization(),"LOINC" );
					
				   // Enter Code
				    sendkeys(pom.getSettings().getEnterCode(), "007");		
					
				   // Enter Fees
				    sendkeys(pom.getSettings().getEnterFees(), "007");		
						
				   // Enter Description
				    sendkeys(pom.getSettings().getEnterDescription(), "The type of problem");			
					
				   //click Cancel Button	
				    Clickonelement(pom.getSettings().getClickCancelButton());			
					
				  //click SAVE Button	
				 //   Clickonelement(pom.getSettings().getClickSaveButton());
				    
				    
 //Payer Search
					
					//click Payer Search 
					Clickonelement(pom.getSettings().getClickPayerSearch());
					
					//Click New Payer
					Clickonelement(pom.getSettings().getClickNewPayer());
					
					//Enter Payer Name
					sendkeys(pom.getSettings().getEnterPayerName(), "UNITED INDIA LIMITED");
					
					//Enter Payer Address
					sendkeys(pom.getSettings().getEnterPayerAddress(), "Chennai,India");
									
					//Enter Payer City
					sendkeys(pom.getSettings().getEnterPayerCity(), "Chennai");
											
					//Select Payer State
				    Selectone(pom.getSettings().getSlectPayerState(),"TN" );	
					
				  //Enter Payer City
				  	sendkeys(pom.getSettings().getEnterPayerZIP(), "600028");	

				  //Click Close
				  	Clickonelement(pom.getSettings().getClickclose());	  	
					
				  //Click SAVE
				  //Clickonelement(pom.getSettings().getClickSAVEButton());	  		
										
					//click Billing and Services 
					Clickonelement(pom.getSettings().getClickBilligandServices());
						
					Thread.sleep(6000);

			//LAB
					
					//click LAB Button
					Clickonelement(pom.getSettings().getClickLAB());
					
					//click Add New LAB Button
					Clickonelement(pom.getSettings().getClickAddNew());	  	
					
			//Lab INformation		
					// Enter Organisation
					sendkeys(pom.getSettings().getEnterOrganisation(), "capminds");		
					
					// Enter Phone Number
					sendkeys(pom.getSettings().getEnterPhone(), "9090909");		
					
					// Enter Mobile Number
					sendkeys(pom.getSettings().getEnterMobile(), "9090909");		
					
					// Enter Email 
					sendkeys(pom.getSettings().getEnterEmail(), "abcd@gmail.com");		
								
					// Enter Address
					sendkeys(pom.getSettings().getEnterAddress(), "No.4,Chennai,India");		
											
					// Enter City
					sendkeys(pom.getSettings().getEnterCity(), "Chennai");			
					
					//Enter State
					sendkeys(pom.getSettings().getEnterState(), "Chennai");			
						
					//Enter State
					sendkeys(pom.getSettings().getEnterPINcode(), "600028");	
					
					//Enter UPIN
					sendkeys(pom.getSettings().getEnterUPIN(), "998");	
					
					//Enter NPI
					sendkeys(pom.getSettings().getEnterNPI(), "6767");		
					
					//Enter TIN
					sendkeys(pom.getSettings().getEnterTIN(), "9898787898");				
				
					//Enter TIN
					sendkeys(pom.getSettings().getEnterTaxonomy(), "91234489898");			
					
					//Click Cancel
					//Clickonelement(pom.getSettings().getClickCancelButto());	 
					
					//Click SAVE
					//Clickonelement(pom.getSettings().getClickSaveButto());	 		
				
			//Lab Configuration
					Thread.sleep(4000);
					//Click Lab Configuration
					Clickonelement(pom.getSettings().getClickLabConfig());
					
					//Click Check Active Radio Button
					Clickonelement(pom.getSettings().getCheckActiveRadiobutton());		
					
					//Enter Sender Applicat Name
					sendkeys(pom.getSettings().getEnterApplicantname(), "Ragu");			
					
					//Enter Sender Facility Name
					sendkeys(pom.getSettings().getEnterFacilityname(), "Sundar");			
					
					//Enter Receivers Applicat Name
					sendkeys(pom.getSettings().getEnterApplicantname1(), "laxman");			
							
					//Enter Receivers Facility Name
					sendkeys(pom.getSettings().getEnterFacilityname1(), "kannan");			
					
					//Select SFTP
				    Selectone(pom.getSettings().getSelectProtocal(),"SFTP" );		
					
				   //Enter Login ID
				  	sendkeys(pom.getSettings().getEnterLoginID(), "Capminds2");			
				  						
				  	//Enter Remote Host
				  	sendkeys(pom.getSettings().getEnterRemoteHost(), "Minds");			
				  								
				  	//Enter Result Path
				  	sendkeys(pom.getSettings().getEnterResultPath(), "RESULT");			
				  								
				  //Enter Orders Path
				  	sendkeys(pom.getSettings().getEnterOrdersPath(), "Orders");					
					
				  //Click Cancel
				 	Clickonelement(pom.getSettings().getClickCancelButto1());	 
				  		
				  //Click SAVE
				 	//Clickonelement(pom.getSettings().getClickSaveButto1());	 		
				  	
			    	//Click Delete Button
				 	//Clickonelement(pom.getSettings().getClickDelete());	
					
				 	//Click Edit Button
				 //	Clickonelement(pom.getSettings().getClickEditButton());	
					
				 	//Click Edit Button
				 	//Clickonelement(pom.getSettings().getClickCancel1Button());
				 	
				 	driver.close();
			}		
}
