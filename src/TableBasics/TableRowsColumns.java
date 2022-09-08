package TableBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableRowsColumns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");


		//  get all rows count
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='TestCaseTable01']/tbody/tr"));
		int count = allrows.size();
		System.out.println("count ="+count);

		// HW:  get all columns  cnt 
		
		List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/th"));
		 count = allcolumns.size();
		System.out.println("count ="+count);




		// get data from 1st row - 1st cell
		
		String firstrowfirstcelltxt = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/th[1]")).getText();
		System.out.println("firstrowfirstcelltxt ="+firstrowfirstcelltxt);


		// get data from 1st row - 2nd cell
		String firstrowsecondcelltxt = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/th[2]")).getText();
		System.out.println("firstrowsecondcelltxt ="+firstrowsecondcelltxt);


		//Hw: get data from 2nd row - 1st cell
		String secondrowfirstcelltxt = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr[2]/child::td[1]")).getText();
		System.out.println("secondrowfirstcelltxt ="+secondrowfirstcelltxt);



		//Hw: get data from 2n row - 2nd cell
		String secondrowsecondcelltxt = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody/tr[2]/child::td[2]")).getText();
		System.out.println("secondrowsecondcelltxt ="+secondrowsecondcelltxt);



		//  get all rows and all cells data 
		String allrowstxt = driver.findElement(By.xpath("//table[@id='TestCaseTable01']/tbody")).getText();
		System.out.println("allrowstxt ="+allrowstxt);
		
		int allcellsinTestCaseTable01 =   driver.findElements(By.xpath("//table[@id='TestCaseTable01']/tbody/tr/td | //table[@id='TestCaseTable01']/tbody/tr/th")).size();
		System.out.println("allcellsinTestCaseTable01 ="+allcellsinTestCaseTable01);

		
		/// get 2nd row   2,1  2,2  2,3
		for(int i=1;i<=4;i++)
		{
			
				//table[@id='TestCaseTable01']//tr[2]/td[3]
			
				String myxpath = "//table[@id='TestCaseTable01']//tr["+ 2 + "]/td[" + i + "]";
				System.out.println("myxpath=" + myxpath);
				 allrowstxt = driver.findElement(By.xpath(myxpath)).getText();
				System.out.println("allrowstxt="  +allrowstxt);
		
			
		}
		
		
		// get 2,1, 3,1,  4,1
		
		for(int i=2;i<=4;i++)
		{
			
				//table[@id='TestCaseTable01']//tr[2]/td[3]
			
				String myxpath = "//table[@id='TestCaseTable01']//tr["+ i + "]/td[" + 2 + "]";
				System.out.println("myxpath=" + myxpath);
				String rowstxt = driver.findElement(By.xpath(myxpath)).getText();
				System.out.println("*********************************rowstxt ="  +rowstxt);
		
			
		}
		
		
		
		
		
		
		
		//1 way2:
		System.out.println("*************get data cell wise");
		for(int i=2;i<=4;i++)
		{			
			for(int j =1;j<=5 ; j++)
			{
				//table[@id='TestCaseTable01']//tr[2]/td[3]
			
				String myxpath2 = "//table[@id='TestCaseTable01']//tr["+ i + "]/td[" + j + "]"; // 2 ,1
				System.out.println("myxpath2=" + myxpath2);
				 allrowstxt = driver.findElement(By.xpath(myxpath2)).getText();
				System.out.println("allrowstxt="  +allrowstxt);
			}
			
		}
		
		
		
		
		
		
		
		//get all links which are in table 2
		
		List<WebElement> allLinksinHulTablee01 =  driver.findElements(By.xpath("//table[@id='HulTablee01']/child::tbody/child::tr/child::td/child::a"));
		int cnt = allLinksinHulTablee01.size();
		System.out.println("cnt ="+cnt);
		
		String txt1 = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[text()='10110101']")).getAttribute("href");
		System.out.println("txt1     ="+txt1);
		String txt2 = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[text()='10110102']")).getAttribute("href");
		System.out.println("txt2     ="+txt2);
		String txt3 = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[text()='10110103']")).getAttribute("href");
		System.out.println("txt3     ="+txt3);
		String txt4 = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[text()='10110104']")).getAttribute("href");
		System.out.println("txt4     ="+txt4);
		String txt5 = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[text()='10110105']")).getAttribute("href");
		System.out.println("txt5     ="+txt5);
		
		
		
		// find check boxes count in table 2
		
		int checkboxcnt = driver.findElements(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/input")).size();
		System.out.println("checkboxcnt  ="+checkboxcnt);
		
		// click on check boxes
		
		driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[2]/td/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[2]/td/input[@type='checkbox'][2]")).click();
		Thread.sleep(2000);
		//Actions act = new Actions(driver);
		 driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[3]/td/input[@type='checkbox']")).click();
//		 Thread.sleep(2000);
//		act.click().sendKeys(Keys.TAB).perform();
//		Thread.sleep(2000);
//		act.click().sendKeys(Keys.TAB).click().perform();
//		Thread.sleep(2000);
		 driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[4]/td/input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[5]/td/input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr[6]/td/input[@type='checkbox']")).click();
		 
		 
		 
		// driver.findElement(By.xpath("//table[@id='HulTablee01']//td/a[text()='10110101'] | //table[@id='HulTablee01']//tr[2]//td/input[@type='checkbox'][2]")).click();
		 
		 
		
	// click check box where Activity code =  10110102		

		 WebElement checkbox10110102 = driver.findElement(By.xpath("//table[@id='HulTablee01']//tr/td/a[contains(text(),'10110102')]/parent::td/following-sibling::td/input[@type='checkbox']"));
		 checkbox10110102.click();
		 

		// click check box where Activity code =  10110103
		 WebElement checkbox10110103 = driver.findElement(By.xpath("//table[@id='HulTablee01']//tr/td/a[contains(text(),'10110103')]/parent::td/following-sibling::td/input[@type='checkbox']"));
		 checkbox10110103.click();


		 String code= "10110104";
		 checkbox10110103 = driver.findElement(By.xpath("//table[@id='HulTablee01']//tr/td/a[contains(text(),'" + code+   "')]/parent::td/following-sibling::td/input[@type='checkbox']"));
		 checkbox10110103.click();


		System.out.println("ends");
		
		
		// HW Write a method and pass activity code   and Return type void
		
//		String res= is_Activitycode_Exist("101")   and return  String - Pass/ Fail.
			

		// HW write a method  and pass Activity  code and Click Check boox
//		click_Terminate_ActivityCode("101");
		
		


	}

}
