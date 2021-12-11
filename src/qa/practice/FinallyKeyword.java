package qa.practice;

public class FinallyKeyword {

	public static void main(String[] args) {

		int p=10;

		try {
			int div=p/2;
		} catch(ArithmeticException e) {

			System.out.println("Exception is occuring");
		}

		finally {
			System.out.println("In finally block....");
		}
		
		System.out.println(getMarks("Tom"));
	}

	public static int getMarks(String name) {

		if(name.equals("Tom")) {

			try {
				int i=9/0;
			}catch(Exception e) {
				return 99;
			}

			finally {
				return 80;
			}
		}

		else if (name.equals("Peter")) {
			return 90;
		}
		else {

			System.out.println("Name not found");
			
			return -1;
		}

	}

}


