package JavaSessions;

public class Company {
	//class var:
	String name;
	int empCount;
	String city;
	String addres;
	String ceoName;
	static String category = "IT";
	
	
	public Company() {
		System.out.println("default const....");
	}
	
	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	
	public Company(String name, int empCount, String city) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
	}

	public Company(String name, int empCount, String city, String addres, String ceoName) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
		this.addres = addres;
		this.ceoName = ceoName;
	}
	
	
	
	
	//constructor of the class:
	//name should be same as the class name:
	//can not return anything, it means no return type
	//its not a function
	//const.. will help to create the objects with diff types of class vars
	//const.. will be called when you create the Object of the class...
	//const.. can be overloaded
		
//	public Company() {
//		System.out.println("default const....");
//	}
//	
//	public Company(int a) {
//		System.out.println("one param const...." + a);
//	}
//	
//	public Company(int a, int b) {
//		System.out.println("two param const...." + a + b);
//	}
//	

}
