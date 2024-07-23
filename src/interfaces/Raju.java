package interfaces;

public class Raju implements Raja,Rani{

	@Override
	public void fighting() {
		
		System.out.println("Karate");
		
		Raja.test();
		Rani.test();
	//	test(); CTE
		
		System.out.println(Raja.a);
		System.out.println(d);
		System.out.println(s);
	//	System.out.println(a);  CTE BECAUSE AMBIGUIOUS
	}

	@Override
	public void singing() {
		
		System.out.println("Rap");
	}

}
