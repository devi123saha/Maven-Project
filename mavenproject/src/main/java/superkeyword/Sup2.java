package superkeyword;

public class Sup2 extends Sup
{
	
	String name ="Devika";
	void show()
	{
		
		System.out.print(name);
		System.out.print(super.name);
	}
	


	public static void main(String[] args) {
		

		Sup2 obj=new Sup2();
		obj.show();
	}

}
