package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {

		
		Company c1 = new Company("MS", 1000, "HR");
		Object ar[] = c1.getCompInfo();
		
		for(Object e : ar) {
			System.out.println(e);
		}
		
		
//		c1.setName("IBM");		
//		c1.setPolicy("Financial");
//		c1.setSharePrice(100);
//		
//		System.out.println(c1.getName() + " " + c1.getPolicy() + " " + c1.getSharePrice());
		
		
	}

}
