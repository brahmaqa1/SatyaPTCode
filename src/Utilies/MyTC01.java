package Utilies;

public class MyTC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericUtilies genUtil = new GenericUtilies();
		
		genUtil.openBrowser("Chrome", "file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
//		genUtil.openBrowser("FF","file:/C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
//		genUtil.openBrowser("Edge","file://C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
//		
////		genUtil.enter_Value_In_Textbox("//input[@name='firstname']","Raju");
//		genUtil.enter_Value_In_Textbox("//input[@name='lastname']","rao");
//		genUtil.enter_Value_In_Textbox("//input[@name='HUL-testname-101']","Test");
//		genUtil.enter_Value_In_Textbox("//input[@name='HUL-testname-10198989']","Test");
		
//		genUtil.enter_Value_In_Textbox2("firstname_name","rao");
//		genUtil.enter_Value_In_Textbox2("idfirst_id","Test");
//		genUtil.enter_Value_In_Textbox2("//input[@name='lastname']_xpath","Lastname");
//		
////		genUtil.enter_Value_In_Textbox2("//input[@name='lastname']_css","Lastname");
//		
//		String val=genUtil. get_Val_From_Textbox("firstname_name");
//		System.out.println("val="+val);
//		
//		val=genUtil. get_Val_From_Textbox("//input[@name='lastname']_xpath");
//		System.out.println("val="+val);
//		
//		String Title = genUtil.getTitleOfTheBrowser();
//		System.out.println("Title of the browser  ="+Title);
//		
//		genUtil.click_on_check_box("bikeid_id");
////		genUtil.click_on_check_box("bikeid_id13213");
//		genUtil.click_on_check_box("bikeidInvakid_id");
		
		genUtil.Click_on_Radio_Button("maleid_id");
		genUtil.Click_on_Button("loginid_id");
//		
//		genUtil.closeBrowser();
		
		System.out.println("ends");
	}
}
