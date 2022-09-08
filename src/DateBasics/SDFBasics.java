package DateBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("sdf=" + sdf);
		//sdf=java.text.SimpleDateFormat@d936eac0
		String str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);//str=02/08/2022
		
		sdf= new SimpleDateFormat("dd/MM/yy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);//str=02/08/22
		
		sdf= new SimpleDateFormat("MM/dd/yy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// str=08/02/22
		
		
		sdf= new SimpleDateFormat("MM");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// 08
		
		sdf= new SimpleDateFormat("M");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);//8
		
		
		//Care  MM - month , m - minutes
		sdf= new SimpleDateFormat("dd/mm/yy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// str=02/32/22  32 is minutes
		
		
		//  diff formats dd-mm-yyy
		sdf= new SimpleDateFormat("dd-MM-yyyy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);//str=02-08-2022
		
		sdf= new SimpleDateFormat("hh:mm:ss");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// str=01:39:57
		
		
		sdf= new SimpleDateFormat("dd:MMMM:/yyyy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// str=02:August:/2022
		
		
		sdf= new SimpleDateFormat("dd:MMM:/yyyy");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);// str=02:Aug:/2022
		
		sdf= new SimpleDateFormat("zz :dd:MMM:yyyy zzzz");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);
		// str=IST :02:Aug: 2022 India Standard Time
		
		
		sdf= new SimpleDateFormat("E dd:MMM:yyyy zz");
		 str= sdf.format(d);// convert date to String
		System.out.println("str=" + str);
		//str=Tue 02:Aug:2022 IST
		
	}

}
