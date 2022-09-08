package WrapperClassesBasics;

public class GetSpecialCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HW .get only special characters from a string and get count ?
		String s="a1!b2@c3#d4$";
		char charr[] = s.toCharArray();
		//		for(int i=0;i<=charr.length-1;i++)
		//		{
		//			if(Character.isLetterOrDigit(charr[i]))
		//			{
		//				//				System.out.println("given character is letter or digit");
		//			}
		//			else
		//			{
		//				System.out.println("special charaters from string ="+charr[i]);
		//				//				        special charaters from string =!
		//				//						special charaters from string =@
		//				//						special charaters from string =#
		//				//						special charaters from string =$
		//			}
		//		}


		//get all special characters as a string and count of them? 


		String splCharStr = "";
		int splCharStrCnt = 0;
		for (int i=0;i<=charr.length-1;i++)
		{
//			if(Character.isLetterOrDigit(charr[i]))
//			{
//
//			}
//			else {
//				splCharStr=splCharStr + charr[i];
//				splCharStrCnt = splCharStrCnt +1 ;
//			}
			// or
			if(!Character.isLetterOrDigit(charr[i]))
				{
				splCharStr=splCharStr + charr[i];
				splCharStrCnt = splCharStrCnt +1 ;
				}
			
		}
		System.out.println("special character in a string ="+splCharStr);  //!@#$
		System.out.println("special character count in a string ="+splCharStrCnt);  //4	
	}
}

