package MultipleBrowserWindwosHandling;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetforINTvalues {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(02);
		ts.add(12);
		ts.add(22);
		ts.add(32);
		ts.add(42);
		ts.add(52);
		int cnt = ts.size();
		System.out.println("size of an array ="+cnt);  //size of an array =6
		
		ts.remove(32);
		ts.remove(52);
		int finalcount = ts.size();
		System.out.println("size of an final array ="+finalcount);  //size of an final array =4
		
		boolean contains = ts.contains(12);
		System.out.println("contains ="+contains);	//contains =true
		
		int firstval =  ts.first();
		System.out.println("first integer value is ="+firstval);  //first integer value is =2
		
		int lastval = ts.last();
		System.out.println("last interger value is ="+lastval);   //last interger value is =42
		
		int higherval = ts.higher(02);
		System.out.println("heigher integer value than 02 is ="+higherval);//heigher integer value than 02 is =12
//		 higherval = ts.higher(42);
//		System.out.println("heigher integer value than 42 is ="+higherval);
		//NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.util.TreeSet.higher(Object)" is null
		higherval = ts.higher(12);
		System.out.println("heigher integer value than 12 is ="+higherval);  //heigher integer value than 12 is =22
		
		int lowerval = ts.lower(12);
		System.out.println("The value lower than 12 is ="+lowerval);  //The value lower than 12 is =2
		
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext())
		{
			int intval =it.next().intValue();
			System.out.println("the integer value is ="+intval);
		}
//		        the integer value is =2
//				the integer value is =12
//				the integer value is =22
//				the integer value is =42
		
		//for each loop
		
		for(int value:ts)
		{
			System.out.println("integer value  ="+value);
		}
//		        integer value  =2
//				integer value  =12
//				integer value  =22
//				integer value  =42
		
		//forloop
		
		int i;
		for(i=0;i<=finalcount-1;i++)
		{
			ts.add(i);
			System.out.println("ts array ="+ts);
		}
		
	}

}
