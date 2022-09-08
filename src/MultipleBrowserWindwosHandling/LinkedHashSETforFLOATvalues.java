package MultipleBrowserWindwosHandling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSETforFLOATvalues {

	public static void main(String[] args) {

		LinkedHashSet<Float> lhs = new LinkedHashSet<Float>();
		lhs.add(11.11f);
		lhs.add(22.22f);
		lhs.add(33.33f);
		lhs.add(44.44f);
		lhs.add(55.55f);
		lhs.add(66.66f);
		
		int cnt = lhs.size();
		System.out.println("count ="+cnt);  //count =6
		
		lhs.remove(55.55f);
		int finalcnt = lhs.size();
		System.out.println("finalcount ="+finalcnt); //finalcount =5
		
		boolean islhscontains66 = lhs.contains(66.66f);
		System.out.println("islhscontains66.66f ="+ islhscontains66);  //islhscontains66.66f =true
		
		int hashcode = lhs.hashCode();
		System.out.println("hashcode  ="+hashcode);  //hashcode  =1235217285
		
		boolean Islhsempty = lhs.isEmpty();
		System.out.println("Islhsempty  ="+Islhsempty);  //Islhsempty  =false
		
		// get all values from object/class
		Iterator<Float> it =  lhs.iterator();
		while(it.hasNext())
		{
			float floatval = it.next().floatValue();
			System.out.println("floatval  ="+floatval);
		}
//		        floatval  =11.11
//				floatval  =22.22
//				floatval  =33.33
//				floatval  =44.44
//				floatval  =66.66

		
		//foreach loop
		for(Float value :lhs)
		{
			System.out.println("value is  ="+value);
		}
//		        value is  =11.11
//				value is  =22.22
//				value is  =33.33
//				value is  =44.44
//				value is  =66.66
		
		
		
	}

}
