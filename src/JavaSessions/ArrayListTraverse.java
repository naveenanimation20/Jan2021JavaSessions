package JavaSessions;

import java.util.ArrayList;

public class ArrayListTraverse {

	public static void main(String[] args) {

		//dynamic array:
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("tom");//0
		namesList.add("peter");//1
		namesList.add("naveen");//2
		namesList.add("Tony");//3
		namesList.add("lisa");//4
		namesList.add("disha");//5
		
		//traverse the arraylist: loop:
		
		for(int i=0; i<namesList.size(); i++ ) {
			System.out.println(namesList.get(i));
			
				if(namesList.get(i).equals("naveen")) {
					System.out.println("Hi...");
					break;
				}
			
		}
		
		//for each:
		for(String e : namesList) {
			System.out.println(e);
				
			if(e.equals("Tony")) {
				System.out.println("Bye!!");
				break;
			}
			
		}
		
		
		
		
	}

}
