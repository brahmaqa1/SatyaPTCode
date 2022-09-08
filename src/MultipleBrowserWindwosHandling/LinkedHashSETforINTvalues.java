package MultipleBrowserWindwosHandling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSETforINTvalues {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(11);
		lhs.add(22);
		lhs.add(33);
		lhs.add(44);
		lhs.add(55);
		lhs.add(66);
		
		int cnt = lhs.size();
		System.out.println("count ="+cnt);  //count =6
		
		lhs.remove(66);
		int finalcnt = lhs.size();
		System.out.println("finalcount ="+finalcnt); //finalcount =5
		
		boolean islhscontains66 = lhs.contains(66);
		System.out.println("islhscontains66 ="+ islhscontains66);  //islhscontains66 =false
		
		int hashcode = lhs.hashCode();
		System.out.println("hashcode  ="+hashcode);  //hashcode  =165 ??????????
		
		boolean Islhsempty = lhs.isEmpty();
		System.out.println("Islhsempty  ="+Islhsempty);  //Islhsempty  =false
		
		// get all values from object/class
		Iterator<Integer> it =  lhs.iterator();
		while(it.hasNext())
		{
			int integerval = it.next().intValue();
			System.out.println("integerval  ="+integerval);
		}
//		        integerval  =11
//				integerval  =22
//				integerval  =33
//				integerval  =44
//				integerval  =55
		
		//foreach loop
		for(Integer value :lhs)
		{
			System.out.println("value is  ="+value);
		}
//		        value is  =11
//				value is  =22
//				value is  =33
//				value is  =44
//				value is  =55
		
		
		
		
	}

}
