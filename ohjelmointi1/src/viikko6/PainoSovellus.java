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
		int valinta = -1;
		while (valinta != 0) {
			System.out.println("Valikko");
			System.out.println("0) Lopeta");
			System.out.println("1) Lis�� painokirjaus t�lle p�iv�lle");
			System.out.println("2) Tulosta painokuvaaja");
			System.out.println("Anna valintasi (0, 1 tai 2):");
			valinta = scan.nextInt();
			scan.nextLine();
			if (valinta == 2) {
				tulostaPainoKuvaaja();
			} else if (valinta == 0) {
				System.exit(0);
			} else {
				Pvm pvm = new Pvm();
				System.out.println("T�n��n on: " + pvm);
				System.out.println("Anna paino (muodossa 9.9.2019,85): ");
				String paino = scan.nextLine();
				TiedostoTyokalut tiedostoTyokalut = new TiedostoTyokalut();
				tiedostoTyokalut.kirjoita(paino, "painotcsv.txt");
			}
		}
	}

	public void tulostaPainoKuvaaja() {
		PainoMittaus[] painot = new PainoMittaus[400];
		TiedostoTyokalut tiedostoTyokalut = new TiedostoTyokalut();
		painot = tiedostoTyokalut.lue();
		Piirturi piirturi = new Piirturi(painot);
		piirturi.alustaKuva();
		piirturi.piirraNaytolle();
	}

	public static void main(String[] args) {
		PainoSovellus paino = new PainoSovellus();
		paino.tulostaValikko();
	}
}
