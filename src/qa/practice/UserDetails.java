package qa.practice;

public class UserDetails {
	
	String name;
	int    age;
    String city;
	

	public static void main(String[] args) {
		
		UserDetails u1=new UserDetails();
		u1.name="Ram";
		u1.age=40;
		u1.city="Noida";
		
		UserDetails u2=new UserDetails();
		u2.name="Shyam";
		u2.age=50;
		u2.city="Delhi";
		
		UserDetails u3=new UserDetails();
		
		u3.name="Peter";
		u3.age=45;
		u3.city="NY";
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		System.out.println("*********************************");
		
		u1=u2;
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		System.out.println("*********************************");
		
	    u2=u3;
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		System.out.println("*********************************");
		
		u3=u1;

		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		
		
		

	}

}
