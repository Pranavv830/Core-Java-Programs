package object;

public class EqualsMethod {

	String name;
	int age;
	int roll;
	String college;
	
    public EqualsMethod() {
    	
    }

    EqualsMethod(String name, int age, int roll, String college) {

		this.name = name;
		this.age = age;
		this.roll = roll;
		this.college = college;
	}
    
    public String toString() {
		return "EqualsMethod[Name: "+name+",age: "+age+",roll: "+roll+",college: "+college+"]";
    	
    }
    
    public boolean equals(Object o) {
    	
    	if (this.name==name && this.age==age && this.roll==roll && this.college==college) {
			return true;
		}
       return false;
    }
    @Override
    public int hashCode() {
    	int hc = 0;
    	hc = hc+roll+age+name.hashCode()+college.hashCode();
    	return hc;
    }
}

