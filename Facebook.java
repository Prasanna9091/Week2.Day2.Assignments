package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Chatter");
		
		driver.findElement(By.name("lastname")).sendKeys("Box");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9159408485");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Chatter@Box@123");
		
		WebElement dropdown1 = driver.findElement(By.id("day"));
		
		Select date=new Select(dropdown1);
		
		date.selectByIndex(10);
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		
		Select month=new Select(dropdown2);
		
		month.selectByIndex(3);
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
  
		Select year=new Select(dropdown3);
		
		year.selectByIndex(23);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.close();
	}

}
