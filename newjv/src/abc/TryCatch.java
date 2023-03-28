package abc;

public class TryCatch {

	public static void main(String[] args) {
//		int ac="jdak";//checked exception
		int a = 10;
		int b = 0;
		
		try {
			int c=a/b;//unchecked exception
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Code will continue to be executed now as the exception is handled");
		}
		
		
		
		
		
		

	}

}
