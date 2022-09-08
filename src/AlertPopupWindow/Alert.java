package AlertPopupWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		// click the display alert button?
		 driver.findElement(By.xpath("//input[@id='alertid1']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		org.openqa.selenium.Alert al= driver.switchTo().alert(); //NoAlertPresentException: no such alert : if alert window is not there,
		//but if you are tried to switch ti alert popout window it throws NoAlertPresentException
		String altext = al.getText();
		System.out.println("altext  ="+altext);
		Thread.sleep(2000);
		al.sendKeys("raju");// ?????????
		Thread.sleep(2000);
		al.accept();
		
		driver.findElement(By.name("firstname")).sendKeys("manan");
		
		
		//*******************
		
		
				
		System.out.println("ends ");
		

	}

}
