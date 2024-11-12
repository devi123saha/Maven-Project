package aggregation;

public class Details {
	String name;
	int age;
	Employee employee;
	
	Details(String name, int age, Employee employee){
		
		this.age=age;
		this.name=name;
		this.employee=employee;
	}
	 public void display()
	 {
		 System.out.print(name+" "+age);
		 System.out.print(employee.City+" "+employee.Companyname);
		 
		 
	 }
	

	public static void main(String[] args) {
		Employee ob=new Employee("Haripad","NV360");
		Details obj =new Details("Devika",24,ob);
		obj.display();
        
		
	}

}
