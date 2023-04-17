package punktowane_01_grzybobranie_2022;

public class Main {

	public static void main(String[] args) {
		System.out.println("jajebie");
		GetGrzyb getGrzyb = new Las(5, 6);
		KonsumentGrzybow kg = new KonsumentGrzybow(getGrzyb);
		kg.konsumujGrzyby(54);
		
		// nic sie nie wypisuje cute
	}

}
