package AllWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		//****************************




		WebElement MultiSelectCarsdropdownEle=	driver.findElement(By.name("MultiCars"));

		Select sel = new Select(MultiSelectCarsdropdownEle);

		sel.selectByVisibleText("Maruthi");
		sel.selectByVisibleText("Swiftvdi");
		sel.selectByVisibleText("Audi");


		// HW selectbyValue


		// HW select by index 


		// Deselect Swiftvdi, Benz
//		sel.deselectByVisibleText("Swiftvdi");

//		sel.deselectByVisibleText("Benz");
		
		// HW Deselect by Value
		
		
		// HW Deselect by index
		
		

		// deselect all values in muti slect dropdown
//		sel.deselectAll();

		//  check whther dropdown is MultiSelect dropdown ir single select dropdown
		boolean  isMultiple=  sel.isMultiple();
		System.out.println("isMultiple=" +isMultiple);// isMultiple=true

		WebElement SingleSelectCarsdropdownEle=	driver.findElement(By.name("cars"));
		Select sel2 = new Select(SingleSelectCarsdropdownEle);
		System.out.println("is multiple=" + sel2.isMultiple()); //  false 

		//Hw : get all dropdown values use getOptions()  use for loop
		
		//Hw : get all dropdown values use getOptions()  use for each loop


		// get Selected values from Multi Select dropdown 
		List<WebElement>  allSelectedOptions= 	sel.getAllSelectedOptions();
		//  <option >   Maruthi </option>
		String selectedText= allSelectedOptions.get(0).getText();
		System.out.println("selectedText="+selectedText);
		

	 	selectedText= allSelectedOptions.get(1).getText();
		System.out.println("selectedText="+selectedText);
//		selectedText=Maruthi
//				selectedText=Swiftvdi
				
		// HW get all selected vlaues from multi select dropdown using for loop
		
		
		// HW get all selected vlaues from multi select dropdown using for each loop
		
		
		System.out.println("first sele= " + sel.getFirstSelectedOption().getText());
		// first sele= Maruthi  
		
		
		System.out.println("ends");
	}

}
