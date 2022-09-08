package MultipleBrowserWindwosHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetBasics {

	public static void main(String[] args) {
		
		// List basics
		ArrayList<String>  al = new ArrayList<String>();
		
		System.out.println("al is empty="+ al.isEmpty());
		
		// add
		al.add("Ramu");
		al.add("Sita");
		al.add("Raju");
		System.out.println("al is empty= "+ al.isEmpty());
		System.out.println("aarray list= " + al);
		// aarray list= [Ramu, Sita, Raju]
		
		//  stores  vals in sequentially and preserve index no
		//   allows duplicate values
		al.add("Ramu");
		System.out.println("aarray list= " + al);
//		aarray list= [Ramu, Sita, Raju, Ramu]
		
		// allows null
		al.add(null);
		System.out.println("aarray list= " + al);
//		aarray list= [Ramu, Sita, Raju, Ramu, null]
		
		// get 1st val
		String   firstVal= al.get(0);
		System.out.println("first val=" + firstVal);
		//first val=Ramu
		// HW  get all vals from array list obj  using for loop with index no
		
		
		// HW  get all vals from array list obj  using for each loop 
		
		
		// 3. iterator
		  Iterator<String>  it=  al.iterator();
		  String val1= it.next();
		  System.out.println("val="+ val1);
		  
		  val1= it.next();
		  System.out.println("val="+ val1);
		  
//		  val1= it.next();
//		  System.out.println("val="+ val1);
//		  
//		
//		  val1= it.next();
//		  System.out.println("val="+ val1);
//		  
//		  val1= it.next();
//		  System.out.println("val="+ val1);
		  
//		  val1= it.next();// there is no 6 th val in array list
//		  System.out.println("val="+ val1);// java.util.NoSuchElementException  if there is no val in array list, then we are trying to gte 
//		  next value, it throwsNoSuchElementException  
		  System.out.println("using while loop");
		  while (it.hasNext())
		  {
			String val =  it.next();
			System.out.println("val="+ val);
		  }
		
		//*****************************
		HashSet<String> hs =  new HashSet<String>(); 
		
		//  add string val
		hs.add("Sowmya");
		hs.add("Swathi");
		hs.add("Suseela");
		System.out.println("hs= " + hs);// no index no in hashset-  does not preserve index no
		// hs= [Swathi, Suseela, Sowmya]  // it wont store values sequentially i.e it stores values randomly
		
		// does not  allow duplicate vals
		hs.add("Suseela");
		System.out.println("hs= " + hs);// hs= [Swathi, Suseela, Sowmya]
		
		// null
		hs.add(null);
		System.out.println("hs= " + hs);// hs= [null, Swathi, Suseela, Sowmya]
		
		// wont allow duplicate null values
		hs.add(null);
		System.out.println("hs= " + hs);// it does not add duplicate null value
		//hs= [null, Swathi, Suseela, Sowmya]
		
		//get vals from hashset
		// using index 
				
//		hs.get(0);// The method get(int) is undefined for the type HashSet<String>
		// 2. for each loop
		
		
		
		/*
		 * Iterator<String> it= hs.iterator(); String val1= it.next();
		 * System.out.println("val1= " + val1);
		 * 
		 * 
		 * String val2= it.next(); System.out.println("val1= " + val2);
		 * 
		 * String val3= it.next(); System.out.println("val1= " + val3);
		 * 
		 * String val4= it.next(); System.out.println("val1= " + val4);
		 */
		
//		String val5= it.next();
//		System.out.println("val1= " + val5);// erro as we dont 5 th val in hashset
//		 java.util.NoSuchElementException
		
		System.out.println("get all vals from hashste**************");
	 Iterator<String> it2= 	hs.iterator();
	 while(it2.hasNext())
	 {
		String val=  it2.next();
		System.out.println("val=" + val);
		/*
		 * val=null val=Swathi val=Suseela val=Sowmya
		 */
	 }
		
		
		

	}

}
