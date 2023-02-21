package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

    ChromeOptions option=new ChromeOptions();
    
    option.addArguments("--disable-notifications");
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("http://leaftaps.com/opentaps/control/login");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
    
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    driver.findElement(By.className("decorativeSubmit")).click();
    
    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
    
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    
    driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
    
    driver.findElement(By.id("firstNameField")).sendKeys("Prasanna");
    
    driver.findElement(By.id("lastNameField")).sendKeys("Karuppaian");
    
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Prasanna");
    
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Karuppaian");
    
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
    
    driver.findElement(By.id("createContactForm_description")).sendKeys("Mechanical Department");
    
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("prasanna.karuppaian@gmail.com");
    
    WebElement dropdown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    
    Select state=new Select(dropdown1);
    
    state.selectByVisibleText("New York");
    
    driver.findElement(By.className("smallSubmit")).click();
    
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    
    driver.findElement(By.id("updateContactForm_description")).clear();
    
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Infected by Covid");
    
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    String title = driver.getTitle();
    System.out.println(title);
    
    driver.close();
    
	}

}
