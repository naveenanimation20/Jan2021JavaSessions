package ExceptionHandling;

public class TryCatchBlock {
	String name = "Tom";

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj = new TryCatchBlock();
		try {
			System.out.println(obj.name);
			int i = 9/0;
			System.out.println("Bye!");
			System.out.println("Bye!");
			System.out.println("Bye!");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		
		
		
		
	}

}
