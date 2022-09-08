package MultipleBrowserWindwosHandling;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetforFLOATvalues {

	public static void main(String[] args) {
		
		TreeSet<Float> ts = new TreeSet<Float>();
		ts.add(52.00f);
		ts.add(02.00f);
		ts.add(12.00f);
		ts.add(22.00f);
		ts.add(32.00f);
		ts.add(42.00f);
		
		System.out.println("tree ste=" + ts);
		int cnt = ts.size();
		System.out.println("size of an array ="+cnt);  //size of an array =6
		
		ts.remove(32.00f);
		
		int finalcount = ts.size();
		System.out.println("size of an final array ="+finalcount);  //size of an final array =5
		
		boolean contains = ts.contains(12.00f);
		System.out.println("contains ="+contains);	//contains =true
		
		float firstval =  ts.first();
		System.out.println("first integer value is ="+firstval);  //first integer value is =2.0
		
		float lastval = ts.last();
		System.out.println("last interger value is ="+lastval);   //last interger value is =52.0
		
		float higherval = ts.higher(02.00f);
		System.out.println("heigher integer value than 02.00f is ="+higherval);//heigher integer value than 02 is =12.0
//		 higherval = ts.higher(42);
//		System.out.println("heigher integer value than 42 is ="+higherval);
		//NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.util.TreeSet.higher(Object)" is null
		higherval = ts.higher(12.00f);
		System.out.println("heigher integer value than 12.00f is ="+higherval);  //heigher integer value than 12.00f is =22.0
		
		float lowerval = ts.lower(12.00f);
		System.out.println("The value lower than 12.00f is ="+lowerval);  //The value lower than 12.00f is =2.0
	
		// get all values form an array
		Iterator<Float> it = ts.iterator();
		while(it.hasNext())
		{
			float floatval =it.next().floatValue();
			System.out.println("the float value is ="+floatval);
		}
//		        the float value is =2.0
//				the float value is =12.0
//				the float value is =22.0
//				the float value is =42.0
//				the float value is =52.0
		
		//for each loop
		
		for(float value:ts)
		{
			System.out.println("float value  ="+value);
		}
//		        float value  =2.0
//				float value  =12.0
//				float value  =22.0
//				float value  =42.0
//				float value  =52.0

		//forloop
		
		float i;
		for(i=0;i<=finalcount-1;i++)
		{
			ts.add(i);
			System.out.println("ts array ="+ts);
		}
		
	}

}
