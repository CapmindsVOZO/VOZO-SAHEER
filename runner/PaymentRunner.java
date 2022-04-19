package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class PaymentRunner extends Base_class{
	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);
	

public static void main(String[] args)  throws InterruptedException {
	
	geturl("https://ehr.vozo.xyz:444/");

	// Enter Username

	sendkeys(pom.getinstance().getUsername(), "tech1");

	// Enter Password

	sendkeys(pom.getinstance().getPassword(), "capminds@03");

	// Click Signin Button '

	Clickonelement(pom.getinstance().getSigninbtn());

	// Click On Month Option

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	Clickonelement(pom.getPayment().getClickPreviousDate());
	
	Thread.sleep(5000);
	
    Clickonelement(pom.getPayment().getSelectDate());
	
	Thread.sleep(5000);
	
	//click Appointment
    Clickonelement(pom.getPayment().getClickAppointment());
    
		//click @Arrived/Lobby
    Clickonelement(pom.getPayment().getClickArrivedLobby());	

    //select @Arrived/Lobby
   // Clickonelement(pom.getPayment().getSelectArrivedLobby());
    
    Thread.sleep(4000);
    
    //Click Sevices
    Clickonelement(pom.getPayment().getClickServices());

    //click CPT Codes
    Clickonelement(pom.getPayment().getClickCPTCodes());
	
    //Enter CPT codes
    sendkeys(pom.getPayment().getEnterCPTCodes(), "test");	
	
    Thread.sleep(2000);
    
    //click CPT Codes
    Clickonelement(pom.getPayment().getSelectCPTCodes());
    
    Thread.sleep(2000);
    //Clear fees
    ClearText(pom.getPayment().getClearFees()); 
	
  //Enter Fees
    sendkeys(pom.getPayment().getEnterFees(), "200");	
	
    
    //click A1 Modifiers
    Clickonelement(pom.getPayment().getclickModifiersA1());
   
    //select A1 Modifiers
    Clickonelement(pom.getPayment().getselectkModifiersA1());
    
    Thread.sleep(3000);
    
  //click Level 2 Modifiers  
    Clickonelement(pom.getPayment().getclickModifiersA2());
   
    //select Level 2 Modifiers 
    Clickonelement(pom.getPayment().getselectkModifiersA2());
      
    Thread.sleep(3000);
    
  //click Level 3 Modifiers  
    Clickonelement(pom.getPayment().getclickModifiersA3());
   
    //select Level 3 Modifiers 
    Clickonelement(pom.getPayment().getselectkModifiersA3());
    
  //click Level 4 Modifiers  
    Clickonelement(pom.getPayment().getclickModifiersA4());
   
    //select Level 4 Modifiers 
    Clickonelement(pom.getPayment().getselectkModifiersA4());
    
  //Clear quantity
    ClearText(pom.getPayment().getclearquantity()); 
	
  //Enter quantity
    sendkeys(pom.getPayment().getEnterquantity(), "5");	
    
  //Enter pointer
    sendkeys(pom.getPayment().getEnterPointer(), "5");	
     
   //click Billing
    Clickonelement(pom.getPayment().getClickBilling());
	
  //click Create Invoice
    Clickonelement(pom.getPayment().getClickCreateInvoice());
	
    //click Add payment
    Clickonelement(pom.getPayment().getClickAddPayment());
    
    Thread.sleep(3000);
    
  //click Invoice Balance Button
    Clickonelement(pom.getPayment().getClickInvoiceBalance());
	
	//select payment method
    Selectone(pom.getPayment().getSelectPaymentMethod(),"Cash" );

    //click Invoice Balance Button
    Clickonelement(pom.getPayment().getClickaddpayment());
    
    
  //  ICD-10-CM
    

  //click search ICD-10-CM codes
    Selectone(pom.getPayment().getsearchcodes(),"test" );
    
    //select code
    Clickonelement(pom.getPayment().getselectcode());
    
  //click delete
    Selectone(pom.getPayment().getclickdelete(),"test" );
     
   
    
}
	 		

}
