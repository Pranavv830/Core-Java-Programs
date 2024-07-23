package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateDriver {

	public static void main(String[] args) {
		
		List<Dates> dates = new ArrayList<>();
		
		dates.add(new Dates("20 oct 2052"));
		dates.add(new Dates("30 may 2001"));
		dates.add(new Dates("12 oct 2002"));
		dates.add(new Dates("24 sep 1999"));
		dates.add(new Dates("20 dec 2005"));
		dates.add(new Dates("05 jan 1997"));
		
		Collections.sort(dates);
		
		for (Dates d : dates) {
			System.out.println(d);
		}
		
	}
}
