package JavaSessions;

public class MethodsConcept {

	// can not create a function inside a function

	// 1. no input and no return
	// void : can not return anything
	public void test() {
		System.out.println("test method....");
	}

	// 2. no input but some return:
	// name: getNumber
	// return type: int
	public int getNumber() {
		System.out.println("get number");
		int a = 100;
		int b = 200;
		int c = a + b + 500;
		return c;
	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}

	// 3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method");
		int z = a + b;
		return z;
	}

	// WAF where you have to pass the studentname (String) and return marks(integer)

	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for : " + studentName);

		if (studentName.equals("Tom")) {
			return 90;
		} 
		else if (studentName.equals("Anu")) {
			return 95;
		} 
		else if (studentName.equals("Raj")) {
			return 80;
		} 
		else {
			System.out.println(studentName + " is not present....");
			return -1;
		}
	}

	//
	public int getMyStudentMarks(String studentName) {
		System.out.println("getting the marks for : " + studentName);
		int marks = -1;

		if (studentName.equals("Tom")) {
			marks = 90;
		} else if (studentName.equals("Anu")) {
			marks = 95;
		} else if (studentName.equals("Raj")) {
			marks = 80;
		} else {
			System.out.println(studentName + " is not present....");
		}

		return marks;

	}

	// WAF where we have to pass the browser name(String) and return boolean

	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser: " + browserName);
		boolean flag = false;

		switch (browserName) {
		case "chrome":
			System.out.println("chrome is launched");
			flag = true;
			break;

		case "firefox":
			System.out.println("ff is launched");
			flag = true;
			break;

		case "safari":
			System.out.println("safari is launched");
			flag = true;
			break;

		default:
			System.out.println("Please pass the correct browser name.." + browserName);
			break;
		}

		return flag;

	}
	
	//
	//Can I return multiple values from a function?--NO
	//WAF where it will take emp name(String) and return emp information
	//info: name, age, city, ph, compname
	
	public Object[] getEmpInfo(String empName) {
		System.out.println("Emp Name is : " + empName);
		Object empInfo[] = new Object[5];
				
		if(empName.equals("Disha")) {
			empInfo[0] = "Disha";
			empInfo[1] = 25;
			empInfo[2] = "London";
			empInfo[3] = 909090;
			empInfo[4] = "IBM";
		}
		
		else if(empName.equals("Raj")) {
			empInfo[0] = "Raj";
			empInfo[1] = 30;
			empInfo[2] = "NYC";
			empInfo[3] = 898989;
			empInfo[4] = "MS";
		}
		
		else {
			System.out.println("emp not found...");
		}
		
		return empInfo;
		
		
	}
	
	
	

	public static void main(String a[]) {
		// to call all the class methods (non static), we have to create the object of
		// the class:

		MethodsConcept obj = new MethodsConcept();
		obj.test();
		int sum = obj.getNumber();
		System.out.println(sum - 100);

		System.out.println(obj.getNumber());

		String n1 = obj.getTrainerName();
		System.out.println(n1);

		int s1 = obj.add(10, 20);
		System.out.println(s1);

		s1 = obj.add(30, 40);
		System.out.println(s1);

		int m1 = obj.getStudentMarks("Naveen");
		System.out.println(m1);

		int m2 = obj.getMyStudentMarks("Tom");
		System.out.println(m2);
		
		boolean b = obj.launchBrowser("IE");
		System.out.println(b);
		if(b) {
			System.out.println("enter the url...");
		}
		else {
			System.out.println("no browser found....");
		}
		
		Object dishInfo[] = obj.getEmpInfo("Disha");
		System.out.println(dishInfo.length);
		
		for(Object e : dishInfo) {
			System.out.println(e);
		}
		
	}

}
