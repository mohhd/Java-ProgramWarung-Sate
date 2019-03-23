
public class Menu extends Minuman{
	
	public Menu(int Ayam, int Kambing, int GuleKambing, int Teh, int Jeruk) {
		super(Ayam, Kambing, GuleKambing, Teh, Jeruk);
	}
	protected double menuSateAyam() {
		double hasil = super.hargaSateAyam() + super.hargaTeh();
		return hasil;
	}
	protected double menuSateAyam2() {
		double hasil = super.hargaSateAyam() + super.hargaJeruk();
		return hasil;
	}
	protected double menuSateKambing() {
		double hasil = super.hargaSateKambing() + super.hargaTeh();
		return hasil;
	}
	protected double menuSateKambing2() {
		double hasil = super.hargaSateKambing() + super.hargaJeruk();
		return hasil;
	}
	protected double menuSateGuleKambing() {
		double hasil = super.hargaSateGuleKambing() + super.hargaTeh();
		return hasil;
	}
	protected double menuSateGuleKambing2() {
		double hasil = super.hargaSateGuleKambing() + super.hargaJeruk();
		return hasil;
	}
}
