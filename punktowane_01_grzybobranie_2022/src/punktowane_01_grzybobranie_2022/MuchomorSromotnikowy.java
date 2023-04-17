package punktowane_01_grzybobranie_2022;

public class MuchomorSromotnikowy extends Grzyb {
	Toksyny toksyny;

	public MuchomorSromotnikowy() {
		super(25, 75);
		if (this.masaOwocnika < 50) {
			this.toksyny = Toksyny.ZABOJCZE;
		} else {
			this.toksyny = Toksyny.WYJATKOWOZABOJCZE;
		}
	}

	@Override
	public String toString() {
		return "Nazwa: muchomor sromotnikowy, " + "twardosc: " + this.twardosc + ", masa owocnika: " + this.masaOwocnika + ", toksyny: " + this.toksyny;
	}

	@Override
	protected boolean isTrujacy() {
		return false;
	}
	
	
	
	
	
	

	
	
}
