package collectionPractice;


public class Dates implements Comparable<Dates> {

	String Date;
	
	public Dates() {
		
	}

	public Dates(String date) {

		this.Date = date;
	}

	

	@Override
	public String toString() {
		return "Dates [Date=" + Date + "]";
	}

	@Override
	public int compareTo(Dates val) {
		
		int year1 = Integer.parseInt(this.Date.substring(this.Date.length()-4));
		int year2 = Integer.parseInt(val.Date.substring(val.Date.length()-4));
		
		if (year1 > year2) {
			return 1;
		}
		else if (year1 < year2) {
			return -1;
		}
		return 0;
	}

}
