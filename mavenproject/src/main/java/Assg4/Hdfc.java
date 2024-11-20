package Assg4;

public class Hdfc implements Rbi{

    
    private double INTEREST_RATE = 5.0;

	public double recurringDeposit(double amount, int duration) {
        
        double interest = (amount * INTEREST_RATE * duration) / 100;

       
        return amount + interest;
    }

    public static void main(String[] args) {
        
        Hdfc hdf = new Hdfc();

        double depositAmount = 5000;  
        int durationInYears = 3;       

       
        double finalAmount = hdf.recurringDeposit(depositAmount, durationInYears);

        
        System.out.println("Initial Deposit: " + depositAmount);
        System.out.println("Duration: " + durationInYears + " years");
        System.out.println("Interest Rate: " + RBI.INTEREST_RATE + "%");
        System.out.println("Final Amount after " + durationInYears + " years: " + finalAmount);
    }
}