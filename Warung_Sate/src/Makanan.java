import javax.swing.JOptionPane;

public class Makanan {
	private String namaPemesan;
	public int orang,
			   sateAyam,
			   sateKambing,
			   sateGuleKambing;
	
	public Makanan(int Ayam, int Kambing, int GuleKambing) {
		sateAyam = Ayam;
		sateKambing = Kambing;
		sateGuleKambing = GuleKambing;
	}
	
	protected void setNamaPemesan(String nm) {
		try {
			if("".equals(nm)) {
				JOptionPane.showMessageDialog(null, "Nama Pemesan belum di isi");
				System.exit(0);
			}
		}catch(NumberFormatException e) {
			JOptionPane.showConfirmDialog(null, "Format salah");
		}
	}
	protected String getNamaPemesan() {
		return namaPemesan;
	}
	protected void setOrang(int org) {
		orang = org;
	}
	protected int getOrang() {
		return orang;
	}
	protected int hargaSateAyam() {
		int jumlah = sateAyam * orang;
		return jumlah;
	}
	protected int hargaSateKambing() {
		int jumlah = sateKambing * orang;
		return jumlah;
	}
	protected int hargaSateGuleKambing() {
		int jumlah = sateGuleKambing * orang;
		return jumlah;
	}
}
