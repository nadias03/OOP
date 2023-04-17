package punktowane_01_grzybobranie_2022;

public class MuchomorSzarawy extends Grzyb {
	Toksyny toksyny;
	final int rokOdkryciaGatunku = 1783;
	
	public MuchomorSzarawy() {
		super(25, 75);
		this.toksyny = Toksyny.TRUJACE;
	}

	@Override
	public String toString() {
		return "Nazwa: muchomor szarawy" + ", twardosc: " + this.twardosc + ", masa owocnika: " + this.masaOwocnika + ", toksyny: " + this.toksyny + ", rok odkrycia gatunku: " + this.rokOdkryciaGatunku;
	}

	@Override
	protected void ugotuj() {
		super.ugotuj();
		this.toksyny = Toksyny.NIEOBECNE;
	}

	@Override
	protected boolean isTrujacy() {
		return !(this.toksyny == Toksyny.NIEOBECNE);
	}
	
	

	
	
	
	
	
}
