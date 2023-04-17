package modelowaniewycinkarzeki;

public class WycinekRzeki2 extends WycinekRzeki1 {
	private int liczbaWywolan;
	
	public WycinekRzeki2(int szerokosc, int dlugosc) {
		super(szerokosc, dlugosc);
	}

	@Override
	public void moveAll() {
		super.moveAll();
		this.liczbaWywolan ++;
	}
	
	public int getIloscWywolan() {
		return liczbaWywolan;
	}
	
}