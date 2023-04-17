package punktowane_01_bozena_2022;

import java.util.Random;

public abstract class ElementPodloza implements Pressing {
	protected boolean ekologiczna;
	
	static final Random rand = new Random();
	
	public ElementPodloza(boolean ekologiczna) {
		this.ekologiczna = ekologiczna;
	}

	@Override
	public void pressMe() {
		// nic :))
		
	}
	
	
}
