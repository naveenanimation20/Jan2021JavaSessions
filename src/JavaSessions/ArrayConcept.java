package JavaSessions;

import java.util.Arrays;
import java.util.List;

public class ArrayConcept {

	public static void main(String[] args) {

		//static arrays: size is fixed
		//two major limitations:
		//1. size is fixed: 
			//a. if you have more segments but data is less: wastage of memory
			//b. if you have less segments but data is more: you dont have segments
					
		//2. it can store only similar types of data
		
		//1d array or single dim array:
		//1. int array:
		
		int marks[] = {10,2,3,44,55,22,200}; //Array Literals
		System.out.println(marks.length);//7
		
		Arrays.sort(marks);
		
		for(int e : marks) {
			System.out.println(e);
		}
		
		System.out.println("===========");
		
		
		System.out.println(marks);
		
		int i[] = new int[100];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		//print all the values from array: use for loop:
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		System.out.println("-----------");
		//for each:
		for(int e : i) {
			System.out.println(e);
		}
		System.out.println("-----------");

		
		//double array:
		double d[] = new double[2];
		d[0] = 12.33;
		//d[1] = 23.44;
		System.out.println(d[0] + d[1]);
		//System.out.println(d[2]);
		System.out.println(d[1]);
		
		double num[] = new double[2];
		//li = 0;
		//hi = 98 => l-1
		//l = hi+1 = 99
		System.out.println("----char-----");
		//char array:
		char c[] = new char[3];
		c[0]= 'a';
		c[1]='$';
		//c[2]='1';
		System.out.println(c[2]);
		System.out.println("----char end-----");

		//String array:
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "C#";
		lang[2] = "Python";
		lang[3] = "JavaScript";
		System.out.println(lang[3]);
		
		for(int p=0; p<lang.length; p++) {
			System.out.println(lang[p]);
		}

		//for each:
		for(String e : lang) {
			System.out.println(e);
		}
		
		//create an array where you want to store diff type of data with static array:
		//emp info: name,age, 'm', 34.44, true
		//to use this data, we need to use Object static array:

		Object ob[] = new Object[5];
		ob[0] = "Peter";
		ob[1] = 20;
		ob[2] = 34.55;
		ob[3] = 'm';
		ob[4] = true;
		
		System.out.println(ob[4]);
		
		for(int n=0; n<ob.length; n++) {
			System.out.println(ob[n]);
		}
		//for each: for object array:
		for(Object e : ob) {
			System.out.println(e);
		}
		
		//boolean array:
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=true;
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		//2d array: two dim array:
		//use case: testNG -- data provider + with selenium --> data driven
		//nested for loops:
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		
		for(int h = 0; h<=9; h++) {
			for(int g =0; g<=9; g++) {
				System.out.print(h+""+g+" ");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		//2d array:
		int dd[][] = new int[8][8];
		
		for(int h=0; h<dd.length; h++) {
			for(int g=0; g<dd[0].length; g++) {
				System.out.print(h+""+g+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
