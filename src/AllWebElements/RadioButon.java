package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButon {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//****************************
		//Click 'Male 'Radio button
		WebElement maleRadioBtnele =  driver.findElement(By.xpath("//input[@id='maleid']"));
		
		maleRadioBtnele.click();
		
		// selected or not
		
		boolean maleRadioBtnSelected= maleRadioBtnele.isSelected();
		System.out.println("maleRadioBtnSelected="+maleRadioBtnSelected); //maleRadioBtnSelected=true
		
		// dispalyed 
		boolean maleradbtndisplayed = maleRadioBtnele.isDisplayed();
		System.out.println("maleradbtndisplayed ="+ maleradbtndisplayed); //maleradbtndisplayed =true
		
		// enabled 
		boolean maleradbtnenabled = maleRadioBtnele.isEnabled();
		System.out.println("maleradbtnenabled ="+ maleradbtnenabled); //maleradbtnenabled =true
		
		
		// feameradio btn 
		
		
		

	}

}
