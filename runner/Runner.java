package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pom.Pom_Class;

public class Runner extends Base_class{

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

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);ubl
//
//		Clickonelement(pom.getCalender().getMonth());
////
//		// Click On Month Calender option
		Thread.sleep(4000);

		Clickonelement(pom.getCalender().getMonthcalender());

		// Appointment Open Click Cancel

		Clickonelement(pom.getCalender().getCancel1());

		// Center Text Will Visible

		Thread.sleep(3000);

		gettext(pom.getCalender().getVisibletext1());

		// Move To Workweek

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getCalender().getWorkweek());

		// Click On Calender

		Clickonelement(pom.getCalender().getWwcalender());

		// Click Cancel Button

		Clickonelement(pom.getCalender().getCancel2());

		// Get Work Week Text

		Thread.sleep(2000);

		gettext(pom.getCalender().getVisibletext2());

		// get week Option

		Clickonelement(pom.getCalender().getweek());

		// get week text

		gettext(pom.getCalender().getVisibletext3());

		// Clicl Calender

		Clickonelement(pom.getCalender().getwcalender());

		// click Cancel

		Clickonelement(pom.getCalender().getCancel3());

		// click on Day option

		Clickonelement(pom.getCalender().getDay());

		// Clcik On Day Calender

		Clickonelement(pom.getCalender().getDaycalender());

		// Clcik On Cancel

		Clickonelement(pom.getCalender().getCancel4());

		// Visible Text Day

		gettext(pom.getCalender().getVisibletext4());

		// Clcik On Center Calender

		Clickonelement(pom.getCalender().getCenterCalender());

		// Click On Right

		Clickonelement(pom.getCalender().getRight());

		// Clcik on Left

		Clickonelement(pom.getCalender().getLeft());

		// Click Provider Select

		Clickonelement(pom.getCalender().getProviderselect());

		// Select Provider

		Clickonelement(pom.getCalender().getselectProvider());

		// close Select

		Clickonelement(pom.getCalender().getProviderselect());

		// Click Facility

		Clickonelement(pom.getCalender().getFacilitySelect());

		// select facility

		Clickonelement(pom.getCalender().getSelectFacility());

		// Close Facility

		Clickonelement(pom.getCalender().getFacilitySelect());

		// Visible Today

		gettext(pom.getCalender().getTodayoption());

		// Get Appointment Option

		Clickonelement(pom.getCalender().getAppointmentoption());
		
		
//		Clickonelement(pom.getPatient().getCreateClient());
//
//		sendkeys(pom.getPatient().getsen, "xyz");
	}

}
