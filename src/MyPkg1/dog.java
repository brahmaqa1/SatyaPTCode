package MyPkg1;

public class dog {

	String dog;
	String breed;
	String type;
	public static void borking()
	{
		System.out.println("borking");
	}

	public static void running()
	{
		System.out.println("running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dogobj1=new dog();
		dogobj1.dog="dolmation";
		dogobj1.breed="germanshepard";
		dogobj1.type="sgsgs";
		dogobj1.borking();
		dogobj1.running();
	}

}
