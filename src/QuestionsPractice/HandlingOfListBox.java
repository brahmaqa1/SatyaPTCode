package QuestionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingOfListBox {
	//Write a Script to check weather the options present in the list box are sorted or not?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		WebElement carslistboxEle = driver.findElement(By.xpath("//select[@id='idfirst']"));
		Select sel = new Select(carslistboxEle);
		ArrayList<String> alltext = new ArrayList<String>();
		List<WebElement> alloptions = sel.getOptions();
		int count = alloptions.size();
		for(int i=0;i<count;i++)
		{
			WebElement option = alloptions.get(i);
			String text = option.getText();
			System.out.println("text  ="+text);
			alltext.add(text);
		}
		ArrayList<String> alltextcopy = new ArrayList<String>(alltext);
		Collections.sort(alltextcopy);
		if(alltextcopy.equals(alltext))
		{
			System.out.println("sorted");
		}else {
			System.out.println("not sorted");
		}
	}
}
