package OOP_Interface;

public class FortisHopital extends Medical implements USMedical, UKMedical, IndianMedical {

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	}

	@Override
	public void radioServices() {
		System.out.println("FH - radioServices");

	}

	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");

	}

	@Override
	public void gynecServices() {
		System.out.println("FH - gynecServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");

	}
	
	//non overridden:
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}
	
	public void pathalogyServices() {
		System.out.println("FH -- pathalogyServices");

	}
	
	@Override
	public void taxCollection() {
		System.out.println("FH -- 20% tax collection....");
	}

	@Override
	public void covidTest() {
		System.out.println("FH -- covid test");
	}
	
	
	
	

}
