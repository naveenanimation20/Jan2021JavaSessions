package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		String s = "hello world";
		String s1 = "100";
		String s2 = "hi this is my java code";
		
		String f1 = "12.33";
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(x+a);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		System.out.println("the sum of a and b is: " + (a+b));
		
		double d1 = 12.33;
		double d2 = 34.44;
		System.out.println(d1+d2);
		
		System.out.println(a+b+x+y+d1+d2);//300HelloSelenium12.3334.44
		System.out.println(x+y+a+b+d1+d2);//HelloSelenium10020012.3334.44
		
		System.out.println(x+d1+d2+y+a+b);
		System.out.println(x+(d1+d2)+y+(a+b));
		
		char c1 = 'a';//97
		char c2 = 'b';//98
		char space = ' ';
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		System.out.println(x+c1);
		System.out.println(c1+c2);//195
		char c3 = '4';//52
		char c4 = '5';//53
		System.out.println(c3+c4);
		
		System.out.println(1000);
		
		char gender = 'm';
		System.out.println("gender is : " + gender);
		System.out.println(c1+""+c2);
		
		//hi this is "naveen" here
		System.out.println("hi this is \"naveen\" here");
		//hi this is 'naven' here
		
		int m = 9;
		int n = 2;
		System.out.println(m/n);
		System.out.println(9/2);
		System.out.println(9/2.0);
		System.out.println(9.0/2);
		System.out.println(9.0/2.0);
		
		//System.out.println(9/0);
		System.out.println(0/9);
		
		System.out.println(8 % 2);
		System.out.println(9 % 2);
		
		System.out.println("Bye...");
		System.out.println(1000);
		System.out.println(m);

	}

}
