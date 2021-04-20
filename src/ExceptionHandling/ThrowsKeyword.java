package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		m2();
	}

	public void m2() {
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("ARE is coming...");
		}
	}

	public void m3() throws ArithmeticException {
		int i = 9 / 0;
	}

	public static void main(String[] args){

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

	}

}
