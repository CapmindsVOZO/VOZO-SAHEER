package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class PageTaskRunner extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);
	

 public static void main(String[] args)  throws InterruptedException {
	 
	// Launch browser
	geturl("https://ehr.vozo.xyz:444/");

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	// Enter User name
	sendkeys(pom.getinstance().getUsername(), "tech1");

	// Enter Password
	sendkeys(pom.getinstance().getPassword(), "capminds@03");

	// Click Sign In Button '
	Clickonelement(pom.getinstance().getSigninbtn());

	// Click On Month Option
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
    // Click Task button
 	Clickonelement(pom.getPageTask().getClickTaskButton());
    
    // Click Edit button
  	Clickonelement(pom.getPageTask().getClickEditButton());
      
	// EnterNew category name
	sendkeys(pom.getPageTask().getEnterNewCategory(), "capminds");
    
	 // Click Task button
 	Clickonelement(pom.getPageTask().getClickNewCategory());
 	
 	Clickonelement(pom.getPageTask().getclickClose());
    
 	 // Click staues edit button
 	Clickonelement(pom.getPageTask().getclickStatusEdit());
    
     // EnterNew Status Name
 	sendkeys(pom.getPageTask().getEnterStausName(), "Arrived");
    
     // Click status 
  	Clickonelement(pom.getPageTask().getClickStatus());
    
    // select In progress 
   	Clickonelement(pom.getPageTask().getSelectInProgress());
     
    // Click Category 
  	Clickonelement(pom.getPageTask().getClickCategory());
  
    // select Fever
   	Clickonelement(pom.getPageTask().getSelectFever());
    
    // Click New Statuses button
  	Clickonelement(pom.getPageTask().getClickNewsStatses());
  	
  	//close th edialogue box
  	Clickonelement(pom.getPageTask().getClickClose());
  	
  	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  	
    //Click Edit Task Templates
  	Clickonelement(pom.getPageTask().getClickEditTaskTemplate());
		
    //Click Create New Templates
  	Clickonelement(pom.getPageTask().getClickCreateNewTemplate());
		
  	 // Enter Title
 	sendkeys(pom.getPageTask().getEnterTitle(), "Capminds");
    
 	//Click Assignee
  	Clickonelement(pom.getPageTask().getCickAssignee());
  	
    //Select Tech1 Test
  	Clickonelement(pom.getPageTask().getselectTech1Test());
  	
  	
  	 // EnterTemplate Name
 	sendkeys(pom.getPageTask().getEnterTemplateName(), "Capminds");
    
    // Enter Day
  	sendkeys(pom.getPageTask().getEnterDay(), "2");
  	
     // Enter Hour
   	sendkeys(pom.getPageTask().getEnterHour(), "2");
  	
     // Enter Minute
   	sendkeys(pom.getPageTask().getEnterMin(), "2");
   	
     //Click Category
  	Clickonelement(pom.getPageTask().getSelectcategory());

    //click priority
  	Clickonelement(pom.getPageTask().getClickPriority());
  	
   //Select Medium
  	Clickonelement(pom.getPageTask().getSelectmedium());
  	
  //click Status
  	Clickonelement(pom.getPageTask().getClickStatus1());
  	
   //Select Arrived
  	Clickonelement(pom.getPageTask().getSelectArrived());
  	
  //Enter Notes	
  	sendkeys(pom.getPageTask().getEnterNotes(), "WELCOME");
  	
  //click SAVE
  //Clickonelement(pom.getPageTask().getSelectSave());
  	
  //click CANCEL
  Clickonelement(pom.getPageTask().getSelectCancel());
  	
  		
  	
  	

}

}
