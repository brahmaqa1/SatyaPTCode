package Utilies;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class GenericUtilies 
{
	WebDriver driver;
	WebElement ele ;
	// Browser
	// open browser

	public void openBrowser(String BrowserName, String url)
	{	
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
			// Creation driver object from chrome browser
			driver = new ChromeDriver();

		}
		else if(BrowserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
			// Creation driver object from firefox browser
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver",".//Drivers//msedgedriver.exe");
			// Creation driver object from Edge browser
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please enter the valid browser name="+BrowserName);
		}


		//open url in browser
		driver.get(url);

	}

	public void closeBrowser()
	{
		driver.close();
	}

	// getTitleofBrowser()
	public String getTitleOfTheBrowser()
	{
		String Title = driver.getTitle();
		return Title;

	}

	//	 public String getTitleofBrowser()
	//	 {
	//	
	//	 }
	//	 

	// textbox
	//enter_Value_In_Textbox
	//"//input[@name='firstname']"
	//	 enter_Value_In_Textbox("//input[@name='firstname']","Raju");
	public void enter_Value_In_Textbox(String Xpath, String Value_to_be_entered)
	{
		System.out.println("driver="+driver);
		try {
			driver.findElement(By.xpath(Xpath)).sendKeys(Value_to_be_entered);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please check the Xpath ="+Xpath);
		}

	}


	//   enter_Value_In_Textbox("firstname_name","Raju");
	// enter_Value_In_Textbox("idfirst_id","Raju");
	// enter_Value_In_Textbox("//input[@name='firstname']_xpath","Raju");
	public void enter_Value_In_Textbox2(String locatorName, String Value_to_be_entered)
	{
		/*
		 * System.out.println("driver="+driver); System.out.println("local name="+
		 * locatorName);//firstname_name
		 * 
		 * String sarr[] = locatorName.split("_"); String ActuallocVal = sarr[0]; //
		 * firstname String locName= sarr[1];// name System.out.println("locName="+
		 * locName + ",val="+ActuallocVal);
		 * 
		 * 
		 * if(locName.equals("name")) { System.out.println("Calling By.locName="+locName
		 * ); //
		 * driver.findElement(By.name(ActuallocVal)).sendKeys(Value_to_be_entered);//
		 * getElement(locatorName). sendKeys(Value_to_be_entered); }
		 * 
		 * if(locName.equals("id")) { System.out.println("Calling By.locName="+locName
		 * ); driver.findElement(By.id(ActuallocVal)).sendKeys(Value_to_be_entered); }
		 * if(locName.equals("xpath")) {
		 * System.out.println("ActuallocVal="+ActuallocVal);
		 * driver.findElement(By.xpath(ActuallocVal)).sendKeys(Value_to_be_entered); }
		 * 
		 * else { System.out.println("invlaid loca="+locName); }
		 */

		//******************

		if( getElement(locatorName).isDisplayed())
		{
			System.out.println("ele displayed");
			if( getElement(locatorName).isEnabled())
			{
				System.out.println("ele enabled ");
				getElement(locatorName).sendKeys(Value_to_be_entered);
			}

		}

	}


	public WebElement getElement(String locatorName)
	{
		System.out.println("local  full name="+ locatorName);//firstname_name


		String sarr[] = locatorName.split("_");
		String ActuallocVal = sarr[0];  // firstname
		String locName= sarr[1];// name
		System.out.println("locName="+ locName  + ",val="+ActuallocVal);

		try {

			//WebElement ele = null ;
			if(locName.equals("name"))
			{
				//					 System.out.println("Calling By.locName="+locName );
				//						WebElement ele =  driver.findElement(By.name(ActuallocVal));
				ele =  driver.findElement(By.name(ActuallocVal));
			}

			else if(locName.equals("id"))
			{		
				//					 System.out.println("Calling By.locName="+locName );
				ele = driver.findElement(By.id(ActuallocVal));
			}
			else if(locName.equals("xpath"))
			{
				System.out.println("ActuallocVal="+ActuallocVal);
				ele = driver.findElement(By.xpath(ActuallocVal));
			}		 
			else
			{
				System.out.println("invalid locator="+locatorName);
			}



		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element is not found with given locator="+locatorName );
		}



		return ele;

	}

	//	 Val= get_Val_From_Textbox("firstname_name")
	public String get_Val_From_Textbox(String locatorName)
	{		
		String ValFromTextbox= getElement(locatorName).getAttribute("value");
		return ValFromTextbox;

	}

	// Checkbox
	public void click_on_check_box(String locatorName)
	{
		boolean IsSelected = getElement(locatorName).isSelected();
		System.out.println("Is Checkbox Selected  ="+IsSelected);
		if(IsSelected==false)
		{
			getElement(locatorName).click();
		}		
		else
		{
			System.out.println(" Checkbox  already  Selected and status  ="+IsSelected);
		}

	}


	//Radiobutton
	public void Click_on_Radio_Button(String locatorName)
	{
		if(getElement(locatorName).isDisplayed())
		{
			System.out.println("Radiobutton is Displayed");
			if(getElement(locatorName).isEnabled())
			{
				System.out.println("Radiobutton is Enabled");
				if(getElement(locatorName).isSelected())  //  if selected = trie- dont click
				{
					System.out.println("Is Radiobutton Selected");
				}
				else
				{
					System.out.println(" Radiobutton is not Selected. so click");
					getElement(locatorName).click();
				}
			}
		}
		//		 boolean IsSelected = getElement(locatorName).isSelected();
		//		 System.out.println("Is Radiobutton Selected  ="+IsSelected);
		//		 getElement(locatorName).click();

	}

	// Button
	//	 boolean IsSelected = getElement(locatorName).isSelected();
	//	 System.out.println("Is button Selected  ="+IsSelected);
	//	 getElement(locatorName).click();
	public void Click_on_Button(String locatorName)
	{
		if(getElement(locatorName).isDisplayed())
		{
			System.out.println("Button is Displayed");
			if(getElement(locatorName).isEnabled())
			{
				System.out.println("Button is Enabled"); // Button is Enabled, click on button.
				getElement(locatorName).click();
			}
		}
	}
	//click on check box based on Activity code
	public void Click_On_CheckBox_Based_On_ActivtyCode(String ActivityCode)
	{
		try {
			ele = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+ActivityCode+"')]/parent::td/following-sibling::td[4]/input[@type='checkbox'][1]"));
			ele.click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityCode" + ActivityCode+" is not found.Exception details ="+e);
		} 
	}
	//get branch city name based on activitycode from HulTablee01.
	public String Get_BranchName_From_HulTablee01_Basedon_ActivityCode(String ActivityCode)
	{
		WebElement branchName = null;
		String text = null;
		try {
			branchName = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+ActivityCode+"')]/parent::td/following-sibling::td[2]"));
			text = branchName.getText();
			System.out.println("text ="+text);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Activity code is not found ="+e);
		} 
		//		System.out.println("displyed="+ branchName.isDisplayed());
		//		if (branchName.isDisplayed()) {
		//			String text = branchName.getText();
		//			 System.out.println("text ="+text);
		//		} else {
		//			System.out.println("Activity code is not found");
		//		}
		return text;	
	}
}
