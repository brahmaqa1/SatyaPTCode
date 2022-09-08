package AutoITBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {


	public static void setClipboardData(String string) {
		
	}

	public static void uploadFile(String fileLocation) {
		try {
			//Setting clipboard with file location
			//setClipboardData(fileLocation);
			//StringSelection is a class that can be used for copy and paste operations.
			StringSelection stringSelection = new StringSelection(fileLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
			//native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//  1. file uplaoding
		//		driver.findElement(By.name("uploadname")).sendKeys("D:\\Practise\\TestFile.txt");


		//  2.  using Robot -- through keyboard
		//driver.findElement(By.id("fileid")).click();// nok
		WebElement chooseFileBtn= driver.findElement(By.id("fileid"));
		Actions act = new Actions(driver);
		act.click(chooseFileBtn).perform();
		
		Thread.sleep(2000);
		uploadFile("C:\\brahma\\Practise\\TestFile.txt");

		// Hw :  use actions class  , enter file name and press enter
		
		
		// 3 AutoIT tool
		
		

	}

}
 
