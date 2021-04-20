package SeleniumArch;

public class ChromeDriver implements WebDriver {
	
	
	public ChromeDriver() {
		System.out.println("launch chrome browser....");
	}
	

	@Override
	public void findElement() {
		System.out.println("findElement");
	}

	@Override
	public void get(String url) {
		System.out.println("lauhch url : " + url);
	}

	@Override
	public void click(String element) {
		System.out.println("click on element : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter value in element : " + element + "value = "+ value);

	}

	@Override
	public String title() {
		System.out.println("title of the page....");
		return "some title";
	}

	@Override
	public void quit() {
		System.out.println("quit the browser");
	}

}
