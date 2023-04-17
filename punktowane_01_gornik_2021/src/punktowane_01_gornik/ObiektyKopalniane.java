package punktowane_01_gornik;

import java.util.Random;

public abstract class ObiektyKopalniane implements MineryObjectEvaluator {
	double bazowaWartoscRynkowa;
	static final Random rand = new Random();
	
	public ObiektyKopalniane(double bazowaWartoscRynkowa) {
		this.bazowaWartoscRynkowa = bazowaWartoscRynkowa;
	}
}
