package TableBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusablemethods2 {
	static WebDriver driver;
	static WebElement TestcaseDescriptionEle;


	public static String  handling_of_TestCaseTable01_by_using_TCID (String TCID) {
		try {
			TestcaseDescriptionEle =  driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/td[contains(text(),'"+TCID+"')]/following-sibling::td[1]"));
			//return "pass";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("TCID is not found ="+e);
			return "fail";
		}
		if (TestcaseDescriptionEle.isDisplayed()) {
			String Testcasedescriptiontxt = TestcaseDescriptionEle.getText();
			System.out.println("Testcasedescriptiontxt  ="+Testcasedescriptiontxt); 
			return "TCID found";
		} else {
			System.out.println("TCID is not found");
			return "fail";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		handling_of_TestCaseTable01_by_using_TCID("TC_01");
		handling_of_TestCaseTable01_by_using_TCID("TC_02");
		handling_of_TestCaseTable01_by_using_TCID("TC_03");
		handling_of_TestCaseTable01_by_using_TCID("TC_112121212");
	}
}
