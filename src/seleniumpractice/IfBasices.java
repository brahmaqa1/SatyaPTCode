package seleniumpractice;

public class IfBasices {

	public static void main(String[] args) {
//	Java Conditions and If Statements
//	Java supports the usual logical conditions from mathematics:
//  Less than: a < b
//  Less than or equal to: a <= b
//	Greater than: a > b
//	Greater than or equal to: a >= b
//	Equal to a == b
//	Not Equal to: a != b
//	You can use these conditions to perform different actions for different decisions.

//	Java has the following conditional statements:

//	Use if to specify a block of code to be executed, if a specified condition is true
//	Use else to specify a block of code to be executed, if the same condition is false
//	Use else if to specify a new condition to test, if the first condition is false
//	Use switch to specify many alternative blocks of code to be executed
		
//		The if Statement
//		Use the if statement to specify a block of Java code to be executed if a condition is true.
		
//		syntax;if (condition) {
		  // block of code to be executed if the condition is true
		
//		int x=45,y=35;
//		if(x<y)
//		{
//			System.out.println("x is greater than y");
//	}
//		The else Statement
//		Use the else statement to specify a block of code to be executed if the condition is false.

//		Syntax
//		if (condition) {
		  // block of code to be executed if the condition is true
//		} else {
		  // block of code to be executed if the condition is false
//		}
		
		int x=45,y=35;
		if(x<y) {
			System.out.println("x is greater than Y");
		}else {
			System.out.println("y is less than x");
		
		}


	}

}
