package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {

		String s = "test123"; // muineleS
		System.out.println(reverseString(s));

		//100
		//m
		//test
		//testing
		//null
		//test123
		
		//JAVA_PYTHON_RUBY_JavaSCRIPT
		//AVAJ_MOHTYP
		
	}

	public static String reverseString(String s) {
		
		if(s==null) {
			return "string is null";
		}

		int len = s.length();

		if (len == 1) {
			return s;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
