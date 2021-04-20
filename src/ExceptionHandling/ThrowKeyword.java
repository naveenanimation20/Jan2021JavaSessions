package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("SOME EXCEPTION");
		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = "";

		if (data.equals("")) {
			try {
				throw new Exception("DATA BLANK EXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("data is coming blank from the backend/excel");
				System.out.println(e.getMessage());
			}

		}
		


	}

}
