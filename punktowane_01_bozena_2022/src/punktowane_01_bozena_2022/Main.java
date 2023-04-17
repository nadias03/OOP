package punktowane_01_bozena_2022;

public class Main {

	public static void main(String[] args) {
		//System.out.println("jooool");
		Pole p = new Pole();
		Bozena b = new Bozena(p);
		for (int i = 0; i < 10; i++) {
			b.destroyMines();
		}
	}

}
