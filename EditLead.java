package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	private static final CharSequence Learning = null;

	public static void main(String[] args) {

//		/*http://leaftaps.com/opentaps/control/main
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

//		Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Enter the username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
//		Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//		Click crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();
//		Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//		Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//		Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("Learning");
//		Click Find leads button
		
//		Click on first resulting lead
		driver.findElement(By.linkText("10085")).click();
//		Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
//		Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
//		Change the company name
		driver.findElement(By.className("inputBox")).sendKeys("RK Enterprises");
//	    Click Update
		driver.findElement(By.className("smallSubmit")).click();
//		Confirm the changed name appears
		if (driver.getTitle().contains("Learning")) {
			System.out.println("The name is not changed");
			
		}
		else {
			System.out.println("The name has been changed");
		}
//		Close the browser (Do not log out)
		driver.close();

	}

}
