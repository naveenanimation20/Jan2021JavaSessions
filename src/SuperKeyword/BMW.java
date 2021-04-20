package SuperKeyword;

public class BMW extends Car{
	
	String name;
	
	public BMW() {
		super(10);
		System.out.println("BMW -- const...");
	}
	
	public BMW(String name) {
		super(10);
		this.name = name;
	}
	
	
	int speed = 150;
	
	public void checkSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
		System.out.println(super.speed);
	}

	
	public void display() {
		System.out.println("BMW -- display");
		super.display();
	}
	
	
	

}
