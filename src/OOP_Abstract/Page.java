package OOP_Abstract;

public abstract class Page {
	
	//can not create the object of abstract class
	//but can create the const.. of abstract class
	//it will called when you create the object of child class
	
	
	//abstract class can have both abstract and non abstract methods
	//only abstract methods --> yes --> 100% abstraction
	//only non abstract methods --> yes --> 0% abstraction
	//both abstract and non abstract methods --> yes --> partial abstraction
	
	public Page() {
		System.out.println("Page -- const....");
	}
	
	public abstract void header();
	public abstract void title();
	
	public void pageLoading() {
		System.out.println("page loading... 30s");
	}
	
	public static void url() {
		System.out.println("App page -- url");
	}
	
	public static void logo() {
		System.out.println("Page -- logo");
	}

	
	

}
