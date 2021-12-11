package qa.practice;

public class ThrowKeyword {

	public static void main(String[] args) {
		String data=" ";
		
		if(data.equals(" ")) {
			
			try {
			throw new Exception("data is blank");
			}catch(Exception e){
				
				System.out.println("data is blank exception");
			}
			
			
		}

	}

}
