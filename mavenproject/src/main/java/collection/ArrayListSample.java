package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	
	
	
	public static void main(String[] args) {
	

    List <String> list= new ArrayList ();
	list.add("Apple");
	list.add("Orange");
	System.out.println(list);
	System.out.println("Non Generic");
	
	ArrayList  al=new ArrayList();
	 al.add ("String");
	 al.add (1);
	 al.add("Devika");
	 System.out.println(al);
	  
	 System.out.println("Generic");
	 ArrayList <String>  al1 = new ArrayList(); 
	 al1.add ("String w");
	 al1.add ("String s");
	 al1.add ("String v");
	 al1.add ("String f");
	 
	 System.out.println(al1);
	 
	 al1.remove(2); //removing value in index 2
	 System.out.println(al1);
	 
	 al1.remove(null); //remove value using value
	 
	 System.out.println(al1);
	 
	 System.out.println(al1.size());  //print array size
	 System.out.println(al1.isEmpty()); //print array is empty or not
	 
	 System.out.println("For Loop");
	 for( int i=0; i<al1.size(); i++)
	 {
		 System.out.println(al1.get(i));  //getmethod
	 }
	 
	 System.out.println(al1.contains("New")); //contains
	 
	 System.out.println("For Each Loop");
	 
	 for (String i:al1)
	 {
		 System.out.println(i);
	 }
	 
	 System.out.println("Adding two arrayList");
	 ArrayList <String> al2 = new ArrayList();
	 al2.add("Cat");
	 al2.add("Dog");
	 al2.add("Tiger");
	 
	 al1.addAll(al2);
	 
	 System.out.println("Removing all data from the array list");
	 al1.removeAll(al2);// if any duplicate value it will remove
	 
	 
	 String s1 = new String("Welcome");
	 
	 //String Classes
	 //String : thread safe, immutable , slower
	 // String buffer : Thread safe , synchronized , mutable , slower
	 // String builder : Not Thread safe , not synchronized , mutable , generally faster
	 
	 
	 
	 
	 
	 
	
	
	
	
}

}
