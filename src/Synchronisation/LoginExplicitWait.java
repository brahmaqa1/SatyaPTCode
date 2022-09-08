package Synchronisation;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//txtUsername
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//txtPassword
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.name("Submit")).click();

		//  wait for cond -- till eleement is visiable
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu_leave_applyLeave")));

		// move mouse over Admin tab
		Actions act = new Actions(driver);
		//				
		WebElement	AdminTabEle= driver.findElement(By.id("menu_leave_applyLeave"));

		act.moveToElement(AdminTabEle).perform();// Error :  incase if it is not visible, we try to move the mouse over -
		//MoveTargetOutOfBoundsException: move target out of bounds

		// move mouse over on user manaegement
		WebElement	UserManagementEle= driver.findElement(By.id("menu_admin_UserManagement"));
		act.moveToElement(UserManagementEle).perform();

		//  move mouse over users  and lcikc user links
		
		WebElement UsersEle= driver.findElement(By.id("menu_admin_viewSystemUsers"));
		act.moveToElement(UsersEle).click().perform();









		System.out.println("ends ");


	}

}
