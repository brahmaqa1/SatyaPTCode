package WrapperClassesBasics;

public class GetAlphabetsUsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "a1b2c3*(.";
		String sarr[] = s.split("");
		 for(String val : sarr)
		 {
			 char ch=  val.charAt(0);
			 if(Character.isAlphabetic(ch))
			 {
				 System.out.println("alp="+ ch);
			 }
		 }
		
		 
		 // 3
		 for(int i=0;i<= s.length()-1;i++)
		 {
			 char ch= s.charAt(i);
			 if(Character.isAlphabetic(ch))
			 {
				 System.out.println("alp="+ ch);
			 }
			 
		 }
		 

	}

}
