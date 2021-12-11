package qa.practice;

public class ThrowsKeyword {

	public void m1( ) throws ArithmeticException{
		
		System.out.println("M1 method");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		
		System.out.println("M2 method");
		m3();
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("M3 method");
		m4();
	}
	
	public void m4() throws ArithmeticException{
		System.out.println("M4 method");
		
		try {
		int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
		}
	}
	
	public static void main(String args[]) {
		
		ThrowsKeyword obj=new ThrowsKeyword();
		
		
		obj.m1();
		
	}

}
