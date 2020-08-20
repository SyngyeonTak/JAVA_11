package marker;

public class Check {
	public static void main(String[] args) {
		Digimon d = new Digimon();
		Pokemon p = new Pokemon();
		ZzangGu z = new ZzangGu();
		HarryPotter h = new HarryPotter();
		
		if(d instanceof Animation) {
			System.out.println("Digimon Is An Animation!");
		}
		if(p instanceof Animation) {
			System.out.println("Pokemon Is An Animation!.");
		}
		if(z instanceof Animation) {
			System.out.println("ZzangGu Is An Animation!");
		}
		if(!(h instanceof Animation)){
			System.out.println("HarryPotter Is Not An Animation!");
		}
		
	}
}
