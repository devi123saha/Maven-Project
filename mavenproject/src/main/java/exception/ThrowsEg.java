package exception;

public class ThrowsEg {
	//unchecked exception
	public void method1(int a,int b) throws ArithmeticException {
		
		int sum=a+b;
		System.out.println(sum);
		throw new ArithmeticException();
		
	}

	public static void main(String[] args) {
		
		ThrowsEg t=new ThrowsEg();
		t.method1(10,4);
		

	}

}
