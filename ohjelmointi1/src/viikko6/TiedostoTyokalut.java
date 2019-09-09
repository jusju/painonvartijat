package viikko6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class TiedostoTyokalut {
    public void kirjoita(String teksti, String tiedosto) {
        try {
            PrintWriter kirjoittaja = new PrintWriter(new FileWriter(
                        new File(tiedosto), true), true);
            kirjoittaja.println(teksti);
            kirjoittaja.close();
        } catch (IOException ex) {
            System.out.println(
                "Tiedostoon ei voitu kirjoittaa. Oikeusongelma tms.?");
        }
    }

    public PainoMittaus[] lue() {
        PainoMittaus[] painot = new PainoMittaus[400];

        try {
            Scanner scan = new Scanner(new File("painotcsv.txt"));
            int laskuri = 0;

            while (scan.hasNext()) {
                String rivi = scan.nextLine();
                PainoMittaus mittaus = new PainoMittaus();
                String[] arvot = new String[2];
                arvot = rivi.split(",");
                mittaus.setPvm(new Pvm(arvot[0]));
                mittaus.setLukema(Integer.parseInt(arvot[1]));
                painot[laskuri] = mittaus;
                laskuri++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei l▒ytynyt!");
        }

        return (painot);
    }
}

