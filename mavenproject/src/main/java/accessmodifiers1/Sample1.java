package accessmodifiers1;

public class Sample1 {
	
	protected int a=10;
	
	protected void print() {
		System.out.print(a);	}

	public static void main(String[] args) {
		
		Sample1 a1=new Sample1();
		a1.print();

	}

}
