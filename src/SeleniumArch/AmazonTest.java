package SeleniumArch;

public class AmazonTest {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "ie";

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();
		//cross browser testing:
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("browser not found....");
			break;
		}

		driver.get("http://www.amazon.com");
		String title = driver.title();
		System.out.println(title);

		driver.click("sign up link");
		driver.sendKeys("first name", "naveen");
		driver.quit();
	}

}
