package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
	
	
	

	public static void main(String[] args) {
		
		Set <Integer> s1= new HashSet <Integer>();
		s1.add(20);
		s1.add(20);
		s1.add(40);
		s1.add(100);
		s1.add(90);
		s1.add(40);
		
		System.out.println(s1);
		
		HashSet <Integer> h1 = new HashSet <Integer>();
		
		h1.add(111);
		h1.add(222);
		h1.add(333);
		h1.add(444);
		h1.add(555);
		
		System.out.println(h1);
		
		HashSet h2 =  new HashSet();
		h2.add("Devika");
		h2.add(23);
		h2.add("ORange");
		h2.add(34);
		
		System.out.println(h2);
		h2.remove("Devika");
		System.out.println(h2);
		
		Iterator <Integer> it= h1.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		h2.addAll(h1);
		System.out.println(h2);
		h2.removeAll(h1);
		System.out.println(h2);
		
	     System.out.println(h2.size());
	     System.out.println(h2.contains(300));
		
		
		

	}

}
