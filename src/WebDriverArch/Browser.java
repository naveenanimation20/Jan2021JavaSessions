package WebDriverArch;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching the Browser");
		checkBrowserversion();
		System.out.println("browser is launched....");
	}

	private void checkBrowserversion() {
		System.out.println("checkBrowserversion");

		checkRAMSpace();
	}

	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
		OSCompatibale();
	}

	private void OSCompatibale() {
		System.out.println("OSCompatibale");
		needUpgrade();
	}

	private void needUpgrade() {
		System.out.println("need upgrade");
	}

}
