package JavaSessions;

import java.util.ArrayList;

public class GarbageCollectorConcept {

	String name;
	int age;

	public static void main(String[] args) {

		GarbageCollectorConcept e1 = new GarbageCollectorConcept();
		e1.name = "Tom";
		e1.age = 20;

		System.out.println(e1.name);

		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		
		GarbageCollectorConcept e2 = new GarbageCollectorConcept();
		GarbageCollectorConcept e3 = new GarbageCollectorConcept();
		
		e2 = null;
		e3 = null;
		
		System.gc();
		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar);
		
		ar.add(ar.size(), 400);
		
		System.out.println(ar);



	}

}
