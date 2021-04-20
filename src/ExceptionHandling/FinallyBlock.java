package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Hi");

		System.out.println("Hi");

		try {
			int i = 9 / 3;
		} catch (ArithmeticException e) {
			System.out.println("ARE is coming...");
		} finally {
			System.out.println("Im inside finally block...");
			System.out.println("Close the DB connection...");
		}
		
		int n1 = getMarks("Tom");
		System.out.println(n1);
	}

	public static int getMarks(String name) {

		if (name.equals("Tom")) {
			try {
				int i = 9 / 3;
				return 70;
			} catch (Exception e) {
				return 80;
			} finally {
				return 80;
			}
		}
		
		return 10;

	}

}
