package Utilies;

public class MyTC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericUtilies genUtil = new GenericUtilies();
		
		genUtil.openBrowser("Chrome", "file:///C:/brahma/Practise/qtp%20practise/web%20apps/WebTableAll.html");
		
//		genUtil.openBrowser("FF","file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
//		genUtil.openBrowser("Edge","file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
//		genUtil.Click_On_CheckBox_Based_On_ActivtyCode("10110101");
//		genUtil.Click_On_CheckBox_Based_On_ActivtyCode("10110102");
//		genUtil.Click_On_CheckBox_Based_On_ActivtyCode("10110107");
		
		String Branchname= genUtil.Get_BranchName_From_HulTablee01_Basedon_ActivityCode("10110101");
		
		System.out.println("Branchname="+Branchname);
		
		
		
//		genUtil.Get_BranchName_From_HulTablee01_Basedon_ActivityCode("10110102");
//		genUtil.Get_BranchName_From_HulTablee01_Basedon_ActivityCode("10110103");
//		genUtil.Get_BranchName_From_HulTablee01_Basedon_ActivityCode("10110104");
		Branchname= genUtil.Get_BranchName_From_HulTablee01_Basedon_ActivityCode("1011010454");
		System.out.println("Branchname="+Branchname);
		
		
		System.out.println("ends");
		

	}

}
