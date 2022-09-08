package QuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookregistrationpage {
// Write a script to select your date of birth in facebook registration page?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.facebook.com/
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		//driver.findElement(By.xpath("//input[@aria-describedby='js_1g1']")).sendKeys("naresh");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naresh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("naresh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("naresh");
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel1 = new Select(day);
		Select sel2 = new Select(month);
		Select sel3 = new Select(year);
		sel1.selectByIndex(24);
		sel2.selectByIndex(6);
		sel3.selectByValue("1996");
		WebElement selectedday = sel1.getFirstSelectedOption();
		WebElement selectedmonth = sel2.getFirstSelectedOption();
		WebElement selectedyear = sel3.getFirstSelectedOption();
		
		System.out.println("selectedDay ="+selectedday.getText());
		System.out.println("selectedmonth ="+selectedmonth.getText());
		System.out.println("selectedyear ="+selectedyear.getText());
		
		
		

	}

}
