package modelowaniewycinkarzeki;

public class WycinekRzeki3 extends WycinekRzeki2 {
	
	public WycinekRzeki3(int szerokosc, int dlugosc) {
		super(szerokosc, dlugosc);
	}

	@Override
	public void moveAll() {
		super.moveAll();
		this.wypiszRzeke();
	}
	
	private void wypiszRzeke() {
		for (int i = 0; i < this.wycinek.length; i++) {
			for (int j = 0; j < this.wycinek[i].length; j++) {
				if (this.wycinek[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(this.wycinek[i][j].toString());
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
