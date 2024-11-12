package oops;

public class BabyDogInheri extends Dog {
             
	    public void eat1() {
	    	System.out.print("Dog eats bone");	 
	    	}
	public static void main(String[] args) {
		
	
		BabyDogInheri obj=new BabyDogInheri();
		obj.bark();
		obj.eat1();
		
	}
	
}
	
