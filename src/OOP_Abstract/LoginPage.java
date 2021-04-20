package OOP_Abstract;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LP -- const....");
	}

	@Override
	public void header() {
		System.out.println("LP - header");
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}
	
	@Override
	public void pageLoading() {
		System.out.println("Login page loading... 10s");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " : " + pwd);
	}
	
	
	
	

}
