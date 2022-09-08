package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//****************************
		
		// get all checkboxes cnt
		List<WebElement> allcheckboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int allcheckboxscnt =  allcheckboxs.size();
		System.out.println("allcheckboxscnt = "+allcheckboxscnt);
		
		// click all check boxes by using forloop
		
		int i;
		
		for (i=0;i<=allcheckboxscnt-1;i++)
		{
			allcheckboxs.get(i).click();
		}

		// click all check boxes by using forloop
		for (WebElement eachele: allcheckboxs)
		{
			eachele.click();
		}
		
	}

}
