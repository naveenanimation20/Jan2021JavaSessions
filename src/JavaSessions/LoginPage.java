package JavaSessions;

public class LoginPage {

	// Method Overloading (compile Poly+morphism): within the same class, when we have
	// different methods
	// with the same name
	// with diff params
	// the sequence of the params is diff

	public void login() {// 0

	}

	public void login(int a) {// 1

	}

	public int login(int c, int d) {// 2

		return 100;
	}

	public boolean login(int c, String d) {// 2

		return true;
	}

	public void login(String c, int d) {// 2

	}

	// login method overloading:
	public void doLogin() {
		System.out.println("default login");
	}

	public String doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " : " + pwd);
		return "login is sucessful";
	}

	public boolean doLogin(String un, String pwd, String role) {
		System.out.println("login with: " + un + " : " + pwd + " : " + role);
		return true;
	}

	public void doLogin(long phone, String pwd) {
		System.out.println("login with: " + phone + " : " + pwd);
	}

	public void doLogin(long phone, int otp) {
		System.out.println("login with: " + phone + " : " + otp);
	}

	//
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	//
	public void doPayment(String cc, int pwd) {

	}

	public void doPayment(String cc, int otp, String pwd) {

	}

	public void doPayment(String UPI) {

	}

	//
	public void bookingCar(String from, String to) {

	}

	public void bookingCar(String from, String to, String carType) {

	}
	
	public void bookingCar(String from, String to, String carType, int peronCount) {

	}

	public static void main(String[] args) {
		System.out.println("start");
		LoginPage lp = new LoginPage();

		lp.doLogin();
		lp.doLogin(9898989, 9090);
		if (lp.doLogin("admin", "admin123", "admin")) {
			System.out.println("im logged in...");

		}

		String mesg = lp.doLogin("naveen", "naveen123");
		System.out.println(mesg);

	}

}
