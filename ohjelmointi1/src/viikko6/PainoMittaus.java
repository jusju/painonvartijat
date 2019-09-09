package viikko6;

public class PainoMittaus {
	private int lukema;
	private Pvm pvm;

	public PainoMittaus() {
	}

	public PainoMittaus(int lukema, Pvm pvm) {
		this.lukema = lukema;
		this.pvm = pvm;
	}

	public int getLukema() {
		return lukema;
	}

	public void setLukema(int lukema) {
		this.lukema = lukema;
	}

	public Pvm getPvm() {
		return pvm;
	}

	public void setPvm(Pvm pvm) {
		this.pvm = pvm;
	}
}
