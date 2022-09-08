package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//open firefox browser
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		String currurl = driver1.getCurrentUrl();
		System.out.println("currurl ="+currurl);
		
		String title = driver1.getTitle(); //title =All webobjects MyTitle Sumanth
		System.out.println("title ="+title);
		
		String pagesource = driver1.getPageSource();
		System.out.println("pagesource ="+pagesource);
		
		driver1.close();// it close recently opened window/ currently highlighted window
		//driver1.quit();
	}

}
