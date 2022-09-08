package MultipleBrowserWindwosHandling;

import java.util.HashSet;
import java.util.Iterator;

public class HashSETforINTvalues {

	public static void main(String[] args) throws InterruptedException {

		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(11);
		hs.add(22);
		hs.add(33);
		hs.add(44);
		hs.add(55);
		hs.add(66);
		
		int cnt = hs.size();
		System.out.println("cnt value is =" +cnt);//cnt value is =6
		
	    hs.remove(33);
	    int cnt1 = hs.size();
		System.out.println("cnt1 value is =" +cnt1);//cnt1 value is =5
		
		boolean value33 = hs.contains(33);
		System.out.println("is value 33 in hs ="+value33);//is value 33 in hs =false
		
		Class<? extends HashSet> C = hs.getClass();
		System.out.println("class is ="+C);  //class is =class java.util.HashSet
		
		boolean ishsempty = hs.isEmpty();
		System.out.println("ishsempty ="+ishsempty);  //ishsempty =false
		
		Iterator<Integer>   it  = hs.iterator();
		while (it.hasNext())
		{
			int integerval = it.next().intValue();
			System.out.println("integerval  ="+integerval);
		}
//		        integerval  =66
//		        integerval  =22
//				integerval  =55
//				integerval  =11
//				integerval  =44
		
		int i;
		for(Integer val :hs)
		{
			System.out.println("value = "+ val);
		}       
//		        value = 66
//				value = 22
//				value = 55
//				value = 11
//				value = 44
		
		
	}

}
