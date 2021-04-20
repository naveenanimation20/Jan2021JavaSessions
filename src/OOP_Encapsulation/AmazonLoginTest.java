package OOP_Encapsulation;

public class AmazonLoginTest {

	public static void main(String[] args) {

		Login lp = new Login();
		
		lp.setUsername("admin@gmail.com");
		lp.setPassword("admin123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		System.out.println(lp.getUsername());
		
		lp.setPassword("admin456");
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		lp.setUsername("seller@gmail.com");
		lp.setPassword("seller@123");
		lp.doLogin(lp.getUsername(), lp.getPassword());

		//================
		
//		Login lp_seller = new Login();
//		lp_seller.setUsername("seller@gmail.com");
//		lp_seller.setPassword("seller@123");
//		
//		lp_seller.doLogin(lp_seller.getUsername(), lp_seller.getPassword());
		
		HomePage hp = new HomePage();
		hp.enterUserName("admin@gmail.com");
		hp.enterPassword("admin@123");
		hp.clickLoginButton();
		
		
		

	}

}
