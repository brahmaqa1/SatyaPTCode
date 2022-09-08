package MyPkg1;

public class employee 
{
	//   describes attributes/ props/ chars's of emplo obj
	 //  ename, eid,, address
	String ename;
	int eid;
	String address;
	//   describes behavior of obj  
	//    respresent intermf of fucntion /method
	
	public static void works9hours()
	{
		System.out.println("work9hours");
		
	}
	
	public static void calculateSalary()
	{
		//   sal =    grade +  ....
		System.out.println("calculate salary");
		
	}
	
	

	public static void main(String[] args) {
		
		//  create an obj     employeee class
		//    className    objref= new className();
		
		employee  empobjref= new employee();
		empobjref.ename="ram";
		empobjref.eid=234;
		empobjref.address="bangalore";
		empobjref.works9hours();
		empobjref.calculateSalary();
		
		
		
		

	}

}
