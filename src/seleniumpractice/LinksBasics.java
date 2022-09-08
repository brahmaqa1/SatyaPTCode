package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksBasics {

	public static void main(String args[])
	{

		// FAQ :  Write a program to open Chrome browser?
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver3242.exe");
		//		java.lang.IllegalStateException: The driver executable must exist: C:\brahma\seleniumSoftwares\Alldrivers\chromedriver_win32V103\chromedriver3242.exe
		// if we pass in vlaid chromedriver.exe file or path - 


		//		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");

		// create obj for chromedriver   -   opens chrome browser
		ChromeDriver chromebrowser = new ChromeDriver();


		// open URl in browser
		chromebrowser.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//  
		//		By.linkText(null)
		//		By.partialLinkText(null)
		//		chromebrowser.findElement(By.linkText("ToolTip Sumanth")).click();

		//		chromebrowser.findElement(By.partialLinkText("Google")).click();

		String url = chromebrowser.findElement(By.partialLinkText("Google")).getAttribute("href");
		System.out.println("url="+ url);

		//		getAttribute("attr name ");
		// getAttribute("name");  // firstname  
		//		 getAttribute("id");   // idfirst
		//		 getAttribute("class");   // firstclass


		// FAq:  get all links counts in web apge  and display url

		List<WebElement>   allLinks= 	chromebrowser.findElements(By.tagName("a"));

		int linksCnt = allLinks.size();
		System.out.println("linksCnt= " + linksCnt);// linksCnt= 7

		// get 1st link url
		WebElement  link1=  allLinks.get(0);
		String  url1 = link1.getAttribute("href");
		System.out.println("url =" + url1);

		// get 2nd link url



		// get all links url using for loop
	
//		for (i=0;i<7;i++)
		for (int i=0; i < allLinks.size() ;i++)
		{
		String linktext= 	allLinks.get(i).getText();
			System.out.println("Link name="+linktext +"link. "+i +  ",url="+allLinks.get(i).getAttribute("href"));
			
		}
		// Index 7 out of bounds for length 7


	}



}


