package MultipleBrowserWindwosHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArraylistforFLOATvalues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<Float> fl = new ArrayList<Float>();
		fl.add(11.11f);
		fl.add(22.22f);
		
//		fl.add(3, 44.44f);
//		int cnt = fl.size();
//		System.out.println("cnt value is ="+cnt);//IndexOutOfBoundsException: Index: 3, Size: 2
//		// we got this error for assigning float value for index3, without assigning any value in index2(fl.add(3, 44.44f);)
		
		fl.add(2, 33.33f);
		fl.add(3, 44.44f);
		int cnt = fl.size();
		System.out.println("cnt value is ="+cnt);  // cnt value is =4
		
//		boolean flfound = fl.contains(22.22);
//		System.out.println("flfound ="+flfound);//flfound =false, got this error bcoz i have forgot to mention f in float declaration.
		
		boolean flfound = fl.contains(22.22f);
		System.out.println("flfound ="+flfound);  //flfound =true
		
		float value1 = fl.get(0);
		System.out.println("value 1 ="+value1);  //value 1 =11.11
		
		int indexnoof3rdvalue =  fl.indexOf(33.33f);
		System.out.println("index no of 33.33 value ="+indexnoof3rdvalue);  //index no of 33.33 value =2
		
		boolean isflarrempty = fl.isEmpty();
		System.out.println("isflarrempty ="+isflarrempty);  //isflarrempty =false
		
		Iterator<Float> it =  fl.iterator();
		while (it.hasNext())
		{
			float value = it.next();
			System.out.println("value ="+value);
		}
		
		// forloop
		int i;
		for(i=0;i<=cnt-1;i++)
		{
			int intarrval = fl.get(i).intValue();
			System.out.println("intarrval ="+intarrval);
		}
		
		//foreach loop
		for(Float floatarrval : fl )
		{
			System.out.println("floatarrval ="+floatarrval);
		}
		
	}

}
