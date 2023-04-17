package punktowane_01_gornik_2021_jeszcze_raz;

import java.util.Random;

public abstract class ObiektKopalniany implements MineryObjectEvaluator {
	// julka nieabstrakcyjna
	protected double wartoscRynkowa;
	
	static final Random rand = new Random();
	
	public ObiektKopalniany(double wartoscRynkowa) {
		this.wartoscRynkowa = wartoscRynkowa;
	}

	@Override
	public String toString() {
		return Double.toString(this.wartoscRynkowa);
	}

	@Override
	public double getModifiedMarketValue() {
		return 0.0;
	}
	
	
	
	
}
