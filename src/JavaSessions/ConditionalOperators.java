package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		System.out.println(10==10);
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(false) {
			System.out.println("Hii");
		}
		else {
			System.out.println("Bye...");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("This is fine..." + flag);
		}
		else {
			System.out.println("this is not fine..." + flag);
		}
		
		double d1 = 12.33;
		double d2 = 12.34;
		
		if(d1==d2) {
			System.out.println("both are equals");
		}
		
		//String comparison
		String s1 = "Selenium";
		String s2 = "selenium";
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		
		//WAP to check the marks
//		String name = "Raksha";
//		
//		if(name.equals("Kunal")) {
//			System.out.println("100 marks");
//		}
//		
//		if(name.equals("Raksha")) {
//			System.out.println("90 marks");
//		}
//		
//		if(name.equals("Naveen")) {
//			System.out.println("10 marks");
//		}
//		
//		if(name.equals("Tom")) {
//			System.out.println("80 marks");
//		}
		
//		else {
//			System.out.println("no student found...");
//		}
		
		//with if-elseif:
		String name = "Kunal";
		
		if(name.equals("Kunal")) {
			System.out.println(name + " 100 marks");
		}
		
		else if(name.equals("Raksha")) {
			System.out.println(name + " 90 marks");
		}
		
		else if(name.equals("Tom")) {
			System.out.println("90 marks");
		}
		else if(name.equals("Naveen")) {
			System.out.println("90 marks");
		}
		
		else {
			System.out.println("this student is not found...");
		}
		
		
	}

}
