package punktowane_01_grzybobranie_2022;

public class MuchomorCesarski extends Grzyb {
	
	public MuchomorCesarski() {
		super(Twardosc.TWARDY, 50, 75);
	}

	@Override
	public String toString() {
		return "Nazwa: muchomor cesarski, " + "twardosc: " + this.twardosc + ", masa owocnika: " + this.masaOwocnika;
	}
	
	
}
