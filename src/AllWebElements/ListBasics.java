package AllWebElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<String> al =  new ArrayList<String>();
		
		al.add("Ram");
		al.add("sita");
		al.add("Raju");
		System.out.println("al="+ al);
		//al=[Ram, sita, Raju]
		
		// count of value 
		int cnt= al.size();
		System.out.println("cnt= "+  cnt); // 3
		
		// get 1st val from arry list
		String firstval= al.get(0);
		System.out.println("firstval=" +firstval);// Ram
		
		// HW get all values   for loop with i=0
		
		
		//get all values from array list uisng  For each loop
		
		for(String eachVal   :  al)
		{
			System.out.println("val from al="+  eachVal);
		}
		
		
		
		
		
		
		
		
		
	}

}
