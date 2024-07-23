package interfaces;

public class PubgDriver {

	public static void main(String[] args) {
		
	/*	Pubg p1 = new PubgImp("Pranav", "Pranav1234");
		
		p1.run(50);
		p1.fire();
		p1.reload();
		p1.turnLeft();
		p1.turnRight();
		p1.jump(); */
		
		Pubg p2 = new Pubg_V2("Pranav", "Pranav1234");
		
		p2.run(40);
		p2.fire();
		p2.reload();
		p2.turnLeft();
		p2.turnRight();
		p2.jump();
	}
}
