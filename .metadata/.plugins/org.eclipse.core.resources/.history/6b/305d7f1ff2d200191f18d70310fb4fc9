package viikko6;

public class Piirturi {
    private PainoMittaus[] mittaukset = new PainoMittaus[400];

    private String[][] kuvaaja = new String[80][50];

    public Piirturi(PainoMittaus[] mittaukset) {
            this.mittaukset = mittaukset;
    }

    public void alustaKuva() {
            int mittauksienMaara = mittaukset.length;
            TiedostoTyokalut kalut = new TiedostoTyokalut();
            int mittauskohta = 0;

            for (int y = 0; y < 80; y++) {
                    for (int x = 0; x < 50; x++) {

                            if (mittauskohta <= mittauksienMaara) {
                                    int kohta = 0;
                                    if (mittaukset[mittauskohta] != null) {
                                            kohta = mittaukset[mittauskohta].getLukema() - 40;
                                    }
                                    int laskuri = 0;

                                    while (laskuri < kohta) {
                                            kuvaaja[y][laskuri] = "#";
                                            laskuri++;
                                    }
                                    laskuri = 0;
                                    kuvaaja[y][x] = " ";
                            }

                    }
                    if (y < mittauksienMaara) {
                            kuvaaja[y][49] = "\n";
                            mittauskohta++;
                    } else {
                            break;
                    }
            }
    }

    public void piirraNaytolle() {
            for (int y = 0; y < 80; y++) {
                    for (int x = 0; x < 50; x++) {
                            if (kuvaaja[y][x] != null) {
                                    System.out.print(kuvaaja[y][x]);
                            }
                    }
            }
    }

}