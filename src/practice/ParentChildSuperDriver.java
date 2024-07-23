package practice;

public class ParentChildSuperDriver {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.details();
		c1.displayAll();
		Parent p1 = new Parent();
		
		System.out.println(c1 instanceof Child);
		System.out.println(c1 instanceof Parent);
		System.out.println(p1 instanceof Parent);
		System.out.println(p1 instanceof Child);
	}
      
}
