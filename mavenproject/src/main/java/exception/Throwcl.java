package exception;

public class Throwcl {
	
	public void sum(int a, int b) {
		
		int sum=a+b;
		System.out.println(sum);
		if(sum>25) {
			
			throw new ArithmeticException("Result");
		}
		else
		{
			throw new NullPointerException("NULL");
			//System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		
		Throwcl th= new Throwcl();
		try{
			th.sum(4, 5);
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		System.out.println("Waste code");

	}

}
