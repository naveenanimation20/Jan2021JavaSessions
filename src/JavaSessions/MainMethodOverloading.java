package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("this is my main method");
		
		main(10);
		main(10,20);
	}
	
	public static void main(int a) {
		System.out.println("this is main " + a);
	}
	
	public static void main(int a, int b) {
		System.out.println("this is main " + a + b);

	}

}
