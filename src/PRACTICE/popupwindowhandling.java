package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AlertPopupWindow.Alert;

public class popupwindowhandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver  =new ChromeDriver();
		
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		Actions act = new Actions(driver);
		
		WebElement popupbuttonEle = driver.findElement(By.id("alertid1"));
		popupbuttonEle.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		org.openqa.selenium.Alert al = driver.switchTo().alert();//NoAlertPresentException: no such alert  :-must have to pass waiting time
		String txtfrompopup = al.getText();
		System.out.println("txtfrompopup ="+txtfrompopup);
		Thread.sleep(2000);
		
		
		
		al.sendKeys("Employee name is satya");// not working
		
		Thread.sleep(2000);
		
		al.accept();
		
		WebElement firstnameEle = driver.findElement(By.name("firstname"));
		firstnameEle.clear();
		firstnameEle.sendKeys("satya");
		//act.moveToElement(firstnameEle).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("satya").perform();
		//act.moveToElement(firstnameEle).sendKeys("satya").perform();
		//act.keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).sendKeys("narayana").perform();
		act.sendKeys(Keys.TAB).sendKeys("my test").perform();
		act.sendKeys(Keys.TAB).sendKeys("password").perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.ARROW_RIGHT).perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.TAB).click().perform();
		Thread.sleep(2000);
		WebElement carsdropdownEle = driver.findElement(By.xpath("//select[@id='idfirst']"));
		carsdropdownEle.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).click().perform();
//		
//		
//		
//		
//		System.out.println("ends");
	}
	
}
