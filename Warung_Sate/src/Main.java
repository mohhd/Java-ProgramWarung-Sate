import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu(12000, 22000, 28000, 3000, 3000);
		menu.setNamaPemesan(JOptionPane.showInputDialog("Masukkan nama : "));
		int input = Integer.parseInt(JOptionPane.showInputDialog("Menu Makanan :"
				+ "\n1. Sate Ayam"
				+ "\n2. Sate Kambing"
				+ "\n3. Sate Gule Kambing"));
		switch(input) {
			case 1:
				menu.setOrang(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
				String output = "Nama pemesan : "+menu.getNamaPemesan()+""
						+ "\nPilihan Menu : Sate Ayam"
						+ "\nHarga : Rp."+ menu.sateAyam+""
						+ "\nBanyak pesanan : "+menu.getOrang()+""
								+ "\nTotal harga : Rp."+menu.menuSateAyam();
				String menu2 = JOptionPane.showInputDialog("Apakah anda ingin pesan Minuman? ya/tidak");
				if("ya".equals(menu2)) {
					int pilihminum = Integer.parseInt(JOptionPane.showInputDialog("Menu Minuman : "
							+ "\n1. Es Teh"
							+ "\n2. Es Jeruk",
							"Masukkan pilihan : "));
					
					switch(pilihminum) {
						case 1:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Nama pemesan : "+menu.getNamaPemesan()+""
									+ "\nMakanan"
									+ "\nPilihan Menu : Sate Ayam"
									+ "\nHarga : Rp."+ menu.sateAyam+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Teh"
									+ "\nHarga : Rp."+menu.hargaTeh()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateAyam();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
							
						case 2:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Nama pemesan : "+menu.getNamaPemesan()+""
									+ "\nMakanan"
									+ "\nPilihan Menu : Sate Ayam"
									+ "\nHarga : Rp."+ menu.sateAyam+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Jeruk"
									+ "\nHarga : Rp."+menu.hargaJeruk()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateAyam();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
					} 
				} else {
					JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
					System.exit(0);

				}
				
			case 2:
				menu.setOrang(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
				output = "Pilihan Menu : Sate Kambing"
						+ "\nHarga : Rp."+ menu.sateKambing+""
						+ "\nBanyak pesanan : "+menu.getOrang()+""
								+ "\nTotal harga : Rp."+menu.menuSateKambing();
				String menu3 = JOptionPane.showInputDialog("Apakah anda ingin pesan Minuman? ya/tidak");
				if("ya".equals(menu3)) {
					int pilihminum = Integer.parseInt(JOptionPane.showInputDialog("Menu Minuman : "
							+ "\n1. Es Teh"
							+ "\n2. Es Jeruk",
							"Masukkan pilihan : "));
					
					switch(pilihminum) {
						case 1:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Makanan"
									+ "\nPilihan Menu : Sate Kambing"
									+ "\nHarga : Rp."+ menu.sateKambing+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Teh"
									+ "\nHarga : Rp."+menu.hargaTeh()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateKambing();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
							
						case 2:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Makanan"
									+ "\nPilihan Menu : Sate Kambing"
									+ "\nHarga : Rp."+ menu.sateKambing+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Jeruk"
									+ "\nHarga : Rp."+menu.hargaJeruk()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateKambing();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
					} 
				} else {
					JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
					System.exit(0);

				}
				
			case 3:
				menu.setOrang(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
				output = "Pilihan Menu : Sate Gule Kambing"
						+ "\nHarga : Rp."+ menu.sateGuleKambing+""
						+ "\nBanyak pesanan : "+menu.getOrang()+""
								+ "\nTotal harga : Rp."+menu.menuSateGuleKambing();
				String menu4 = JOptionPane.showInputDialog("Apakah anda ingin pesan Minuman? ya/tidak");
				if("ya".equals(menu4)) {
					int pilihminum = Integer.parseInt(JOptionPane.showInputDialog("Menu Minuman : "
							+ "\n1. Es Teh"
							+ "\n2. Es Jeruk",
							"Masukkan pilihan : "));
					
					switch(pilihminum) {
						case 1:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Makanan"
									+ "\nPilihan Menu : Sate Gule Kambing"
									+ "\nHarga : Rp."+ menu.sateGuleKambing+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Teh"
									+ "\nHarga : Rp."+menu.hargaTeh()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateGuleKambing();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
							
						case 2:
							menu.setOrg(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pesanan : ")));
							output ="Makanan"
									+ "\nPilihan Menu : Sate Gule Kambing"
									+ "\nHarga : Rp."+ menu.sateGuleKambing+""
									+ "\nBanyak pesanan : "+menu.getOrang()+""
									+ "\n======================================"
									+ "\nMinuman"
									+ "\nPilihan Menu : Es Jeruk"
									+ "\nHarga : Rp."+menu.hargaJeruk()+""
									+ "\nBanyak pesanan : "+menu.getOrg()+""
									+ "\nTotal harga : Rp."+menu.menuSateGuleKambing();
							JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
							System.exit(0);
					} 
				} else {
					JOptionPane.showMessageDialog(null, "Daftar Pesanan : \n"+output, "Hasil", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Terima kasih \nPesanan sedang diproses");
					System.exit(0);

				}
				
		}

	}

}
