package createClients;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SequenceCreateClient3 {
@Test(timeOut = 400000)
	public  void Sequencecreatclient() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		  ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://ehr.vozo.xyz:444/");
		 	
		  driver.manage().window().maximize();
		
		  driver.findElement(By.xpath("//input[@class='ant-input']")).sendKeys("tech1");
		
	      driver.findElement(By.xpath("//input[@id='pass_show']")).sendKeys("capminds@03");
		
		  driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("(//a[normalize-space()='Patient'])[1]")).click();
		  
		  driver.findElement(By.xpath("//button[normalize-space()='Create New Client']")).click();
	  
		  driver.findElement(By.xpath("//input[@id='formGridEmail']")).sendKeys("ravi");
		  
		  driver.findElement(By.xpath("//input[@id='formGridPassword']")).sendKeys("kumar"); 
		  
		  driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("abc@gmail.com");
		  
		  driver.findElement(By.xpath("(//input[@name='phone_number'])[1]")).sendKeys("987654321");
		  
	//	  driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		  
		  

		
	}

}
