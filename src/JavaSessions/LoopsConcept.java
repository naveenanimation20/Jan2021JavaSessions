package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10
		//1. while loop:
		int i = 1;
		while(i<=10) {
			System.out.println(i);//1 2 3 4 5 6...10
			i++;
			//++i;
			//i=i+1;
		}
		
		int n = 1;
		while(n<=50) {
			System.out.println(n);//1
			if(n % 5 == 0) {
				System.out.println("Hi....");
			}
			n++;
		}
		
		System.out.println("---------------");
		//break with while:
		int num = 0;
		while(num<=100) {
			
			System.out.println(num);

				if(num == 50) {
					System.out.println("half century");
				}
			
				if(num == 100) {
					System.out.println("century");
				}
				
				if(num==0) {
					System.out.println("duck...out");
					break;
				}
			num++;
		}
		
		System.out.println("----------------");
		//2. for loops:
		//1 to 10:
		for(int k=1; k<=10; ) {
			System.out.println(k);//1....10
			k++;
		}
		
		System.out.println("----------------");

		for(double d = 1.0; d<=10.0; d++) {
			System.out.println(d);
		}
		
		System.out.println("----------------");
		for(char c='a'; c<='z'; c++) {
			System.out.println(c);//a b c d 
		}
		
		//
//		for(;;) {
//			System.out.println("welcome to TAJ Hotel....");
//		}
		
		//for with break:
		for(int w=1; w<=20; w++) {
			System.out.println(w);
			
				if(w==15) {
					System.out.println("value is 15...");
					break;
				}
		}
		
		System.out.println("------");
		
		//3. do-while:
		int p = 1;
		do {
			System.out.println(p);//1
			p++;
		} 
		while (p<=10);
				
		
		
	}

}
