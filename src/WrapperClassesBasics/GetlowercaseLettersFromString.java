package WrapperClassesBasics;

public class GetlowercaseLettersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "A1b2C3d4E5f6";
		String sarr[] = s.split("");
		System.out.println("String array length ="+sarr.length);
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				System.out.println("lower case ="+ch);
			}
		}
				
		
	}

}
