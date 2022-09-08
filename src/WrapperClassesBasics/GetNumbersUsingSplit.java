package WrapperClassesBasics;

public class GetNumbersUsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "a1b2c3*(.";
		String sarr[] = s.split("");
		String numStr ="";
		int  numCnt = 0;
//		 for(String val : sarr)
//		 {
//			 char ch=  val.charAt(0);
//			 if(Character.isDigit(ch))
//			 {
//				 numStr = numStr + ch;
//				 numCnt = numCnt + 1;
//			}
//		 }	
//		 System.out.println("Numbers string is ="+ numStr);
//		 System.out.println("Numbers cnt in string ="+ numCnt);
		
		//2
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				numStr = numStr + ch;
				numCnt = numCnt + 1;
			}
		}
		System.out.println("Numbers string is ="+ numStr);//Numbers string is =123
	    System.out.println("Numbers cnt in string ="+ numCnt);//Numbers cnt in string =3

	}

}
