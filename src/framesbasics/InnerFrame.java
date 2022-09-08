package framesbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		// get text -from heading Frames Examples in Selenium Webdriver
		String heading= driver.findElement(By.xpath("//h1")).getText();
		System.out.println("heading=" + heading);
		
		// Swicth to frame 
	
		driver.switchTo().frame("frame1");
		// enter some value in topic
		driver.findElement(By.xpath("//input")).sendKeys("Raju");
		// click inner frame chekcbox
//		driver.findElement(By.id("a")).click();// error as checkbox is in inner frame
		//NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#a"}
		
		//  swicth to inner frame 
				driver.switchTo().frame("frame3");
				driver.findElement(By.id("a")).click();// error as checkbox is in inner frame
				driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		
		// get text -from heading Frames Examples in Selenium Webdriver
		 heading= driver.findElement(By.xpath("//h1")).getText();
		System.out.println("heading=" + heading);
		
		
		System.out.println("ends");
		
	
		

	}

}
