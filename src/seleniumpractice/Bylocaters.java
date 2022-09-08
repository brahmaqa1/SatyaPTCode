package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.buffer.ByteBufHolder;

public class Bylocaters {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
//        driver.findElement(By.className("firstclass")).clear();
//        driver.findElement(By.className("firstclass")).sendKeys("Chaithu");
//		driver.findElement(By.name("firstname")).clear();
//		driver.findElement(By.name("firstname")).sendKeys("Sathaya");
		driver.findElement(By.id("idfirst")).clear();
		driver.findElement(By.id("idfirst")).sendKeys("Krishna");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sdf");
		
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("satya");
		
		//driver.findElement(By.xpath("//input[@class='Vehicle']")).click();
		
		driver.findElement(By.xpath("//input[@id='carid']")).click();
		
		
		
		//driver.findElement(By.linkText("ToolTip Sumanth")).click();
		//driver.findElement(By.partialLinkText("Sumanth")).click();
		
//		driver.quit();
        

	}

}
