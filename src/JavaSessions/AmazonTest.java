package JavaSessions;

public class AmazonTest {

	public static void main(String[] args) {

		//seller user:
		AmazonLogin az = new AmazonLogin("seller", "seller123", "sellerRole");
		System.out.println(az.username);
		System.out.println(az.role);
		System.out.println(az.password);
		
		az.doLogin(az.username, az.password, az.role);
		az.forgotPwd(az.username);
		
		//customer:
		AmazonLogin az1 = new AmazonLogin("naveen", "naveen123");
		az1.doLogin(az1.username, az1.password);
		az1.forgotPwd(az1.username);
		
		
	}

}
