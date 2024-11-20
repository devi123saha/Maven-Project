package exception;

import java.io.IOException;

public class ThrowsEg2 {
//checked exception
public void method1(int a,int b) throws IOException {
		
		int sum=a+b;
		if(sum>10) {
			
			System.out.println(sum);
			throw new IOException();
		}
		
		
	}

	public static void main(String[] args) {
		
		ThrowsEg2 t=new ThrowsEg2();
		try {
		t.method1(10,4);
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		

	}

}
