package AlertPopupWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InnerFrameHandling3Sumath {

	public static void main(String[] args) throws InterruptedException {
		// 1. open chrome browser //set property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");		  
		WebDriver driver= new ChromeDriver();

		// open url in browser
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// innner frame--   frame inside frame 
		//   swicth to frame1  - swicth to inner frame

		driver.switchTo().frame("frame1");
		//			driver.findElement(By.id("topic")).sendKeys("Raju");//error:
		//			ElementNotInteractableException: element not interactable
		// we are trying to enter data for  text element  but not for textbox 
		driver.findElement(By.xpath("//b[@id='topic']/../input")).sendKeys("Raju");


		Thread.sleep(3000);
		driver.switchTo().frame("frame3");//.NoSuchFrameException: No frame element found by name or id frame3
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();		
		//  check ctrl goes to main page  but not parent frame	
		//driver.findElement(By.xpath("//b[@id='topic']/../input")).sendKeys("Swathi");//Erorr
		// this elee is present in parent frame -  swicth().parentFrame();

		Thread.sleep(3000);
		//		driver.switchTo().defaultContent();// even if u write/ dont write  also, it is fine,

		driver.switchTo().frame("frame2");		
			WebElement  animalsDropdownEle  = driver.findElement(By.id("animals"));
			Select sel = new Select(animalsDropdownEle);				 
			sel.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();

		/*
		 * //siwtch frame 1 driver.switchTo().frame("frame1");
		 * driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).
		 * sendKeys("Ram");
		 * 
		 * // swicth to inner frame //Inner Frame Check box :
		 * 
		 * driver.switchTo().frame("frame3"); 
		 * driver.findElement(By.id("a")).click();
		 * driver.switchTo().defaultContent();// ctrl comes to main page only
		 * 
		 * String paraTxtFromMainPage=
		 * driver.findElement(By.xpath("//*[contains(text(),'Not a Friendly Topic')]")).
		 * getText(); System.out.println("paraTxtFromMainPage="+paraTxtFromMainPage);
		 * 
		 * // swicth to last frame driver.switchTo().frame("frame2");
		 * 
		 * WebElement dropdownEle= driver.findElement(By.id("animals")); Select sel= new
		 * Select(dropdownEle); sel.selectByVisibleText("Avatar");
		 */

		//***********************
		
		// parent frame...

		//siwtch frame 1
		//		driver.switchTo().frame("frame1");
		//		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Ram");

		// swicth to inner frame //Inner Frame Check box :

		driver.switchTo().frame("frame3"); 
		driver.findElement(By.id("a")).click();
		// swicth to parent frame and enter some text in topic
		driver.switchTo().parentFrame();//  control goes paren frame i.e frame-1
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Swathi");

		//   can we swicth to inner frame directly :  no. we cannot swicth 
		//Exception in thread "main" org.openqa.selenium.NoSuchFrameException: No frame element found by name or id frame3


		System.out.println("end ");

		//********************************



	}

}