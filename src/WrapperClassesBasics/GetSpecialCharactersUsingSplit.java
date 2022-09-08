package WrapperClassesBasics;

public class GetSpecialCharactersUsingSplit {

	
	public static String getSpecialCharactersUsingSplit(String s)
	{
		// HW .get only special characters from a string and get count ?
			
				String strarr[] = s.split("");
				String chStr ="";
				int chCnt = 0;
				for(int i=0;i<=s.length()-1;i++)
				{
					char ch =s.charAt(i);
					if(!Character.isLetterOrDigit(ch))
					{
						chStr =chStr + ch;
						chCnt = chCnt +1;
					}
				}
//				System.out.println("chStr ="+chStr);//chStr =!@#$
//				System.out.println("chCnt ="+chCnt);//chCnt =4
				return chStr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1!b2@c3#d4$";
		String s2 = getSpecialCharactersUsingSplit(s);
		System.out.println("s2="+s2);
		
		s2 = getSpecialCharactersUsingSplit("refref214324");
		System.out.println("s2="+s2);
		
	}
}

