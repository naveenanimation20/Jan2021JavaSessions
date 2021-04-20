package AM2;

import AccessModifiers.Car;

public class Audi extends Car{

	public static void main(String[] args) {

		Car c = new Car();
		c.price = 100;
		
		Audi a = new Audi();
		a.color = "Red";
		a.price = 200; 
		
		String x = ".......";
		String y = "...";
		String z = "..";
		
		int one = 'A'/'A';
		for(int i = one; i<= Integer.parseInt((x.length()+""+y.length()+""+z.length())); i++){
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
