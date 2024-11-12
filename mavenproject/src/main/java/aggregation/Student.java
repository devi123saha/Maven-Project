package aggregation;

public class Student {
	
	String name;
	int id;
	Address ad;
	Student(String n,int id, Address ad){
		
		name=n;
		this.id=id;
		this.ad=ad;
		}
	public void display() {
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(ad.house_name+""+ad.city+""+ad.state+""+ad.pincode);
	
	}

	public static void main(String[] args) {
		
          Address add =new Address("Sai bhavan","Haripad","Kerala",690516);
          Student s= new Student("devika",22,add);
          s.display();
 
	}

}
