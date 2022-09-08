package AutoITBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITFileUplaodcode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
		//  2.  using Robot -- through keyboard
		//driver.findElement(By.id("fileid")).click();// nok
		WebElement chooseFileBtn= driver.findElement(By.id("fileid"));
		Actions act = new Actions(driver);
		act.click(chooseFileBtn).perform();
		
		Runtime.getRuntime().exec("C:\\brahma\\Practise\\seleniumpractise\\AutoITFiles\\fileuploadAutoITcode.exe");
		
		
		System.out.println("ends");
		
		
	}

}
