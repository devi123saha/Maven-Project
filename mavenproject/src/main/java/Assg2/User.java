package Assg2;

public class User {

	public static void main(String[] args) {
		
		Bank b = new Bank();

		int setPin = 1235;
		b.setPin(setPin);

		int enteredPin = 1234;

		if (b.validatePin(enteredPin)) {
			System.out.println("Pin validated successfully!");

		} else {
			System.out.println("Invalid pin! Access denied.");
		}
	}
}