package exception;

public class ExceotionHandling {
	
	public static void main(String[] args) {
		
		
		try {
			int a = 50;
			
			int b = 0;
			
			System.out.println(a/b);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Hello Everyone");
		
	}

}
