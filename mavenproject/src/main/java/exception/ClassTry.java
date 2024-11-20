package exception;

public class ClassTry {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int s = a = b;
		System.out.println(s);

		try {
			int sum = 50 / 0;
			int arr[] = new int[3];
			arr[6] = 60;

			System.out.print("Not possible");

		}

		catch (ArithmeticException e) {

			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.print(e);
		}

		catch (Exception e) {

			System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally done");
		}

		System.out.println("Rest of the code");

	}

}
