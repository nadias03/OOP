package punktowane_01_bozena_2022;

public class Trawa extends ElementPodloza {
	private double wysokosc;
	
	public Trawa() {
		super(true);
		this.wysokosc = 10.5 + rand.nextDouble() * (50.5 - 10.5);
	}

	@Override
	public String toString() {
		return "|";
	}

	@Override
	public void pressMe() {
		System.out.println("Chrup");
	}

	
	
	
	
	
}
