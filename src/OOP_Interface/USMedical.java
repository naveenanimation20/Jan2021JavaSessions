package OOP_Interface;

public interface USMedical extends WHO{
	int min_fee = 10;//static and final

	// no method body
	// only method declaration
	// only method prototype
	//can not create the Object of interface
	//can not create the const... of interface


	public void orthoServices();

	public void neuroServices();

	public void emergencyServices();
	
	public void radioServices();
	
	//public int test(int a);
	
	//after jdk 1.8:
	//1. can have static method in Interface with body:
	public static void billing() {
		System.out.println("US - billing");
	}
	
	//2. can have default method with method body:
	default void taxCollection() {
		System.out.println("US -- 30% tax collection....");
	}
	
	
	

}
