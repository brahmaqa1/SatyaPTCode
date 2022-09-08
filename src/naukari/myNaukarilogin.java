package naukari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myNaukarilogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("ksatya945@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Trilok@215");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
//		driver.findElement(By.xpath("//div/span[@class='edit icon']")).click();
		////input[contains(@id,'idfi')] 
		driver.findElement(By.xpath(""));
//		act.moveToElement(null).perform();
		

	}

}
 