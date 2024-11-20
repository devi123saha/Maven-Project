package Assg2;

public class Bank {

	private int pin;

	public void setPin(int pin) {
		
		if (pin == 1001 || pin == 1234 || pin == 1212) {
			this.pin = pin;
		} else {
			System.out.println("Invalid pin! Please choose a valid pin.");
		}
	}

	public boolean validatePin(int pin) {
		
		if (this.pin == pin) {
			return true;
		}
		return false;
	}
}
