package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextboxBasics {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		//  2 things 
		//		  1. identify desired eleement first  -- findElement(by)
		//2.   perform action on the element - data enter, click.
		// enter "ramu"  in first name textbox 

		WebElement FirstNameTextboxele=  driver.findElement(By.name("firstname"));
		FirstNameTextboxele.sendKeys("ramu");

		// clear the entered value from first name text box
		FirstNameTextboxele.clear();

		FirstNameTextboxele.sendKeys("Sita");

		// FAQ How to get value  from first name text box

		String valFromTextbox= FirstNameTextboxele.getAttribute("value");
		System.out.println("val="+ valFromTextbox); // val=Sita


		// check Ename textbox is displayed
		WebElement enameTextboxEle=  driver.findElement(By.name("myname"));
		boolean enameTextboxDisplayed=  enameTextboxEle.isDisplayed();
		System.out.println("enameTextboxDisplayed="+enameTextboxDisplayed);
		// enameTextboxDisplayed=true

		// check  Ename textbox is enabled
		boolean enametextboxenabled = enameTextboxEle.isEnabled();
		System.out.println("enametextboxenabled ="+enametextboxenabled); //enametextboxenabled =false


		// check Ename textbox is selected
		boolean enametextboxselected = enameTextboxEle.isSelected();
		System.out.println("enametextboxselected ="+enametextboxselected);  // enametextboxselected =false
		//  usuauly we use isSelected() for Radio button and chekcboxes 


		// Hw : Enter sowmya" in last name textbox using "id" locator
		// xpath = //input[@id='idfirst'][@name='lastname']
		
		WebElement lastnametxtele = driver.findElement(By.xpath("//input[@id='idfirst'][@name='lastname']")); 
		// if i used xpath it is selected lastname text box 
		
		//WebElement lastnametxtele =driver.findElement(By.id("idfirst"));
		//when i used "id" locator it is selecting/entering  first name text box 
		
		lastnametxtele.clear();
		lastnametxtele.sendKeys("sowmya");


		// HW : Enter "My test" in Test field using "name" locator

		//WebElement testfieldtxtele = driver.findElement(By.name("name"));// By using name locator iam not able to particular find element, bcoz by using find element method it only searched/selects first occurance value only.
		WebElement testfieldtxtele =	driver.findElement(By.xpath("//input[@id='testid3456']"));
		testfieldtxtele.clear();
		testfieldtxtele.sendKeys("My test");


		// HW : Enter "mypassword" in password field using "class" locator

		//	Ans : Their is no class attribute value in password field.


		// HW : Enter value "xpath" in last name textbox using xpath locator
		
		WebElement lastnametxtbxele = driver.findElement(By.xpath("//input[@name='lastname']"));
		//lastnametxtbxele.clear();
		lastnametxtbxele.sendKeys("Xpath");


		// HW: Enter value in "CSs" in last name textbox using csselector
		
		WebElement lastnametxtboxele = driver.findElement(By.cssSelector("input[name='lastname']"));
		lastnametxtboxele.sendKeys("css");



		//driver.close();

	}

}
