package seleniumpractice;

public class CAR implements I2
{
	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		System.out.println("Iam applying clutch");
	}
	
	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("apply brakes");
	}
	
	@Override
	public void Accelerator() {
		// TODO Auto-generated method stub
		System.out.println("hit accelerator");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CAR carref = new CAR();
		carref.brakes();
		carref.Accelerator();
		carref.clutch();
			
			
	}

}
