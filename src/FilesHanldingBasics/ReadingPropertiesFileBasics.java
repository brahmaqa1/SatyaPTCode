package FilesHanldingBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFileBasics {

	public static void main(String[] args) throws IOException {
				
		File  f=  new File("C:\\brahma\\Practise\\seleniumpractise\\SeleniumClassesForChaitanya\\src\\FilesHanldingBasics\\config.properties");
		
		FileInputStream fis  = new FileInputStream(f);
		Properties props = new Properties();
		props.load(fis);
		
		String browser= props.getProperty("Browser");		
		System.out.println("browser="+ browser);
			
//		String url= props.getProperty("URL");//  Note:  URL prop name is not exist in config.props
		// so it returns null value.. so small url and Caps URL are differenbt
		String url= props.getProperty("url");
		System.out.println("url="+ url);
		//url=file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html
		
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);	

	}

}
