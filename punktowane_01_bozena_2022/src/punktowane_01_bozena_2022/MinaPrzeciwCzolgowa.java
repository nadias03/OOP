package punktowane_01_bozena_2022;

public class MinaPrzeciwCzolgowa extends Mina {
	private double masaMaterialuWybuchowego;
	
	public MinaPrzeciwCzolgowa() {
		super(false);
		this.masaMaterialuWybuchowego = 1.5 + rand.nextDouble() * (2.5 - 1.5);
	}

	@Override
	public String toString() {
		return "X";
	}

	@Override
	public void pressMe() {
		if (this.uzbrojona) {
			System.out.println("Kaboom!!!");
		} else {
			System.out.println("Chrup");
		}
	}

	
	
	
	
	
}
