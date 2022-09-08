package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//****************************
		
		WebElement   carsDropdownEle=  driver.findElement(By.xpath("//select[@id='idfirst']"));
		Select sel = new Select(carsDropdownEle);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
		sel.selectByVisibleText("BMW");
		Thread.sleep(3000);
		sel.selectByVisibleText("Kia");
		
//		Thread.sleep(3000);
//		//  DROPDOWN VALS ARE CASE  sensitive
////		sel.selectByVisibleText("bmw");  as bmw value is not exist in dropdown
//		// .NoSuchElementException: Cannot locate option with text: bmw
//		
//		
//		sel.selectByValue("audival");
//
//		Thread.sleep(3000);
//		sel.selectByValue("Mercedesval");
//		
//		// 3 Selectbyindex
//		sel.selectByIndex(0);
//		Thread.sleep(3000);
//		sel.selectByIndex(1);
//		Thread.sleep(3000);
////		sel.selectByIndex(6); // error we dont index = 6 
//		// Revision:
//		// <select>  <option>
////		Select - class 
////		WebElement  bikesdropdown=  driver.findElement(By.name(""));
////		Select sel2 = new Select(bikesdropdown);
////		3     selectbyvisible text ,,  selectby valye,,  selectby index 
//		// HW Bikedropdown ?/??
//		
//		
//		// get sleected val from dropdown 
//		
//		String selectedValFromcarsDropdown= carsDropdownEle.getAttribute("value");
//		System.out.println("selectedValFromcarsDropdown = " + selectedValFromcarsDropdown);
//		//selectedValFromcarsDropdown = Swiftvdival
//		
//	 	WebElement selectedOptionele=  sel.getFirstSelectedOption();
//	 	System.out.println("selectedOptionele="+selectedOptionele);
//	 	//  <option>  audi  </option>
//	 String selectedValFromcarsDropdown1 =	selectedOptionele.getText();
//		System.out.println("selectedValFromcarsDropdown1=" +selectedValFromcarsDropdown1);
//		// selectedValFromcarsDropdown1=Swiftvdi
		
		
		// FAQ : select all values in dropdown one by one ?  use for loop
		
		
		
		//FAQ get all drodown values count and all  values from dropdown ?
		List<WebElement>  allOptions= 	sel.getOptions();
		
		
		int dropdownValscnt= allOptions.size();
		
		System.out.println("dropdownValscnt="+ dropdownValscnt);
		//dropdownValscnt=6
		
		WebElement firstOptionele=  allOptions.get(0);
		// <option value="maruthival">Maruthi</option>
		
		
		System.out.println("val= "+ firstOptionele.getText());// val= Maruthi
		
		// get 2nd dropdown vals
		WebElement secondOptionele=  allOptions.get(1);
		System.out.println("val= "+ secondOptionele.getText());
		
		// HW.  get all  values using for loop
		int i;
		for (i=0;i<=dropdownValscnt-1;i++)
		{
			WebElement choosenOptionele=  allOptions.get(i);
			String values= choosenOptionele.getText();
			System.out.println("values ="+values);
		}
		
		// HW    get all  values using for each loop
		
		for (WebElement eachEle  : allOptions )
		{
			String valFromDropdown = eachEle.getText();
			System.out.println("valFromDropdown ="+ valFromDropdown);
		}
		
		
		
		
		
		
	}

}
