package abstraction;

public class Child3  implements Inter1,Inter2{
	
	public void method1() {
		System.out.println("Print"+MIN_VALUE+MAX_VALUE);
	}
	 
	public void method() {
		System.out.println(" Print ");
	}
	

	public static void main(String[] args) {
		Child3 obj = new Child3();
		obj.method();
		obj.method1();

	}

}
