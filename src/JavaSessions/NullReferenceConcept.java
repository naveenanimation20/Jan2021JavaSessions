package JavaSessions;

public class NullReferenceConcept {
	
	String name;
	int age;
	
	

	public static void main(String[] args) {
		
		
		NullReferenceConcept obj = null;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		NullReferenceConcept obj1 = new NullReferenceConcept();
//		
//		obj.name = "Tom";
//		obj.age = 25;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
//		
//		obj1 = null;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
		
		new NullReferenceConcept();
		
	}

}
