package MyPkg1;

public class practice {

	int a = 22, b=33, c=44;
	char ch1 = 65, ch2=66, ch3=67;

	public static void print()
	{
		System.out.println("iam about to print variables");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		practice.print(); 

		practice ref = new practice();

		int addd=ref.a+ref.b;
		System.out.println("addd ="+addd);


		ref.a=44;
		ref.b=66;
		int add=ref.a+ref.b;
		System.out.println("add = "+ add);
		
		ref.getClass();
		System.out.println(ref.getClass());
		
	}

}
