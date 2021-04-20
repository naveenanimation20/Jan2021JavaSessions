package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// independent
		b.engine();
		BMW.autoPilot();
		System.out.println(b.name);

		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.theftSafety();
		a.engine();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.autoPilot();

		// Top/Up casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

		Vehicle v1 = new BMW();
		v1.engine();

	}

	// down casting:
//		BMW b1 = (BMW) new Car();//ClassCastException
//		
//		BMW b2 = (BMW) new Vehicle();

}
