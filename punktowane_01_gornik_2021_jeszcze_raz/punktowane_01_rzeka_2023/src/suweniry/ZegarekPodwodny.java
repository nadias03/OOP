package suweniry;

public class ZegarekPodwodny extends Zegarek {
	private boolean dziala;
	
	public ZegarekPodwodny() {
		super();
		double los = rand.nextDouble();
		if (los < 0.5) {
			this.dziala = true;
		} else {
			this.dziala = false;
		}
	}

	@Override
	public String toString() {
		return "-*-";
	}
	
	
}
