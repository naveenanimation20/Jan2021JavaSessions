package JavaSessions;

import java.util.ArrayList;

public class PageLinks {

	// WAF where you need to pass the page name and return the total links
	// and another function -- return list of all the links text on the page

	public int getLinksCount(String pageName) {
		int count = getPageLinksTextList(pageName).size();
		return count;
	}

	public ArrayList<String> getPageLinksTextList(String pageName) {

		System.out.println("getting page links text for : " + pageName);
		ArrayList<String> linksList = new ArrayList<String>();

		if (pageName.equals("LoginPage")) {
			linksList.add("login");
			linksList.add("contact us");
			linksList.add("privacy policy");
		}

		else if (pageName.equals("HomePage")) {
			linksList.add("logout");
			linksList.add("wishlist");
			linksList.add("bussiness");
		} else {
			System.out.println("page is not available....");
		}

		return linksList;

	}

	public static void main(String[] args) {

		PageLinks p1 = new PageLinks();
		int c1 = p1.getLinksCount("HomePage");
		System.out.println(c1);
		
		ArrayList<String> homeList = p1.getPageLinksTextList("HomePage");
		System.out.println(homeList);
		System.out.println(homeList.size());

	}

}
