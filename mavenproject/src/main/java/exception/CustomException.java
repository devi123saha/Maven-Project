package exception;

public class CustomException {

	public void checklicense(int age) throws LicenseException {

		if (age <= 18) {
			throw new LicenseException("Age Less");
		}

		else {
			System.out.println("Eligible");
		}

	}

	public static void main(String[] args) {
		
		CustomException ce=new CustomException();
		try {
		ce.checklicense(2);
		}
		
		catch(LicenseException e) {
			System.out.println(e);
		}
		
		

	}

}
