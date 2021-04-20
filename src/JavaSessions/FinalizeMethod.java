package JavaSessions;

public class FinalizeMethod {
	
	String name = "Tom";

	public static void main(String[] args) {

		
		FinalizeMethod obj = new FinalizeMethod();
		obj = null;
		
		Window w1 = new Window();
		w1 = null;
		System.gc();
		
		
	}
	
	@Override
	public void finalize() {
		System.out.println("FinalizeMethod -- finalize");
	}
	

}
