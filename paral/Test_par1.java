package com.paral;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import com.pom.Pom_Class;
import com.runner.Base_class;

public class Test_par1 extends Base_class {
	
	
	//public static RemoteWebDriver driver;
	public  static WebDriver driver = getbrowser("chrome");
	
	public static Pom_Class pom = new Pom_Class(driver);
	
	//public static void main(String[] args) throws InterruptedException {
	
	@Test
	
	public void Test1() throws InterruptedException {
	// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		// get Appointment Text
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Click day

		Clickonelement(pom.getnewappointment().getClickdayn());

//		// Click calender
//
//		Clickonelement(pom.getnewappointment().getClickcaln());

		// Click crea app

		// Clickonelement(pom.getnewappointment().getClickcreateappn());

		// click cal

		Clickonelement(pom.getnewappointment().getcal1());

		// ser pat6
		Thread.sleep(3000);

		Clickonelement(pom.getnewappointment().getserachpatn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendpatn());

		// send time
		// Clickonelement(pom.getnewappointment().getsendtimen());

		// clear(pom.getnewappointment().getsendtimen());

		Thread.sleep(2000);

		sendkeys(pom.getnewappointment().getsendtimen(), "01:00PM");

		// ser provi
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprovin());

		Clickonelement(pom.getnewappointment().getsendprovn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearprofn());

		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsendprofn());

		// ser pro
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearoffn());

		Clickonelement(pom.getnewappointment().getsendoffn());

		// ser stat
		Thread.sleep(2000);

		Clickonelement(pom.getnewappointment().getsearchstan());

		Clickonelement(pom.getnewappointment().getsendstatn());

		// save

	//	Clickonelement(pom.getnewappointment().getsaven());
		
driver.close();
	}

}
