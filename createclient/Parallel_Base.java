package createclient;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parallel_Base {
	
	public  static RemoteWebDriver driver;
	
	//public static  Pageobjectmanager pom = new Pageobjectmanager(driver);

	// Driver Invoke
	@BeforeMethod
	public void preCondition() {

		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
	
		WebDriverManager.chromedriver().setup();
       
		ChromeDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
	//	driver = new ChromeDriver();
		// driver(new ChromeDriver());
		driver.get("https://ehr.vozo.xyz:444/");
		// maxi
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

//	@AfterMethod
//	public void postCondition() {
//
//		driver.close();
//	}

	public static void geturl(String url) {

		driver.get(url);

	}
	
	public static void sendkeys(WebElement elements, String Value) {

		elements.sendKeys(Value);

	}

	public static void Clickonelement(WebElement element) {

		element.click();

	}

	public static void clear(WebElement elements1) {

		elements1.clear();

	}
	


}
