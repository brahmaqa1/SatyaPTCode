package WrapperClassesBasics;

public class GetUppercaseLettersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "A1b!2C@3#d$4%E^5&f6";
		int len = s.length();
		for(int i=0;i<=len-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.println("upperCaseLetter  ="+ch);
			}
		}
		System.out.println("***************************");
		//get all lower case letters?
		for(int i=0;i<=len-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				System.out.println("lowercaseletter  ="+ch);
			}
		}
		System.out.println("***************************");
		//get all digits which are present in the string  ????
		for(int i=0;i<=len-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				System.out.println("Digit is ="+ch);
			}

		}
		System.out.println("***************************");
		//get all special character which are present in the string???
		for(int i=0;i<=len-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{

			}else {
				System.out.println("special character is ="+ch);
			}
		}
		System.out.println("**********************");


	}

}
