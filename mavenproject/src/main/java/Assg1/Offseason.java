package Assg1;

public class Offseason extends Onseason {
	public void discount(double amt) {
		double discountAmount = amt * 0.40;
		double finalAmount = amt - discountAmount;
		System.out.println("********Offseason*******");
		System.out.println("Original Amount: " + amt);
		System.out.println("Discount (40%): " + discountAmount);
		System.out.println("Final Amount : " + finalAmount);
	}

	public static void main(String[] args) {

		Onseason ons;
		ons = new Offseason();
		ons.discount(1000);
		ons = new Onseason();
		ons.discount(500);

	}
}
