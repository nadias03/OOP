package suweniry;

public class But extends Element {
	private String rodzajButa = new String("Kalosz");
	
	public But() {
		super(0);
	}

	@Override
	public String toString() {
		return "@";
	}

	@Override
	public int distance() {
		return rand.nextInt(2, 4);
	}
	
	
	
	
}
