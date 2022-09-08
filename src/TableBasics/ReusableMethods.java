package TableBasics;

import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {
	static WebDriver driver;
	//	Author		:  Brahma
	//	Method Name	:	is_Activitycode_Exist
	//	Description	:	Ir Checks given activity code is exist in table or not
	//	Parameters	:  String -Activitycode
	//	Return Type	:  String it returns Pass if Activitycode is exist else Fail
	//	Created Date :  26 -Jul 2022
	//	Metid call	: 	is_Activitycode_Exist("10110102"); 
	//					is_Activitycode_Exist("101101343"); 	
	public static String is_Activitycode_Exist(String Activitycode)
	{
		boolean res;
		try {
			res= driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[contains(text(),'"+  Activitycode + "')]")).isDisplayed();
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Activitycode="+Activitycode + " is not found in table");
			return "Fail";
		}

		if(res)
		{
			System.out.println("Activitycode="+Activitycode + " is found in table");
			return "Pass";
		}
		//		else
		//		{
		//			System.out.println("Activitycode="+Activitycode + " is not found in table");
		//			return "Fail";
		//		}		
		return "Fail";

	}


	public static void click_TerminateCheckbox_BasedOn_Given_ActivityCode(String ActivityCode)
	{
		try {
			WebElement checkbox = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[contains(text(),'" + ActivityCode + "')]/parent::td/following-sibling::td[4]/input[@type='checkbox']"));
			checkbox.click();
		}
		catch (Exception e) {
			System.out.println("Activity code is not found");
		}

	}

	//Get text from branch column based on given Activity code

	public static String get_text_from_branch_basedon_given_ActivityCode (String ActivityCode)
	{
		WebElement BranchEle;
		try {

			//table[@id='HulTablee01']/tbody/tr/td/a[contains(text(),'10110101')]/parent::td/following-sibling::td[2]
			BranchEle = driver.findElement(By.xpath("//table[@id='HulTablee01']/tbody/tr/td/a[contains(text(),'" + ActivityCode + "')]/parent::td/following-sibling::td[2]"));

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Text is not found.Exception ="+ e);	
			return "not found";
		}

		if(BranchEle.isDisplayed())
		{		
			String txt = BranchEle.getText();
			System.out.println("Text is  ="+txt);			
			return "found";
		}
		else {
			System.out.println("Text is not found");

			return "not found";
		}
	}



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");





		// HW Write a method and pass activity code   and return  String - Pass/ Fail.

		//		is_Activitycode_Exist("10110101");   
		//		String res2= 	is_Activitycode_Exist("10110102"); 
		//		System.out.println("res2="+ res2);
		//		String res3= is_Activitycode_Exist("101101343");
		//		System.out.println("res3="+ res3);


		//		click_TerminateCheckbox_BasedOn_Given_ActivityCode("10110101");
		//		click_TerminateCheckbox_BasedOn_Given_ActivityCode("10110102");
		//		click_TerminateCheckbox_BasedOn_Given_ActivityCode("10110103");
		//		click_TerminateCheckbox_BasedOn_Given_ActivityCode("10110104");
		//		click_TerminateCheckbox_BasedOn_Given_ActivityCode("10110133");


		String result10110101 = get_text_from_branch_basedon_given_ActivityCode("10110101");
		System.out.println("result10110101  ="+result10110101);
		String resultresult10110102 = get_text_from_branch_basedon_given_ActivityCode("10110102");
		System.out.println("resultresult10110102 ="+resultresult10110102);

		String resultresultresult1011011 =  get_text_from_branch_basedon_given_ActivityCode("3453535");
		System.out.println("resultresultresult1011011  ="+resultresultresult1011011);




		// HW write a method  and pass Activity  code and Click Check boox
		//		click_Terminate_ActivityCode("101");

		System.out.println("ends");
		
		//<a href="/profiles/1629/angelo-mathews" title="View profile of Angelo Mathews" class="cb-text-link"> Angelo Mathews </a>
		//div[@id='innings_3']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//a[text()=' Angelo Mathews ']/parent::div/following-sibling::div[2]
		
		



	}

}
