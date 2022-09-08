package WrapperClassesBasics;

public class GetSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "a1 b2 c3 *( .";
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
//			String spcStr ="";
			int  spcStrCnt = 0;
			for(int i=0;i<=charr.length-1;i++)
			{
				if(Character.isSpace(charr[i]))
				{
					//System.out.println("Alphabets from string ="+charr[i]);
//					spcStr= spcStr + charr[i];
					spcStrCnt= spcStrCnt +1;
				}
			}
//			System.out.println("Spaces String ="+spcStr); 
			System.out.println("Spaces count in String ="+spcStrCnt);  //Spaces count in String =4

			
			
			//HW 
				Character.isLowerCase(0);
				Character.isUpperCase(0);
			
				System.out.println(Character.isWhitespace('c'));// false
			      System.out.println(Character.isWhitespace(' ')); // true
			      System.out.println(Character.isWhitespace('\n')); // true
			      System.out.println(Character.isWhitespace('\t')); // true
				
				
				
		
	}

}
