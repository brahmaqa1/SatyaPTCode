package seleniumpractice;

public class A implements I1
{
	@Override
	public void M1() {
		// TODO Auto-generated method stub
		System.out.println("logivc -1");
	}

	@Override
	public void M2() {
		// TODO Auto-generated method stub
		System.out.println("logivc -1");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 A aref = new A();
		 aref.M1();
		 aref.M2();
		 
	}

	

}
