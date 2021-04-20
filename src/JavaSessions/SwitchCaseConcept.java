package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String name = "Kunal";
		
		switch (name) {
		case "Kunal":
			System.out.println(name + " 100 marks");
			break;
		case "Naveen":
			System.out.println(name + " 50 marks");
			break;
		case "Raksha":
			System.out.println(name + " 90 marks");
			break;
		case "Tom":
			System.out.println(name + " 80 marks");
			break;
		case "Peter":
			System.out.println(name + " 95 marks");
			break;
		

		default:
			System.out.println(name + " : is not found....");
			break;
		}
		
		
		//
		String browser = "Chrome";
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass the correct browser name...");
			break;
		}
		
		//
		String country = "Russia";
		String capital = null;
		switch (country) {
		case "India":
			capital = "New Delhi";
			break;
		case "UK":
			capital = "London";
			break;
		case "US":
			capital = "DC";
			break;
		case "Germany":
			capital = "Munich";
			break;

		default:
			System.out.println("country is not found....");
			break;
		}
		
		System.out.println("Country is :"  +country + " capital is : " + capital);
		
		
		///
		int marks = 95;
		String grade = null;
		switch (marks) {
		case 100:
			grade = "GRADE A";
			break;
		case 80:
			grade = "GRADE B";
			break;
		case 50:
			grade = "GRADE c";
			break;
		case 30:
			grade = "FAIL";
			break;

		default:
			break;
		}
		
		System.out.println("marks: " + marks + " grade is : " + grade);
		
		//
		//WAP to find out the highest number (where three numbers are there and all are different):
		//&& - Short Circuit Operator
		int x = 500;
		int y = 600;
		int z = 300;
		
		if(x>y && x>z) {//false && true
			System.out.println("x is the greatest");
		}
		else if(y>z) {//true
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
		
		//< > <= >= != 
		
		
	}

}
