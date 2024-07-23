package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDriver {

	public static void main(String[] args) {
		
		ArrayList<Student> db = new ArrayList<>();
		
		db.add(new Student("Tejas", 22, 'B', "Apna College", 220, "cs", 68));
		db.add(new Student("Raju", 20, 'A', "SKN College", 120, "it", 65));
		db.add(new Student("Manas", 22, 'C', "NBN College", 180, "mech", 80));
		db.add(new Student("Kalpesh", 21, 'A', " College", 150, "E&tc", 90));
		db.add(new Student("Dhiraj", 25, 'B', "SCOE College", 40, "eee", 58));
		db.add(new Student("Bhavesh", 24, 'C', "PCCOE College", 20, "mech", 45));
		db.add(new Student("Mohit", 25, 'A', "JSPM College", 202, "eee", 60));
		db.add(new Student("Sagar", 26, 'A', "D.Y.Patil College", 205, "cs", 68));
		
		Iterator itr = db.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Sorted data");
		
		Collections.sort(db);
		
		Iterator itr2 = db.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
