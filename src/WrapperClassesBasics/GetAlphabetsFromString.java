package WrapperClassesBasics;

public class GetAlphabetsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "a1b2c3*(.";
		// get only alphabets from string  
		char charr[]= s.toCharArray();
		
		//HW Get only characters from string?  and get count
//			String alphaStr ="";
//			for (int i=0;i<=charr.length-1;i++)
//			{
//				if(Character.isAlphabetic(charr[i]))
//				{
//					System.out.println("Alphabbets from string ="+charr[i]);
////					        Alphabbets from string =a
////							Alphabbets from string =b
////							Alphabbets from string =c
//				}
//			}
			//get all alphabets as a string and also get count of alphabets in that string?
			String alpStr ="";
			int  alpStrCnt = 0;
			for(int i=0;i<=charr.length-1;i++)
			{
				if(Character.isAlphabetic(charr[i]))
				{
					//System.out.println("Alphabets from string ="+charr[i]);
					alpStr= alpStr + charr[i];
					alpStrCnt= alpStrCnt +1;
				}
			}
			System.out.println("alphabetic String ="+alpStr); //alphabetic String =abc
			System.out.println("alphabets count in String ="+alpStrCnt);  //alphabets count in String =3
		
		// HW .get only special characters   and get count		
		
	}

}
