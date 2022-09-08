package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserBasics2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property
		//  if we dont set property - for chromerdirver.exe file path 


		// FAQ :  Write a program to open Chrome browser?
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver3242.exe");
		//		java.lang.IllegalStateException: The driver executable must exist: C:\brahma\seleniumSoftwares\Alldrivers\chromedriver_win32V103\chromedriver3242.exe
		// if we pass in vlaid chromedriver.exe file or path - 


		//		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");

		// create obj for chromedriver   -   opens chrome browser
		ChromeDriver driver = new ChromeDriver();


		// open URl in browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		// refresh
		driver.navigate().refresh();

		System.out.println("ends");
	}


}
