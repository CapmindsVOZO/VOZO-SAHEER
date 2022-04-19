package createclient;




import org.testng.annotations.Test;

public class Parallel_New extends Parallel_Base {

	@Test
	public void Test1() throws InterruptedException {
		
		driver.get("https://ehr.vozo.xyz:444/");
	
		new Parallel_Login(driver)
		.getenterUser()
		.getpasswo().getlogbtn().getclish().getclickPatient().getcreateclient();
		
		
        
		
		
		// Enter Username

//		sendkeys(pom.getinstance().getUsername(), "tech1");
//
//		// Enter Password
//
//		sendkeys(pom.getinstance().getPassword(), "capminds@03");
//
//		// Click Signin Button '
//
//		Clickonelement(pom.getinstance().getSigninbtn());

	}

//	@Test
//	public void Test2() throws InterruptedException {
//
//		// Driver Maximize and Url Launch
//
//		geturl("https://ehr.vozo.xyz:444/");
//
//		new Parallel_Login(driver)
//		
//		.getenterUser()
//		.getpasswo().getlogbtn().getclish().getclickPatient().getcreateclient();
//		System.out.println("test complete2");
//
//	}


}
