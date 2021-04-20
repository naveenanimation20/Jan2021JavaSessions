package JavaSessions;

public class TestCompany {

	public static void main(String[] args) {

		
		Company c0 = new Company();
		c0.name = "ABC";
		System.out.println(c0.name);
		
		Company c1 = new Company("IBM", 1000);
		
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		
		Company c2 = new Company("MS", 2000, "Bangalore");
		System.out.println(c2.name+ " "+ c2.empCount + " " + c2.city);
		System.out.println(c2.addres);
		
		
		Company c4 = new Company("TCS", 5000, "Pune", "test address", "TATA");
		System.out.println(c4.name);
		System.out.println(c4.ceoName);
		
		System.out.println(c1.ceoName);
		
	}

}
