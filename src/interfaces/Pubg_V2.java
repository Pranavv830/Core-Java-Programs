package interfaces;

public class Pubg_V2 extends PubgImp{

	Pubg_V2(String user, String passwors) {
		super(user, passwors);
		System.out.println("Account Created");
	}

	public void fire() {
		if (bullets > 0) {
			System.out.println("Fired!");
			System.out.println(--bullets+" bullets left!");
			
		} else {
            System.out.println("bullets reloaded");
            reload();
		}
	}
	public void reload() {
		if (bullets == 0) {
			bullets = 30;
			
		} else {
            super.reload();
		}
	}
}
