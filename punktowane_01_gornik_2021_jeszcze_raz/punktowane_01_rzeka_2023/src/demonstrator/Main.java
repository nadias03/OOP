package demonstrator;

import suweniry.*;
import modelowaniewycinkarzeki.*;

public class Main {

	public static void main(String[] args) {
		WycinekRzeki1 r1 = new WycinekRzeki1(8, 5);
		for (int i = 0; i < 10; i++) {
			r1.moveAll();
		}
		
		System.out.println();
		
		WycinekRzeki2 r2 = new WycinekRzeki2(8, 5);
		for (int i = 0; i < 10; i++) {
			r2.moveAll();
		}
		
		System.out.println();
		
		WycinekRzeki3 r3 = new WycinekRzeki3(8, 5);
		for (int i = 0; i < 10; i++) {
			r3.moveAll();
		}
		
		

	}

}
