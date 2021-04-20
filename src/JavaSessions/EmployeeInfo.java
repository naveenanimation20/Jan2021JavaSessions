package JavaSessions;

import java.util.ArrayList;

public class EmployeeInfo {

	String name;
	int age;
	ArrayList<String> devicesList;

	public EmployeeInfo(String name, int age, ArrayList<String> devicesList) {
		this.name = name;
		this.age = age;
		this.devicesList = devicesList;
	}

	public static void main(String[] args) {

		ArrayList<String> empDeviceList = new ArrayList<String>();
		empDeviceList.add("iPhone 12");
		empDeviceList.add("Macbook pro");
		empDeviceList.add("Monitor");

		EmployeeInfo e1 = new EmployeeInfo("Tom", 25, empDeviceList);
		
		System.out.println(e1.name + " " + e1.age);
		
		System.out.println(e1.devicesList);
		System.out.println(e1.devicesList.size());
		
		for(int i=0; i<e1.devicesList.size(); i++) {
			System.out.println(e1.devicesList.get(i));
		}
		
		
		
	}

}
