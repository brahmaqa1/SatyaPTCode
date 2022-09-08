package WrapperClassesBasics;

public class CharacterClassBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Character - Class 

		//		boolean   b= Character.isDigit('1');
		//		System.out.println("b=" + b); // true
		//		
		//		b= Character.isDigit('A');
		//		System.out.println("b=" + b); //false
		//		
		//		b= Character.isDigit('.');
		//		System.out.println("b=" + b); //  false

		//		b= Character.isDigit('AB'); // error dont use like this char val must be single char in 'B'
		//		System.out.println("b=" + b);

		//******************************************
//		boolean  b2=  Character.isAlphabetic('A');
//		System.out.println("b2="+ b2);// true
//
//
//		b2=  Character.isAlphabetic('2');
//		System.out.println("b2="+ b2);// false
//
//		b2=  Character.isAlphabetic('.');
//		System.out.println("b2="+ b2);//  false
		
		
		//******************************
		boolean b3= Character.isLetterOrDigit('A');
		System.out.println("b3="+ b3);// true
		
		b3= Character.isLetterOrDigit('4');
		System.out.println("b3="+ b3);// true
		
		b3= Character.isLetterOrDigit('*');
		System.out.println("b3="+ b3);//  false
		

	}

}
