package TableBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class allcellstext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.titleIs(""));


		//get all cells data from table:HulTablee01
		List<WebElement> allcells = driver.findElements(By.xpath("//table[@id='HulTablee01']//tr/td"));
//		int count = allcells.size();
//		System.out.println("count  ="+count);
//
//		for(int i=0;i<=count-1;i++)
//		{
//			String text = allcells.get(i).getText();
//			System.out.println("count       ="+text);
//			
//			
//		}
		//  Hw / use for each loop
		


		//get text box element from ProductTable and enter data into that

//		List<WebElement> textboxes = driver.findElements(By.xpath("//table[@name='ProductTable']/tbody/tr/td/input"));
//		int cnt = textboxes.size();
//		System.out.println("count of textboxes   ="+cnt);
//		//		WebElement element = driver.findElement(By.xpath("//table[@name='ProductTable']/tbody/tr/td[contains(text(),'Prod1')]/parent::tr/td/following-sibling::td[3]/input"));
//		//		element.sendKeys("satya");
//		//		Thread.sleep(2000);
//
//		for(int i=1;i<=cnt;i++)
//		{
//			WebElement element = driver.findElement(By.xpath("//table[@name='ProductTable']/tbody/tr/td[contains(text(),'Prod"+i+"')]/parent::tr/td/following-sibling::td[3]/input"));
//			element.sendKeys("satya");
//			Thread.sleep(2000);
//		}
//		Thread.sleep(2000);


		//get the ListboxTable01 and click on all check boxes with reference of Ename.

//
//		for(int i=2;i<=5;i++)
//		{
//
//			WebElement Ename = driver.findElement(By.xpath("//table[@id='ListboxTable01']/tbody/tr["+i+"]/td[2]"));
//			String Enametxt = Ename.getText();
//			System.out.println("Enametxt  ="+Enametxt);
//			WebElement checkbox = driver.findElement(By.xpath("//table[@id='ListboxTable01']/tbody/tr/td[contains(text(),'"+Enametxt+"')]/following-sibling::td/input[@type='checkbox']"));
//			checkbox.click();
//			Thread.sleep(1000);
//
//		}
//
//		//get the ListboxTable01 and choose second value from dropdown with reference of Ename.
		
//		for(int i=2;i<=5;i++)
//		{
//			WebElement Ename = driver.findElement(By.xpath("//table[@id='ListboxTable01']/tbody/tr["+i+"]/td[2]"));
//			String Enametxt = Ename.getText();
//			System.out.println("Enametxt  ="+Enametxt);
//
//			WebElement dropdown = driver.findElement(By.xpath("//table[@id='ListboxTable01']/tbody/tr/td[contains(text(),'"+Enametxt+"')]/preceding-sibling::td/select/option[3]"));
//			dropdown.click();
//
//			Thread.sleep(2000);
//		}
//		
//		
//		//get the TextboxTable01 and choose second value from dropdown with reference of Esal.
		List<WebElement> Esalele = driver.findElements(By.xpath("//table[@id='TextboxTable01']/tbody/tr/td[3]"));
		int cnt1 = Esalele.size();
		System.out.println("cnt1   ="+cnt1);
		for(int i=0;i<=cnt1-2;i++)
		{
		String txt = Esalele.get(i).getText();
		WebElement Textboxele = driver.findElement(By.xpath("//table[@id='TextboxTable01']/tbody/tr/td[contains(text(),'"+txt+"')]/preceding-sibling::td/input[contains(@type,'text')]"));
		Textboxele.sendKeys("satya");
		Thread.sleep(1000);
		}
		
		System.out.println("ends");

//		driver.close();

	}

}
