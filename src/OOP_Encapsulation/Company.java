package OOP_Encapsulation;

public class Company {

	private String name;
	private int sharePrice;
	private String policy;

	public Company(String name, int sharePrice, String policy) {
		this.name = name;
		this.sharePrice = sharePrice;
		this.policy = policy;
	}
	
	public Object[] getCompInfo() {
		Object comp[] = new Object[3];
		comp[0] = name;
		comp[1] = sharePrice;
		comp[2] = policy;
		return comp;
	}

	// setter:
//	public void setName(String name) {
//		this.name = name;
//	}

	// getter:
//	public String getName() {
//		return name;
//	}
//
//	public int getSharePrice() {
//		return sharePrice;
//	}

//	public void setSharePrice(int sharePrice) {
//		this.sharePrice = sharePrice;
//	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

}
