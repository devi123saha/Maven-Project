package superkeyword;

public class SuperMethod2 extends SuperMethod1 {
	
	//String name ="Priyesh";
	public void show() {
		
		super.show();
		System.out.print("Love in air");
	}

	public static void main(String[] args) {
		
		SuperMethod2 obj=new SuperMethod2();
		obj.show();
		

	}

}
