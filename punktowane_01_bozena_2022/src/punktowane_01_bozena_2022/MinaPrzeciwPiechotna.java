package punktowane_01_bozena_2022;

public class MinaPrzeciwPiechotna extends Mina {
	private Obudowa obudowa;
	
	public MinaPrzeciwPiechotna() {
		super(false);   // cokolwiek ustawiam dla ekologiczna bo najpierw musi byc super
		this.obudowa = Obudowa.values()[rand.nextInt(Obudowa.values().length)];
		
		// poprawnienie pola ekologiczna
		switch(this.obudowa) {
			case METAL:
				this.ekologiczna = false;
				break;
			case PLASTYK:
				this.ekologiczna = false;
				break;
			case KARTON:
				this.ekologiczna = true;
				break;
		}
	}

	@Override
	public String toString() {
		return "x";
	}

	@Override
	public void pressMe() {
		if (this.uzbrojona) {
			System.out.println("Boom!");
		} else {
			System.out.println("Chrup");
		}
	}

	
	
	
	
	
}
