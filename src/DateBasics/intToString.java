package DateBasics;

public class intToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if(10 == "10") // eroor 
		if("10" == "10")
		{
			System.out.println("equals");// ok
		}
		else
		{
			System.out.println(" not equals");
		}
		
		
		String s="10";
//		if(s == 10) //errr
//		{
//			System.out.println("equals");
//		}
		
		int i=Integer.parseInt(s);
		System.out.println("i=" + i);// 10
		if(i == 10) //errr
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println(" not equals");
		}
		
		// convert int to String
		String s2= String.valueOf(100);
		System.out.println("s2=" +s2);//"100"
//		if(s2 == "100")  //Care false 
			if(s2.equals("100"))  // true
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println(" not equals");// ok Care 
		}
		
		
	}

}
