package viikko6;

import java.util.Scanner;

/**
 *
 * @author Jukka Juslin
 *
 */
public class PainoSovellus {

	public void tulostaValikko() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valikko");
		System.out.println("0) Lopeta");
		System.out.println("1) Lis‰‰ painokirjaus t‰lle p‰iv‰lle");
		System.out.println("2) Tulosta painokuvaaja");
		System.out.println("Anna valintasi (0, 1 tai 2):");
		int valinta = scan.nextInt();
		if(valinta == 1) {
			aja();
		} else if(valinta == 0){
			
		} else {
			
		}
	}
	
	public void aja() {
		PainoMittaus[] painot = new PainoMittaus[400];
		TiedostoTyokalut tiedostoTyokalut = new TiedostoTyokalut();
		painot = tiedostoTyokalut.lue();
		Piirturi piirturi = new Piirturi(painot);
		piirturi.alustaKuva();
		piirturi.piirraNaytolle();
		MeNaiset meNaiset = new MeNaiset();
		meNaiset.kerroFaktat();
	}

	public static void main(String[] args) {
		PainoSovellus paino = new PainoSovellus();
		paino.tulostaValikko();
	}
}
