package collectionPractice;

public class Student implements Comparable<Student>{

	String name;
	int age;
	char grade;
	String coll;
	int roll;
	String branch;
	double per;
	
	public Student() {
		
	}

	public Student(String name, int age, char grade, String coll, int roll, String branch, double per) {
		
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.coll = coll;
		this.roll = roll;
		this.branch = branch;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", coll=" + coll + ", roll=" + roll
				+ ", branch=" + branch + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student req) {
		if (this.roll > req.roll) {
			return 1;
		}
		else if (this.roll < req.roll) {
			return -1;
		}
		return 0;
	}
	
}
