package oops;

public class FruitMulti extends FlowerMulti{
	
	public void cut() {
		System.out.print("Eat Fruits");
	}

	public static void main(String[] args) {
		
		FruitMulti obj=new FruitMulti();
		obj.leaf();
		obj.seed();
		obj.cut();
		
	}

}
