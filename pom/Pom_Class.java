package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.dockerjava.api.model.Task;
import com.page.Billing;
import com.page.Calender;
import com.page.ERXPage;
import com.page.PageTask;
import com.page.Patient;
import com.page.Payment;
import com.page.Reports;
import com.page.Settings;
import com.page.SignIn;
import com.paral.New_Appointment;

public class Pom_Class {


	public  static RemoteWebDriver driver;

	private SignIn sp;

	private Calender cp;
	
	private Patient pa;
	
	private Reports rp;

	private Settings st;
    
	private New_Appointment na;

	private Payment py;

	private Billing BL;
	
	private PageTask TK;
	
	private ERXPage ERX;
	
//	private Appointment_Profile ap;

	public Pom_Class(WebDriver driver2) {
		
		this.driver = (RemoteWebDriver) driver2;

	}

	public Settings getSettings() {
	
		if (st== null) {
	
			st = new Settings(driver);
	
		}
		return st;
	}

	public SignIn getinstance() {

		if (sp == null) {

			sp = new SignIn(driver);
   
		}
		return sp;
	}

	public Calender getCalender() {

		if (cp == null) {

			cp = new Calender(driver);

		}
		return cp;
	}
	
	public Patient getPatient() {

		if (pa== null) {

			pa = new Patient(driver);

		}
		return pa;
	}
	
	public Reports getReports() {

		if (rp== null) {

			rp = new Reports(driver);

		}
		return rp;
	}
	
	public New_Appointment getnewappointment() {

		if (na == null) {

			na = new New_Appointment(driver);

		}
		return na;

	}
	
	public Payment getPayment() {

		if (py== null) {

			py = new Payment(driver);

		}
		return py;
	}
	
	public Billing getBilling() {

		if (BL== null) {

			BL = new Billing(driver);

		}
		return BL;
	}
	public PageTask getPageTask() {

		if (TK== null) {

			TK = new PageTask(driver);

		}
		return TK;
	}
	public ERXPage getERXPage() {

		if (ERX== null) {

			ERX = new ERXPage(driver);

		}
		return ERX;
	}
	
	

}