package oops;

public class Children extends Father {
	
	public void devi() {
		System.out.print("Middle");
	}
public static void main(String[] args) {
		
		Children obj=new Children();
		obj.jaya();
		obj.devi();
		Mother nm1= new Mother();
		nm1.vid();
	}

}
