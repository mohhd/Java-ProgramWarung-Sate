
public class Minuman extends Makanan{
	public int EsTeh,
			   EsJeruk,
			   orangg;
	
	public Minuman(int Ayam, int Kambing, int GuleKambing, int Teh, int Jeruk) {
		super(Ayam, Kambing, GuleKambing);
		EsTeh = Teh;
		EsJeruk = Jeruk;
	}
	protected void setOrg(int org) {
		orangg = org;
	}
	protected int getOrg() {
		return orangg;
	}
	protected int hargaTeh() {
		int total = EsTeh * orangg;
		return total;
	}
	protected int hargaJeruk() {
		int total = EsJeruk * orangg;
		return total;
	}
}
