package punktowane_01_bozena_2022;

public class Purchawka extends ElementPodloza {
	private double wysokosc;
	
	public Purchawka() {
		super(false);   // cokolwiek ustawiam dla ekologiczna bo najpierw musi byc super
		// poprawiam pole ekologiczna
		double los = rand.nextDouble();
		if (los < 0.5) {
			this.ekologiczna = false;
		} else {
			this.ekologiczna = true;
		}
		
		this.wysokosc = 3.5 + rand.nextDouble() * (7.5 - 3.5);
	}

	@Override
	public String toString() {
		return "o";
	}

	@Override
	public void pressMe() {
		System.out.println("Puffff");
	}

	
	
	
	
	
}
