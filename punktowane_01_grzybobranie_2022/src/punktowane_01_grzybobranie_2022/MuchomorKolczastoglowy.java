package punktowane_01_grzybobranie_2022;

public class MuchomorKolczastoglowy extends Grzyb {
	
	public MuchomorKolczastoglowy() {
		super(25, 50);
	}

	@Override
	public String toString() {
		return "Nazwa: muchomor kolczastoglowy, " + "twardosc: " + this.twardosc + ", masa owocnika: " + this.masaOwocnika;
	}
	
	
}
