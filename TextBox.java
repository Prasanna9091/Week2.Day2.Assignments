package week2.day2.Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBox {

	public static void main(String[] args) {
            ChromeOptions Options=new ChromeOptions();
            Options.addArguments("--disable-notification");
            
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            
            driver.get("https://www.leafground.com/input.xhtml");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            
//            Type your name
            driver.findElement(By.name("j_idt88:name")).sendKeys("Prasanna");
//            Append Country to this City
            driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("-India");
//            Verify if text box is disabled
            boolean textbox = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
            System.out.println(textbox);
            
//            Clear the typed text
            driver.findElement(By.name("j_idt88:j_idt95")).clear();
//            Retrieve the typed text
            System.out.println(driver.findElement(By.name("j_idt88:j_idt95")).getAttribute("value"));
//            Type email and Tab. Confirm control moved to next element
//            Type about yourself
//            Text Editor
//            Just Press Enter and confirm error message*
//            Click and Confirm Label Position Changes
//            Type your name and choose the third option
//            Click and Confirm Keyboard appears
//            Custom Toolbar



	}

}
