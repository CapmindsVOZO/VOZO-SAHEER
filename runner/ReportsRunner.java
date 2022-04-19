package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pom.Pom_Class;

public class ReportsRunner extends Base_class{

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
		
		
		Clickonelement(pom.getReports().getClickReport());
		
		


//APPOINTMENT REPORT		
		Thread.sleep(4000);
		
		//click Appointment Rerport
		Clickonelement(pom.getReports().getClickAppointmentReport());
		
		//click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll());
				
		//click UnCheckAll
	    Clickonelement(pom.getReports().getClickUnCheckAll());
								
	  //click CheckAll
	  	Clickonelement(pom.getReports().getClickCheckAll1());
		
		//click UnCheckAll
	    Clickonelement(pom.getReports().getClickUnCheckAll1());
		
	  //Search Patient Name
	    sendkeys(pom.getReports().getSearchPatientName(), "DhilipKumar");

	  //click All Office
	    Clickonelement(pom.getReports().getClickAllOffice()); 
	    
	    //Select Test Facility Phar
	    Clickonelement(pom.getReports().getSelectTestFacilityPhar());  
	    
	  //click From Date
	    Clickonelement(pom.getReports().getclickFromdate());  
	    
	  //select date number 8
	    Clickonelement(pom.getReports().getselectdatenumber8());
	
	    
	 //click End Date
		Clickonelement(pom.getReports().getclickEndDate());  
	    
		//select date number 15
	    Clickonelement(pom.getReports().getselectdate15());   
	    
	    //click Update Button
		Clickonelement(pom.getReports().getclickupdatebutton());  	    
	    
		//select Radio Button
		Clickonelement(pom.getReports().getclickRadioButton());	    
	    
	    
//TELE HEALTH REPORT
		Thread.sleep(4000);
		//click the Tele Health Report
		Clickonelement(pom.getReports().getclickTeleHealthReport());
	    
	    //click checkAll Radio button
		Clickonelement(pom.getReports().getclickCheckAll());
	    
		//click checkAll Radio button
		Clickonelement(pom.getReports().getclickUnCheckAll());	    
	    
	    //click Occured Radio Button
		Clickonelement(pom.getReports().getclickOccuredRadioButton());			
	    	    
		//click Did notOccured Radio Button
		Clickonelement(pom.getReports().getclickDidnotOccuredRadioButton());			
			    	    
	    //search the Patient Name
		sendkeys(pom.getReports().getSearchThePatientName1(), "DhilipKumar");
	    
		//click Select office Option
		Clickonelement(pom.getReports().getSelectOfficeOption());		

		//click Select office Option
		Clickonelement(pom.getReports().getSelectclickTestFacilityPhar());		
		
		//click Start date Option
		Clickonelement(pom.getReports().getclickStartDate());
		
		// Select Start date 16
		Clickonelement(pom.getReports().getSelectStartDate16());
						
		//click End date Option
		Clickonelement(pom.getReports().getclickEndDateq());
				
		// Select End date 31
		Clickonelement(pom.getReports().getSelectStartDate31());		
		
		// Click Update Filter Option
		Clickonelement(pom.getReports().getclickUpdateFilterOption());			

		// Click Update Export to file
		//Clickonelement(pom.getReports().getClickExportToFile());			

		// Click Update Export to file
		//Clickonelement(pom.getReports().getClickLoadmore());		
		
		
//Productivity Report
		
		//click the Tele Health Report
		Clickonelement(pom.getReports().getclickTeleHealthReport());
		Thread.sleep(6000);
				
		// Click Productivity Report
		Clickonelement(pom.getReports().getClickProductivityReport());	
		
		// Click From Date
		Clickonelement(pom.getReports().getClickTheFromDate());	
		
		//  Select From Date 16
		Clickonelement(pom.getReports().getSelectTheFromDate16());	

		// Click End Date
		Clickonelement(pom.getReports().getclickTheEndDate());		
		
    	//  Select From Date 31
		Clickonelement(pom.getReports().getselectTheEndDate31());		
		
		// Click The Provider option
		Clickonelement(pom.getReports().getClickProvider());				
		
	    //  Select Provider
	    Clickonelement(pom.getReports().getSelectProvider());		
		

	    //  Click the Include Cancelled and NoShow Appointments
	    Clickonelement(pom.getReports().getClickCheckBox());	
	  
	    //click update button
	    Clickonelement(pom.getReports().getClickUpdateButton());	    
		
	    //click load more
	    Clickonelement(pom.getReports().getClickLoadMore());
					
//User Report
		
	  		//click User Report
	  		Clickonelement(pom.getReports().getClickUserreport());
	  						
	          //Enter Search Username		
	  		sendkeys(pom.getReports().getEnterSearchUsername(), "Tech1Test");
	  			 
	  		//click Inactive 
	  		Clickonelement(pom.getReports().getclickInactiveRadioButton());
	  		
	  		//click Search Button
	  		Clickonelement(pom.getReports().getclickSearchButton());		
	  		
	  		//click Staff Button
	  		Clickonelement(pom.getReports().getclickStaffButton());			
	  		
	  		//Enter Search Username		
	  	    sendkeys(pom.getReports().getEnterUserName(), "dhilipCapminds");		
	  		
	  	  //click Inactive 
	  	  	Clickonelement(pom.getReports().getClickInactive());		
	  		
	  	  //click Search Button
	  	  	Clickonelement(pom.getReports().getclickSearchButton1());				
	
	
	}
	
}
