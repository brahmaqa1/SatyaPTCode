package MultipleBrowserWindwosHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllBrowserTitles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
	
		// click  open login form button   and opens new window
		driver.findElement(By.id("loginid")).click();
		
			// Clk "WebtableAll" button
		driver.findElement(By.id("allid")).click();
		
		//clk 'Simple AllObect ' button
		driver.findElement(By.id("simpleid")).click();
			
		
		//  get opened browsers count
		
		Set<String> allwindowadds = driver.getWindowHandles();
		int allwindowscnt = allwindowadds.size();
		System.out.println("allwindowscnt ="+allwindowscnt);
		
		Iterator<String> it =  allwindowadds.iterator();
			
//		String firstbrowserwindowadd = it.next();
//			System.out.println("firstbrowserwindowadd ="+firstbrowserwindowadd);//firstbrowserwindowadd =CDwindow-8C6799186610BF30C0623C8F3FE132C1
//			
//			
//			String Secondbrowserwindowadd = it.next();
//			System.out.println("Secondbrowserwindowadd ="+Secondbrowserwindowadd);
//		
		 
		
		// HW get all titles of opened browser windows
		while(it.hasNext())
		{
			String val =it.next();
//			System.out.println("val ="+val);//val =CDwindow-98589B588B98DDB43DA9DD4B0EE302E8
											//val =CDwindow-DD071D4DACF2A4D7CB82255C75ACC36B
											//val =CDwindow-154C1F7F8AB5B59F6C08E9E7D0ECCBD0
											//val =CDwindow-25B7E0237A777FD7AA0D8038817F2CB8
			
			driver.switchTo().window(val);
		String title= 	driver.getTitle();
		System.out.println("title=" +title);
//			title=All webobjects MyTitle Sumanth
//			title=Simple all objects Title
//			title=WebtableAll Title
//			title=Login page	
			
		}
		
		
		driver.quit();
			
		System.out.println("ends");
		

	}

}
