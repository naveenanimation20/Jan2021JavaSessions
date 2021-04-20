package JavaSessions;

public class Employee {
	
	//class vars:
	String name;
	int age;
	String dob;
	double salary;
	boolean isPermanent;
	
	

	public static void main(String[] args) {

		//create the object of the class:
		Employee e1 = new Employee();
		e1.name = "Anushree";
		e1.age = 25;
		e1.dob = "01-01-1995";
		e1.salary = 23.55;
		e1.isPermanent = true;		
		
		Employee e2 = new Employee();
		e2.name = "Disha";
		e2.age = 27;
		e2.dob = "01-01-1997";
		e2.salary = 33.55;
		e2.isPermanent = false;
		
		Employee e3 = new Employee();
		e3.name = "Tom";
		e3.salary = 45.55;
		
		Employee e4 = new Employee();


		
		System.out.println(e1.name + " " + e1.age + " "+ e1.dob + " " + e1.salary + " " + e1.isPermanent);
		System.out.println(e2.name + " " + e2.age + " "+ e2.dob + " " + e2.salary + " " + e2.isPermanent);
		System.out.println(e3.name + " " + e3.age + 
				" "+ e3.dob + " " + e3.salary + " " + e3.isPermanent);
		System.out.println(e4.name + " " + e4.age + " "+ e4.dob + " " + e4.salary + " " + e4.isPermanent);

		
	}

}
