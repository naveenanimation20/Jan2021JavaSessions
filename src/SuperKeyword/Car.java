package SuperKeyword;

public class Car {
	
	public Car() {
		System.out.println("Car -- const...");
	}
	
	public Car(int i) {
		System.out.println("Car -- const..."+i);
	}
	
	
	int speed = 120;
	
	public void start() {
		System.out.println("car -- start");
	}
	
	public void display() {
		System.out.println("car -- display");
	}
	

}
