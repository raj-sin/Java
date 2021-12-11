package qa.practice;

public class StringManipulation {

	public static void main(String[] args) {
		String str="This is my java code and I am so happy";
		int len=str.length();
		System.out.println(len); //38
		int li=0;
		System.out.println(li);	
		System.out.println();
		System.out.println(str.charAt(2)); //i

		int hi=len-1;

		System.out.println(hi); //37
		System.out.println(str.charAt(37)); //y
		//System.out.println(str.charAt(38)); //String index out of bound exception

		System.out.println(str.indexOf('j')); //11

		System.out.println(str.indexOf('s')); // 3 -> first occurrence of s

		//Below syntax is not applicable for long string characters so to improve this, we will use below code
		System.out.println(str.indexOf('s',4)); //6 - > 2nd s position

		System.out.println(str.indexOf('s',str.indexOf('s')+1)); //6 - 2nd occurrence of s

		System.out.println(str.indexOf("java")); // 11
		System.out.println(str.indexOf("Raj")); //-1 -> Here it will not give exception

		String msg="Hello admin";
		if(msg.indexOf("admin")>=0) {
			System.out.println("correct msg"); //correct msg

		}

		System.out.println(str.toLowerCase()); //this is my java code and i am so happy
		System.out.println(str.toUpperCase()); //THIS IS MY JAVA CODE AND I AM SO HAPPY

		//trim() - it will remove the space before starting of the string as well as after ending of the string but
		//not from the middle of the string

		String str1="    Hello  Raj       ";
		System.out.println(str1.trim()); //Hello  Raj

		String str2="     12345";

		System.out.println(str2.trim()); //12345

		//replace()
		String str3="19/11/2021";
		System.out.println(str3.replace("/", "-")); //19-11-2021

		String str4="aaa";
		System.out.println(str4.replace("aa", "b")); //ba

		String str5="Hello java and I am happy with java";
		String str6=str5.replace("java","python");
		System.out.println(str6); //Hello python and I am happy with python

		if(str6.contains("python")){
			System.out.println("This is updated string");
		}
		else {
			System.out.println("This is not updated string");
		}


		//string Concat:

		String str7="Hello";
		String str8="Raj";
		System.out.println(str7.concat(str8)); //HelloRaj
		
		System.out.println(str7.concat(str8).concat(" in string world")); //HelloRaj in string world
		
		//comparison:
		
		String str9="this is my java code";
		String str10="This is my java code";
		
		System.out.println(str9.equals(str10)); //fasle -> this is case sensitive
		System.out.println(str9.equalsIgnoreCase(str10)); //true -> it will ignore the cases
		
		//Substring() - it will fetch small string from longer string
		
		String str11="This is string manipulation program";
		System.out.println(str11.substring(7)); // it will give output from 8th position to end of the string - string manipulation program
		
		System.out.println(str11.substring(0,6)); // it will give output from 0 to 5 - This i
		
		System.out.println(str11.substring(str11.indexOf("manipulation")+3,str11.length())); //ipulation program
		
		//split():
		
		String test="Java;Python;JavaScript;Ruby";
		String arr[]=test.split(";"); //split() is returning the string array.that's why we have stored in string array.
		
		System.out.println(arr[0]);
		


	}
}
