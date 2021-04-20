package JavaSessions;

public class CarStatic {

	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void start() {
		System.out.println("car -- start");
	}

	public static void start(String key) {
		System.out.println("car -- start");
	}

	public void steering() {
		System.out.println("car -- steering");
	}


	public static void main(String[] args) {

		// how to call static vars/methods:
		// no need to create the Object of the class
		// 1. can be called directly within the same class
		System.out.println(wheels);
		start();
		// 2. should be called by className.
		System.out.println(CarStatic.wheels);
		CarStatic.start();

		// for non static vars/methods:
		// have to create the object
		CarStatic c1 = new CarStatic();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Black";
		c1.wheels = 4;// warning
		System.out.println(c1.name);

		CarStatic c2 = new CarStatic();
		c2.name = "Audi";
		c2.price = 80;
		c2.color = "White";
		c2.wheels = 4;// warning

		c1.steering();
		c1.start();

	}

}
