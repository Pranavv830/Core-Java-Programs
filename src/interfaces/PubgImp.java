package interfaces;

public class PubgImp implements Pubg{
	
	String user;
	String passwors;
	int bullets=30;
	
	PubgImp(String user, String passwors) {
	
		this.user = user;
		this.passwors = passwors;
	}

	@Override
	public void turnRight() {
		System.out.println("Turned Right");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("Turned Left");
		
	}

	@Override
	public void jump() {
		System.out.println("Jumped!");
		
	}

	@Override
	public void run(int mtr) {
		System.out.println("Run forword for "+mtr+" meaters");
		
	}

	@Override
	public void fire() {
	    if (bullets > 0) {
			System.out.println("Bullet Fired");
			bullets--;
		}
	    else {
			System.out.println("Please Reload");
		}
		
	}

	@Override
	public void reload() {
		bullets = 30;
		System.out.println("reloaded");
		
	}
	
	

}
