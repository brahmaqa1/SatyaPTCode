package DateBasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFBasics2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		String to Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse("31/08/2021");
		System.out.println("date="+ d);
		//date=Tue Aug 31 00:00:00 IST 2021
		
	}

}
