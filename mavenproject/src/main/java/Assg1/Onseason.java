package Assg1;

public class Onseason {
	
		public void discount(double amt) {
	        double discountAmount = amt * 0.15;
	        double finalAmount = amt - discountAmount;
	        System.out.println("********Onseason*******");
	        System.out.println("Original Amount: " + amt);
	        System.out.println("Discount (15%): " + discountAmount);
	        System.out.println("Final Amount : " + finalAmount);
	    }

	}
