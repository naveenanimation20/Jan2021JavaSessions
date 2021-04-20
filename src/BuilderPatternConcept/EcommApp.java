package BuilderPatternConcept;

public class EcommApp {

	public EcommApp doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " " + pwd);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("searching prooduct: " + productName);
		return this;
	}

	public EcommApp search(String productName, String color) {
		System.out.println("searching prooduct: " + productName + " " + color);
		return this;
	}

	public EcommApp addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;

	}

	public EcommApp checkout(String productName) {
		System.out.println("check out: " + productName);
		return this;

	}

	public EcommApp doPayment(String CC, String pwd) {
		System.out.println("payment done with : " + CC + " : " + pwd);
		return this;

	}

	public EcommApp getOrderDetails(String productName) {
		System.out.println("get order details for : " + productName);
		return this;

	}

	public EcommApp logout() {
		System.out.println("logout from app.....");
		return this;

	}

}
