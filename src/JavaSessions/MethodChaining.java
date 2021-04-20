package JavaSessions;

public class MethodChaining {
	
	String name;
	static int wheels = 4;

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");

		m3();
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void t1() {
		t2();
	}

	public static void t2() {
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

}
