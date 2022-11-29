package week2.day1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path (WebDriverManager)
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		// ( A normal click will do for this step) 
		
		// Step 1: Download and set the path (WebDriverManager)
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manju");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Palani");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9840632606");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@123");
		
		// Step 11: Handle all the three drop downs
		WebElement sel1 = driver.findElement(By.id("day"));
		Select src1=new Select(sel1);
		src1.selectByValue("30");
		
		WebElement sel2 = driver.findElement(By.id("month"));
		Select src2=new Select(sel2);
		src2.selectByVisibleText("Dec");
		
		WebElement sel3 = driver.findElement(By.id("year"));
		Select src3=new Select(sel3);
		src3.selectByValue("1982");
		
		// Step 12: Select the radio button "Female" 
		// ( A normal click will do for this step) 
				
	driver.findElement(By.name("sex")).click();
	//driver.close();
	}

}
