package JavaSessions;

public class IncrementAndDeceremtOperators {

	public static void main(String[] args) {

		int a = 1;
		int b = a++;//post increment
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int x = -99;
		int y = x++;//post increment
		System.out.println(x);//-98
		System.out.println(y);//-99
		
		//pre increment:
		int m = 1;
		int n = ++m;
		System.out.println(m);//2
		System.out.println(n);//2
		
		int p = -89;
		int q = ++p;
		System.out.println(p);//-88
		System.out.println(q);//-88
		
		//post decrement: --
		int h = 2;
		int g = h--;
		System.out.println(h);//1
		System.out.println(g);//2
		
		//pre decrement:
		int t = 2;
		int w = --t;
		System.out.println(t);//1
		System.out.println(w);//1
		
		int v = 2;
		System.out.println(v++);
		System.out.println(v);
		
		int hh = 3;
		System.out.println(++hh);
		
		double d1 = 1.5;
		double d2 = d1++;
		System.out.println(d1);//2.5
		System.out.println(d2);//1.5
		
	}

}
