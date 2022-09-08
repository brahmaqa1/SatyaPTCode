package Reusablesforwrapperclass;

public class allinOne {
	public static void allinOne(String s)
	{
		int len = s.length();
		for(int i=0;i<=len-1;i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				if(Character.isAlphabetic(ch))
				{
					//				System.out.println("alphabet  ="+ch);
					if(Character.isUpperCase(ch))
					{
						System.out.println("Uppercase letter ="+ch);
					}else {
						if(Character.isLowerCase(ch))
						{
							System.out.println("lowercase letter ="+ch);
						}
					}
				}
				else
				{
					System.out.println("Digit is ="+ch);
				}
			}else {
				System.out.println("Special character ="+ch);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		String s = "A1b!2C@3#d$4%E^5&f6";


		allinOne("A1b!2C@3#d$4%E^5&f6");
		//			allinOne("!@#$%^&*(");
		//		    allinOne("12345");
		//			allinOne("abcde");
		//			allinOne("ABCDE");


	}



}
