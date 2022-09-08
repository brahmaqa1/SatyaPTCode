package AlertPopupWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiplealertpopwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		
		//*******************
		WebElement Multipopupbutton =  driver.findElement(By.xpath("//input[@id='alertid2']"));
		Multipopupbutton.click();
		
		org.openqa.selenium.Alert al =  driver.switchTo().alert();
		String altext =  al.getText();
		System.out.println("altext  ="+altext);
		Thread.sleep(2000);
		al.sendKeys("raju");
		Thread.sleep(2000);
		al.dismiss();
		org.openqa.selenium.Alert alt2 = driver.switchTo().alert();
		String alttext = alt2.getText();
		System.out.println("alttext ="+alttext);
		alt2.accept();
		
		driver.findElement(By.name("firstname")).sendKeys("manan");	
		
				
		System.out.println("ends ");
		

	}

}
