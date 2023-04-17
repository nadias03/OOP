package punktowane_01_bozena_2022;

public abstract class Mina extends ElementPodloza {
	protected int id;
	private static int licznik = 0;
	protected boolean uzbrojona;
	
	public Mina(boolean ekologiczna) {
		super(ekologiczna);
		this.id = licznik;
		licznik += 10;
	}
	
	protected void armMe() {
		this.uzbrojona = true;
	}
}
