package WrapperClassesBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getNumbersFromStringUsingRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String s="a1b2c3";
		
		Pattern p=  Pattern.compile("\\d+");		
		Matcher m=  p.matcher(s);		
		while(m.find())
		{
			System.out.println("m group="+ m.group());
		}
//		        m group=1
//				m group=2
//				m group=3

		//**************
		
		String s2=s.replaceAll("[^0-9]", "");
		System.out.println("s2=" + s2);// 123
		
		
		
	}

}
