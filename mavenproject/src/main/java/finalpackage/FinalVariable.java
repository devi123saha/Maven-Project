package finalpackage;

public class FinalVariable {
	
	final int a=10;
	
	public void display() {
		 //a=20;
		System.out.print(this.a);
		
	}

	public static void main(String[] args) {
		
		
		FinalVariable obj=new FinalVariable();
		obj.display();
	}

}
