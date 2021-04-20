package OOP_Inheritance;

public class BMW extends Car{
	String name = "My BMW Car";

	//Method Overriding: Run time : (Dynamic) Poly+Morphism 
	//when you have a method in parent class and the same mehtod in child class
	//with the same name
	//same number of parameters
	//with same types
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
//	public static void autoPilot() {
//		System.out.println("BMW -- autoPilot");
//	}
	

}
