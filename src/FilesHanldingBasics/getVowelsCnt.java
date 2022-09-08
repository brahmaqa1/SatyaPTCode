package FilesHanldingBasics;

public class getVowelsCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Rama is AE";

		char charr[] = s.toCharArray();
		
		int vowelsCnt=0;

		for(char eachchar : charr)
		{
			String s2 =Character.toString(eachchar);
			s2= s2.toUpperCase();
			if(s2.equals("A") | s2.equals("E") | s2.equals("I")| s2.equals("O") |s2.equals("U") )
			{
				//			if(eachchar =='a' | eachchar=='e' | eachchar=='i' | eachchar =='o' | eachchar=='u' )
				
					System.out.println("Given char is vowel=" + s2);
				
			}
		}
		// 2nd 
		
		
		System.out.println("ends");
	}
	}
