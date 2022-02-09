package exception;

public class ExceptionHandlingFinally {
	
	
	
	public static void main(String[] args) {
		
		try {
			String s = null;
			int len = s.length();
			System.out.println(len);
			
			int a = 50;
			
			int b = 0;
			
			System.out.println(a/b);
			
		} catch (NullPointerException e) {
			
			e.printStackTrace();
			//System.out.println(e);
		}
          catch (ArithmeticException e) {
			
			e.printStackTrace();
			//System.out.println(e);
          }
		catch (Exception e) {
			
			e.printStackTrace();
			//System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally Block");
		}
		
		System.out.println("Hello");
	}

}
