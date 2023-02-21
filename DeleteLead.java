package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

     ChromeOptions option=new ChromeOptions();
     
     option.addArguments("--disable-notification");
     
     ChromeDriver driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("http://leaftaps.com/opentaps/control/login");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.findElement(By.id("username")).sendKeys("demoSalesManager");
     
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     
     driver.findElement(By.className("decorativeSubmit")).click();
     
     driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
     
     driver.findElement(By.xpath("//a[text()='Leads']")).click();
     
     driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
     
     driver.findElement(By.xpath("//span[text()='Phone']")).click();
     
     driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("994567289");
     
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
     
     WebElement dropdown1 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]//a)[1]"));
     
     String text = dropdown1.getText();
     System.out.println(dropdown1);
     Thread.sleep(2000);
     dropdown1.click();
     
     driver.findElement(By.className("subMenuButtonDangerous")).click();
     
     driver.findElement(By.xpath("//a[text()='Find Leads']/parent::li")).click();
     
     driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
     
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      
     if (driver.getTitle().contains(text)) {
    	 System.out.println("Records are displayed");	
	}
     else {
    	 System.out.println("No Records to display");
	}
 
     driver.close();    		

	}

}
