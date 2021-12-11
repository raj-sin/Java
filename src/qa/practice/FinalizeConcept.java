package qa.practice;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		FinalizeConcept obj= new FinalizeConcept();
		
		//UserDetails obj= new UserDetails(); // finalize method will not call because this object is from other class
		obj=null;
		System.gc();
	    System.out.println("Bye !!!");	

	}
	
	@Override 
	public void finalize() {
		
		System.out.println("We are inside finalize method");
	}

}
