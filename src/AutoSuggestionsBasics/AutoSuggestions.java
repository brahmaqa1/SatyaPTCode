package AutoSuggestionsBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Rama");
		
		//li[@class='sbct sbre']/div/div[2]/div[1]/span
		
		List<WebElement>  autosuggestions= driver.findElements(By.xpath("//li[@class='sbct sbre']/div/div[2]/div[1]/span"));
		
		//Hw get all auto suggetsions  use for loop with index no
			
		
		
		// HW get all auto suggetsions  use for each loop
		
		
		
		

	}

}
