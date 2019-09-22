public class main {

	public static void main(String[] args) {
		
		iInstrument instrument1;
		iInstrument instrument2;
		
		instrument1 = new CLsaxo();
		instrument2 = new CLpiano();
		
		instrument1.jouer();
		instrument2.jouer();
		
		instrument2 = instrument1;
		
		instrument2.jouer();
		
	}
}