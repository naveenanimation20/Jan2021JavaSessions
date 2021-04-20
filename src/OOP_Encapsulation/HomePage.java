package OOP_Encapsulation;

public class HomePage {
	
	//locators:
	private String email = "#username";
	private String pwd = "//input[@id='value']";
	private String loginButton = "#loginbutton";
	
	//Page Actions (Public):
	public void enterUserName(String userName) {
		System.out.println(email +  "--> enter the user name : " + userName);
	}
	
	public void enterPassword(String password) {
		System.out.println(pwd +  "--> enter the PASSWORD : " + password);
	}
	
	public void clickLoginButton() {
		System.out.println(loginButton +  "--> click on Login button ");
	}
	
	

}
