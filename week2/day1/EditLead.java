package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
//		* 2	Enter the username
//		* 3	Enter the password
//		* 4	Click Login
//		* 5	Click crm/sfa link
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//* 6	Click Leads link
		//* 7	Click Find leads
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
//		* 8	Enter first name
//		* 9	Click Find leads button
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Manju");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		//* 10 Click on first resulting lead
		//* 11 Verify title of the page
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='15498']")).click();
		 
		 
		//String val= driver.getTitle();
		  // System.out.println(val);
//			* 12 Click Edit
//			* 13 Change the company name
//			* 14 Click Update
//			* 15 Confirm the changed name appears
//			* 16 Close the browser (Do not log out)
		   
		   
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("testTREE");
	
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String s1=driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).getText();
		String s2="testTREE (15498)";
		if (s1.equals(s2))
		{
			System.out.println("Done");
		} else 
		{
		System.out.println("Not update");
		}
		driver.close();
	
	}							
	
}
