package WrapperClassesBasics;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "a1b2c3*(.";
		// get only no 1020 from string  
		char charr[]= s.toCharArray();
		
		//2 
//		String sarr[]= s.split("");
//		
//		for(String eachVal  : sarr)
//		{
//			System.out.println("eachval="+eachVal );
//		}
		
		String numStr="";
		int digitscnt= 0;
//		for(int i=0;i<= charr.length-1;i++)
//		{
////			System.out.println("get each char from array="+ charr[i]);
//			
//			if(Character.isDigit(charr[i]))
//			{
//				System.out.println("digits from String ="+ charr[i]);
//				numStr = numStr + charr[i];
//				//         "" + 1 = "1" + 0 =  "10"+ 2 = "102" +0 = 1020
//				digitscnt = digitscnt+1;
//			}
//		}
//			System.out.println("numStr="+numStr);// 1020
//			System.out.println("digitscnt="+digitscnt);
		
		//HW Get only characters from string?  and get count
			String alphaStr ="";
			for (int i=0;i<=charr.length-1;i++)
			{
				if(Character.isAlphabetic(charr[i]))
				{
					System.out.println("Alphabbets from string ="+charr[i]);
				}
			}
		
		// HW .get only special characters   and get count		
		
	}

}
