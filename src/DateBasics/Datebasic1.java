package DateBasics;

import java.util.Date;

public class Datebasic1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d="+d);
		//d=Tue Aug 02 00:50:30 IST 2022
		
		System.out.println("get time=" + d.getTime());
		//get time=1659382927110
		
		System.out.println("get date="+ d.getDate());// 2
		
		System.out.println("get date="+ d.getMonth());// 7 Note:  it should be 8
		
		System.out.println("get date="+ d.getYear());// 122 ??????
	    // get day , month, year
		
		System.out.println("get hours="+ d.getHours()); // 1
		System.out.println("get getMinutes="+ d.getMinutes()); // 18
		System.out.println("get getSeconds="+ d.getSeconds());// 2
	

	}

}
