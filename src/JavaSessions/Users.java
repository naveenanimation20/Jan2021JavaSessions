package JavaSessions;

public class Users {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		Users u1 = new Users();
		u1.name = "Bharat";
		u1.age = 25;
		u1.city = "Bangalore";
		
		Users u2 = new Users();
		u2.name = "Sejal";
		u2.age = 27;
		u2.city = "Pune";
		
		Users u3 = new Users();
		u3.name = "Nidhi";
		u3.age = 28;
		u3.city = "New Delhi";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u3 = u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
	}

}
