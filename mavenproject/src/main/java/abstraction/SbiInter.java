package abstraction;

public class SbiInter implements BankInter {
	
	public void interest() {
		System.out.println("10%");
	}

	public void bankloan() {
		System.out.println("0%");
	}
	public static void main(String[] args) {
	
		BankInter obj=new  SbiInter();
		obj.interest();
		SbiInter sb = new SbiInter();
		sb.bankloan();
	}

}
