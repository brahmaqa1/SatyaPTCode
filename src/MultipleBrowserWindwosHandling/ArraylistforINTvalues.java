package MultipleBrowserWindwosHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArraylistforINTvalues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(3, 44);
		int arraysize = al.size();
		System.out.println("arraysize is = "+arraysize);//arraysize is = 4
		boolean value = al.contains(11);
		System.out.println("is value present ="+value);//is value present =true
		int value1 = al.get(0);
		System.out.println("value1 ="+value1);//value1 =11
		int indexnoOf44 = al.indexOf(44);
		System.out.println("index no Of 44 is ="+indexnoOf44);//index no Of 44 is =3
		boolean isalisempty = al.isEmpty();
		System.out.println("isalisempty ="+isalisempty);//isalisempty =false
		
		Iterator<Integer>  it = al.iterator();
		while (it.hasNext())
		{
			Integer valueinarr = it.next();
			System.out.println("valueinarr = "+valueinarr);
		}
		
		int i;
		for(i=0;i<=arraysize-1;i++)
		{
			int intVALis = al.get(i).intValue();
			System.out.println("intVALis ="+intVALis);
		}
		
		for(int intvalsare :al)
		{
			System.out.println("int val's are = "+intvalsare);
		}
		
	}

}
