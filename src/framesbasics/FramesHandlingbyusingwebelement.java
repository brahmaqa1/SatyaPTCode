package framesbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingbyusingwebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");
		
		//How get total no of frames?
		
		List<WebElement> framesEles = driver.findElements(By.xpath("//div[@class='box']"));
			int noofframescnt = framesEles.size();
			System.out.println("noofframescnt ="+noofframescnt);
		
		//
	
		

	}

}
