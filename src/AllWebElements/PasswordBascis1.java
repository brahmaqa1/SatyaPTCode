package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordBascis1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// Enter value in password
		WebElement passwordidtextele =	driver.findElement(By.id("idpwd"));
		passwordidtextele.clear();
		passwordidtextele.sendKeys("password");




		// get value from password field 

		String textvaluefrompasstxtbx =	passwordidtextele.getAttribute("value"); // It don't have value attribute to get text from it.
		System.out.println("textvaluefrompasstxtbx ="+textvaluefrompasstxtbx);//  password

		//  displayed 
		
		boolean passwordidtextdisplayed = passwordidtextele.isDisplayed();
		System.out.println("passwordidtextdisplayed ="+passwordidtextdisplayed); //passwordidtextdisplayed =true


		// enabled
		
		boolean passwordidtextenabled = passwordidtextele.isEnabled();
		System.out.println("passwordidtextenabled ="+passwordidtextenabled); //passwordidtextenabled =true


		driver.close();

	}

}
