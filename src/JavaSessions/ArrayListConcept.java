package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList is a default class in Java
		//maintains the indexing(order)
		
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size());
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(12.33);
		ar.add(true);
		ar.add("testing");
		ar.add('m');//9
		
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(600);
		ar.add(700);
		
		//to print all the values from arraylist:
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//int data in arraylist:
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		System.out.println(marks.size());
		
		ArrayList<String> namesList = new ArrayList<String>();
		System.out.println(namesList.size());
		System.out.println(namesList);
		namesList.add("tom");//0
		namesList.add("peter");//1
		namesList.add("naveen");//2
		namesList.add("Tony");//3
		namesList.add("lisa");//4
		namesList.add("disha");//5

		System.out.println(namesList);
		System.out.println(namesList.get(4));
		//System.out.println(namesList.get(6));//IndexOutOfBound
		//System.out.println(namesList.get(-1));//IndexOutOfBound
		
		ArrayList<Double> salary = new ArrayList<Double>();
		salary.add(10.22);
		salary.add(200.00);
		
		ArrayList<String> linksList = new ArrayList<String>(5);
		linksList.add("Home");//0
		linksList.add("login");//1
		linksList.add("contact us");//2

		System.out.println(linksList);
		linksList.remove(1);
		System.out.println(linksList);
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(12);
		numList.add(15);
		numList.add(1);
		numList.add(22);
		numList.add(5);
		
		System.out.println(numList);
		Collections.sort(numList);
		System.out.println(numList);


		

		
		
		
	}

}
