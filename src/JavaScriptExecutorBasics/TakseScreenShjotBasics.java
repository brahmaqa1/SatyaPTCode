package JavaScriptExecutorBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakseScreenShjotBasics {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open url in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		TakesScreenshot t= (TakesScreenshot)driver ;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		System.out.println("src file="+ srcFile);
		// src file=C:\Users\Lenovo\AppData\Local\Temp\screenshot10012856790845408667.png
		
//		File destFile = new File("C:\\brahma\\Practise\\seleniumpractise\\SatyaJavaProject\\src\\JavaScriptExecutorBasics\\MyScreenshot.png");
		File destFile = new File("C:\\brahma\\Practise\\seleniumpractise\\SatyaJavaProject\\src\\JavaScriptExecutorBasics\\MyScreenshotJpg.jpeg");
		
		
		
		//  Download commons.io 2.7   
		FileUtils.copyFile(srcFile, destFile);
		
		File  src= driver.findElement(By.name("firstname")).getScreenshotAs(OutputType.FILE);
		File destFile2 = new File("C:\\brahma\\Practise\\seleniumpractise\\SatyaJavaProject\\src\\JavaScriptExecutorBasics\\WebeleScreenshot.jpeg");
		FileUtils.copyFile(srcFile, destFile2);
		
		// get project folder
		String projDir= System.getProperty("user.dir");
		System.out.println("proj dir="+  projDir);
		
//		/proj dir=C:\brahma\Practise\seleniumpractise\SatyaJavaProject
		
		// get user name 
		
		String user= System.getProperty("user.name");
		System.out.println("proj user="+  user);
		
		
//		driver.quit();
		
		
		
		
	}

}
