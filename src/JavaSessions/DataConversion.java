package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//String to int:
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
		//String to double:
		String y = "12.33";
		System.out.println(y+20);
		
		Double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		String f = "true";
		if(Boolean.parseBoolean(f)) {
			System.out.println("Hi");
		}
		
//		String t = "100A";
//		int k = Integer.parseInt(t);
//		System.out.println(k+20);//120 -- ex op
		
		//int to String:
		int total = 100;
		String t = String.valueOf(total);
		System.out.println(t+20);
		
		System.out.println(total + ""+20);
		
	}

}
