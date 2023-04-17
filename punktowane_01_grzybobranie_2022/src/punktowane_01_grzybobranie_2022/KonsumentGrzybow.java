package punktowane_01_grzybobranie_2022;

public class KonsumentGrzybow {
	GetGrzyb pobieranieGrzyba;   // tego nie ogarniam konceptu !!!!
	
	public KonsumentGrzybow(GetGrzyb pobieranieGrzyba) {
		this.pobieranieGrzyba = pobieranieGrzyba;
	}
	
	public void konsumujGrzyby(int n) {
		for (int i = 0; i < n; i++) {
			Grzyb grzyb = this.pobieranieGrzyba.zwrocGrzyba();
			if (grzyb != null) {
				grzyb.ugotuj();
				if (!this.zjedz(grzyb)) {
					System.out.println("Uuuups!");
					break;
				}
			}
			
		}
	}
	
	private boolean zjedz(Grzyb grzyb) {
		if (grzyb.isTrujacy()) {
			return false;
		} 
		return true;
	}
}
