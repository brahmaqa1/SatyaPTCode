package TableBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusablemethods3 {
	static WebDriver driver;
	static WebElement ExpectedvalueEle;
	
	public static String handling_of_TestCaseTable01_by_using_TCID_Toget_ExpectedValue (String TCID)
	{
		try {
			ExpectedvalueEle = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/td[contains(text(),'"+TCID+"')]/following-sibling::td[2]"));
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("TCID is not found"+e);
			return "fail";
		}if (ExpectedvalueEle.isDisplayed()) {
			String Expectedvaluetxt = ExpectedvalueEle.getText();
			System.out.println("Expectedvaluetxt  ="+Expectedvaluetxt);
			return "pass";
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
		String TC_01_Res = handling_of_TestCaseTable01_by_using_TCID_Toget_ExpectedValue("TC_01");
		System.out.println("TC_01_Res  ="+TC_01_Res);
		String TC_02_Res = handling_of_TestCaseTable01_by_using_TCID_Toget_ExpectedValue("TC_02");
		System.out.println("TC_02_Res  ="+TC_02_Res);
		String TC_03_Res = handling_of_TestCaseTable01_by_using_TCID_Toget_ExpectedValue("TC_03");
		System.out.println("TC_03_Res  ="+TC_03_Res);
		String TC_02323232_Res = handling_of_TestCaseTable01_by_using_TCID_Toget_ExpectedValue("TC_2323232");
		System.out.println("TC_02323232_Res  ="+TC_02323232_Res);
		driver.close();
		}
}
