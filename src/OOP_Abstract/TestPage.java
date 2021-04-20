package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.doLogin("admin", "admin");
		
		lp.title();
		lp.header();
		
		lp.pageLoading();
		
		//top casting:
		Page pg = new LoginPage();
		pg.title();
		pg.header();

		//down casting:
		//LoginPage lp1 = new Page();
		
	}

}
