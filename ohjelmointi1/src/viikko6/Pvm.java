package viikko6;

import java.util.Calendar;

public class Pvm {
    private int pp;
    private int kk;
    private int vv;

    // oletuskonstruktori
    public Pvm() {
        Calendar nyt = Calendar.getInstance();
        pp = nyt.get(Calendar.DAY_OF_MONTH);
        kk = nyt.get(Calendar.MONTH) + 1;
        vv = nyt.get(Calendar.YEAR);
    }

    public Pvm(String pvm) {
        String rivi = pvm;
        String[] pvmKirjaus =  new String[3];
        pvmKirjaus = rivi.split("\\.");
        this.pp = Integer.parseInt(pvmKirjaus[0]);
        this.kk = Integer.parseInt(pvmKirjaus[1]);
        this.vv = Integer.parseInt(pvmKirjaus[2]);
    }

    public  int getPp() {
       return(this.pp);
    }
    public  int getKk() {
       return(this.kk);
    }
    public  int getVv() {
       return(this.vv);
    }
    public void  setPp(int pp) {
       this.pp = pp;
    }
    public void  setKk(int kk) {
       this.kk = kk;
    }
    public void  setVv(int vv) {
       this.vv = vv;
    }

    public String toString() {
       String paluu = pp + "." + kk + "." + vv;
       return(paluu);
    }
}

