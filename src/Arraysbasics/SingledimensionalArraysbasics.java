package Arraysbasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingledimensionalArraysbasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//****************************
		// Declaration of array
		int i;
		int a [] = new int[4];
		
	    a [0]=10;
	    a [1]=20;
	    a[2]=30;
	    a[3]=40;
	    
	    
	    System.out.println();
	    // How to print all values in array?
	    // how to get length/count of values in an array?
	   int cnt = a.length;
	   System.out.println("cnt  ="+cnt);
	    for (i=0;i<=cnt-1;i++)
	    {
	        
	    	System.out.println("values  = " + a[i]);
	    }
	    
	    // write for loop to print all values/variables in an array?--> for each loop
	    for (int vals  :a)
	    {
	    	System.out.println("vals  ="+vals);
	    }
	    //System.out.println("a[-1]  ="+ a[-1]); // Index -1 out of bounds for length 4 at Arraysbasics.Arraysbasics.main(Arraysbasics.java:46)
	  //print values in descending order manner by using for loop
		for(i=cnt-1;i>=0;i--)
		{
			System.out.println("cnt intvaluesin in desending order ="+ a[i]);
		}

	    // Q : How to declare float array?
		float b[];
		b = new float[6];
		b[0]=10.011f;
		b[1]=20.021f;
		b[2]=30.031f;
		b[3]=40.041f;
		b[4]=50.051f;
		b[5]=60.061f;
		
	int cnt1 =	b.length;
	System.out.println("cnt1  ="+ cnt1);
	
	for (i=0;i<=cnt1-1;i++)
	{
		System.out.println(" floatcnt ="+b[i]);
	}
	
	for (float  floatcntvalues: b)
	{
		System.out.println("floatcntvalues ="+floatcntvalues);
	}
	//print values in descending order manner by using for loop
	for(i=cnt1-1;i>=0;i--)
	{
		System.out.println("intvaluesin in desending order ="+ b[i]);
	}
	
	
	
	
	char c[];
	c = new char[4];
	c[0]='u';
	c[1]='v';
	c[2]='w';
	c[3]='x';
	
	int charcnt =  c.length;
	System.out.println("charcnt  ="+ charcnt);
	
	for (i=0;i<=charcnt-1;i++)
	{
		System.out.println("charcnt values  ="+ c[i]);
	}
		
		for (char  charcnt1   :c)
		{
			System.out.println("charcnt1  values  ="+ charcnt1);
		}
		//print values in descending order manner by using for loop
				for(i=charcnt-1;i>=0;i--)
				{
					System.out.println("charvaluesin in desending order ="+ c[i]);
				}
		
		
		double d[];
		d = new double[4];
		d[0]=10.0111;
		d[1]=20.0211;
		d[2]=30.0311;
		d[3]=40.0311;
		
	
		
		int  doublecnt = d.length;
		System.out.println("doublecnt values ="+ doublecnt);
		
		for(i=0;i<=doublecnt-1;i++)
		{
			System.out.println("doublearr values ="+ d[i]);
		}
		
		for (double doublearrcnt:d)
		{
			System.out.println("doublearrcnt ="+ doublearrcnt);
		}
		//print values in descending order manner by using for loop
		for(i=doublecnt-1;i>=0;i--)
		{
			System.out.println("doublevaluesin in desending order ="+ d[i]);
		}
		
		
		// declaring all array values in at a time
		// second way of define array
		
		int e[]= {11,22,33,44,55,66,77};
		int eintlength = e.length;
		System.out.println("eintlength ="+eintlength);
		
		
		//how to print values from higher to lower (in ascending order)
		for (i=0;i<=eintlength-1;i++)
		{
			System.out.println("eint values ="+ e[i]);
		}
		
		// how to print values from higher to lower (in descending order)
		
		for(i=eintlength-1;i>=0;i--)
		{
			System.out.println("eint descendingvalues ="+ e[i]);
		}
		
		// Doubt : can we able to print value in descending order by using foreach loop
		
		// by using predecrement can we able to print values
		
//		for(i=eintlength;i>=0;--i)  //Index 7 out of bounds for length 7
//			//at Arraysbasics.SingledimensionalArraysbasics.main(SingledimensionalArraysbasics.java:161)
//		{
//			System.out.println("eint pre decrement descendingvalues ="+ e[i]);
//		}
		
		//Q :  can we change array size?
		// Ans: Arrays can either hold primitive values or object values. An ArrayList can only hold object values.
		    //You must decide the size of the array when it is constructed. 
		    // You can't change the size of the array after it's constructed.
		

	}

}
