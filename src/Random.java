
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
public class Random {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {

		
        /**
           hi this is my java code(' \u000d System.out.println("Hello Naveen");
         */

		
		int value = 10;
		// \u000d
		value = 20;
		System.out.println(value);
		System.out.println(\u000d);
		System.out.println("Hello Programming");
		
		
		int N = 10;
		getmeout:{
		    for (int i = 0; i < N; ++i) {
		        for (int j = i; j < N; ++j) {
		            for (int k = j; k < N; ++k) {
		            	System.out.print(k);
		                break;
		            }
		        }
	            System.out.println();

		    }
		}

	    // throw null;
		System.out.println(returnSomething());
		System.out.println(new URL("https://naveenautomationlabs.com").equals(new URL("https://45.130.228.5")));
	}
	
	public static int returnSomething() {
	    try {
	        throw new RuntimeException("foo!");
	    } finally {
	        return 0;
	    }
	}

}
