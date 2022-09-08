package AllWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		//****************************
		
//		By.id, anme, classNAme () , xpath,csselector(), 
		// by.linktext(), partilalinktext() ,  by.taganme()
		
//		WebElement ToolTipSumnathLinkEle=  driver.findElement(By.linkText("ToolTip Sumanth"));
//		ToolTipSumnathLinkEle.click();
		//or 
	//  get url of link  ex:  href attr name
		String url= driver.findElement(By.linkText("ToolTip Sumanth")).getAttribute("href");
		System.out.println("url="+url);
		//url=file:///C:/brahma/Practise/qtp%20practise//web%20apps/WebTableAll.html
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("ToolTip Sumanth")).click();
		
		// Note : if element is not found in browser with given locator- findElemnt() throws NoSuchElementException		
		// org.openqa.selenium.NoSuchElementException: no such element:
		//Unable to locate element: {"method":"link text","selector":"ToolTip Sumanth"}
		
		Thread.sleep(3000);// throws InterruptedException
		//naviagte to back page or prev page
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		// partial linktext
		driver.findElement(By.partialLinkText("ToolTip")).click();
		
		Thread.sleep(3000);
		
	driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Sumanth")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Google")).click(); 
		//org.openqa.selenium.NoSuchElementException: no such element: 
		//Unable to locate element: {"method":"partial link text","selector":"google"}  always give exact visible text from page
		// visible text is case sensitive
	
		Thread.sleep(3000);
		driver.navigate().back();
		
		// get image location
		String imagesrcpath =  driver.findElement(By.cssSelector("img[alt='HTML tutorial']")).getAttribute("src");
		System.out.println("imagesrcpath = "+imagesrcpath);

	}

}
