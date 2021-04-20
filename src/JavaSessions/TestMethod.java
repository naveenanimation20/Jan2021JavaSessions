package JavaSessions;

public class TestMethod {

	public static void main(String[] args) {
		
		MethodChaining obj = new MethodChaining();
		obj.m1();
		obj.name = "BMW";
		System.out.println(obj.name);
		
		MethodChaining.t1();
		System.out.println(MethodChaining.wheels);

	}

}
