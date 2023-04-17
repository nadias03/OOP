package punktowane_01_kret_2021_jeszcze_raz;

public class Kret extends ObiektZiemny implements MoleMotion {
	Gatunek gatunek;
	ObiektZiemny teren[][];
	
	public Kret(Gatunek gatunek, ObiektZiemny[][] teren) {
		super(0);
		this.wartoscOdzywcza = rand.nextInt(200, 241);
		this.teren = teren;
		this.gatunek = gatunek;
	}

	@Override
	public void goMole() {
		int x = rand.nextInt(this.teren.length);
		int y = rand.nextInt(this.teren[0].length);
		
		if (this.teren[x][y] != null) {
			this.wartoscOdzywcza += this.teren[x][y].wartoscOdzywcza;
			System.out.println("Mniam");
			this.teren[x][y] = null;
		} else {
			System.out.println("Pusto :(");
		}
		
	}

	@Override
	public String getNutritionalValue() {
		return Integer.toString(this.wartoscOdzywcza);
	}
	
	
	
}
