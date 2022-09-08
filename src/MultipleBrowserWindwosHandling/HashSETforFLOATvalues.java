package MultipleBrowserWindwosHandling;

import java.util.HashSet;
import java.util.Iterator;

public class HashSETforFLOATvalues {

	public static void main(String[] args) throws InterruptedException {

		
		HashSet<Float> hs = new HashSet<Float>();
		hs.add(11.11f);
		hs.add(22.22f);
		hs.add(33.33f);
		hs.add(44.11f);
		hs.add(55.22f);
		hs.add(66.33f);
		
		int cnt = hs.size();
		System.out.println("cnt value is =" +cnt);//cnt value is =6
		
	    hs.remove(33.33f);
	    int cnt1 = hs.size();
		System.out.println("cnt1 value is =" +cnt1);//cnt1 value is =5
		
		boolean value33 = hs.contains(33.33f);
		System.out.println("is value 33.33f in hs ="+value33);//is value 33.33f in hs =false
		
		Class<? extends HashSet> C = hs.getClass();
		System.out.println("class is ="+C);  //class is =class java.util.HashSet
		
		boolean ishsempty = hs.isEmpty();
		System.out.println("ishsempty ="+ishsempty);  //ishsempty =false
		
		
		
		
		
		for(Float val :hs)
		{
			System.out.println("value = "+ val);
		}
//		        value = 66.33
//				value = 44.11
//				value = 55.22
//				value = 11.11
//				value = 22.22
		
		for(Float val :hs)
		{
			Iterator<Float> itfloat = hs.iterator();
			System.out.println("iterateor float = "+ itfloat);
			System.out.println("val = "+val);
		}
//		        iterateor float = java.util.HashMap$KeyIterator@6f75e721
//				val = 66.33
//				iterateor float = java.util.HashMap$KeyIterator@69222c14
//				val = 44.11
//				iterateor float = java.util.HashMap$KeyIterator@606d8acf
//				val = 55.22
//				iterateor float = java.util.HashMap$KeyIterator@782830e
//				val = 11.11
//				iterateor float = java.util.HashMap$KeyIterator@470e2030
//				val = 22.22
		
		
	}

}
