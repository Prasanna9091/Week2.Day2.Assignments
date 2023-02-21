package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.partialLinkText("CRM")).click();
        
//      Click Leads link
        driver.findElement(By.linkText("Leads")).click();
//		Click Find leads
        driver.findElement(By.linkText("Find Leads")).click();
//		Click on Email
        driver.findElement(By.linkText("Email")).click();
//		Enter Email
        driver.findElement(By.name("emailAddress")).sendKeys("heelo@gmail.com");
//		Click find leads button
        
//      Capture name of First Resulting lead
        WebElement lead = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[3]"));
        String first = lead.getText();
        System.out.println(first);
//		Click First Resulting lead
        
        lead.click();
//		Click Duplicate Lead
        driver.findElement(By.linkText("Duplicate Lead")).click();
//		Verify the title as 'Duplicate Lead'
        System.out.println("The title is " + driver.getTitle());
//		Click Create Lead
        driver.findElement(By.className("smallSubmit")).click();
//		Confirm the duplicated lead name is same as captured name
        if (driver.getTitle().contains(first)) {
        	System.out.println("The duplicate lead name is similar");
			
		}
        else {
			System.out.println("The duplicate lead name is not similar");
		}
//		Close the browser (Do not log out)
        driver.close();
	}

}
