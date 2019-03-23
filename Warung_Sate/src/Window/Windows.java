package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Windows {
	
	JFrame layar = new JFrame("Menu Makanan");
	JLabel label = new JLabel("Warung Sate pak Hasan");
	JLabel label2 = new JLabel("Menu Makanan");
	JLabel label3 = new JLabel("Jumlah");
	JLabel label4 = new JLabel("Harga(per porsi)");
	JLabel label5 = new JLabel("Rp.13000,-");
	JLabel label6 = new JLabel("Rp.22000,-");
	JLabel label7 = new JLabel("Rp.28000,-");
	JLabel label8 = new JLabel("-Proses-");
	JLabel label9 = new JLabel("Total Bayar : Rp.");
	JLabel label10 = new JLabel("Total Harga");
	JLabel label11 = new JLabel("Masukkan Uang anda : Rp.");
	JLabel lblTHrgSateAyam = new JLabel("Rp.0,-");
	JLabel lblTHrgSateKambing = new JLabel("Rp.0,-");
	JLabel lblTHrgSateGuleKambing = new JLabel("Rp.0,-");
	JLabel lblTJlh = new JLabel("0 Porsi");
	JLabel lblTBayar = new JLabel("Rp.0,-");
	JCheckBox cboxSateAyam = new JCheckBox("Sate Ayam");
	JCheckBox cboxSateKambing= new JCheckBox("Sate Kambing");
	JCheckBox cboxSateGuleKambing = new JCheckBox("Sate Gule Kambing");
	JTextField txtJlhSateAyam = new JTextField();
	JTextField txtJlhSateKambing = new JTextField();
	JTextField txtJlhSateGuleKambing = new JTextField();
	JTextField txtJlhUang = new JTextField();
	JButton btnHitung = new JButton("Hitung");
	JButton btnReset = new JButton("Reset");
	JButton btnKeluar = new JButton("Keluar");
	JButton btnOrder = new JButton("Order");
	
	Menu menu = new Menu();
	
	public Windows() {
		layar.setSize(650, 400);
		layar.setLayout(null);
		layar.setLocationRelativeTo(null);
		layar.setResizable(false);
		layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layar.setVisible(true);
		layar.setBackground(Color.DARK_GRAY);
		//judul
		label.setFont(new Font("serif",Font.BOLD, 16));
		label.setForeground(Color.BLUE);
//		label.setVerticalAlignment(JLabel.TOP);
//		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(140, -50, 200, 150);
		//menu
		label2.setForeground(Color.RED);
		label2.setBounds(20, 60, 100, 20);
		label3.setBounds(330, 60, 100, 20);
		cboxSateAyam.setBounds(20, 90, 150, 20);
		cboxSateKambing.setBounds(20, 110, 150, 20);
		cboxSateGuleKambing.setBounds(20, 130, 150, 20);
		txtJlhSateAyam.setBounds(330, 90, 40, 20);
		txtJlhSateKambing.setBounds(330, 110, 40, 20);
		txtJlhSateGuleKambing.setBounds(330, 130, 40, 20);
		txtJlhUang.setBounds(160, 300, 150, 30);
		label4.setBounds(170, 60, 100, 20);
		label5.setBounds(180, 90, 100, 20);
		label6.setBounds(180, 110, 100, 20);
		label7.setBounds(180, 130, 100, 20);
		label8.setBounds(100, 190, 100, 20);
		label9.setBounds(20, 270, 100, 20);
		label10.setBounds(430, 60, 100, 20);
		label11.setBounds(20, 300, 140, 20);
		lblTHrgSateAyam.setBounds(430, 90, 100, 20);
		lblTHrgSateKambing.setBounds(430, 110, 100, 20);
		lblTHrgSateGuleKambing.setBounds(430, 130, 100, 20);
		lblTJlh.setBounds(330, 270, 100, 20);
		lblTBayar.setBounds(430, 270, 100, 20);
		//button
		btnHitung.setBounds(100, 215, 80, 25);
		btnReset.setBounds(190, 215, 80, 25);
		btnKeluar.setBounds(280, 215, 80, 25);
		btnOrder.setBounds(330, 300, 80, 25);
		
		layar.add(label);
		layar.add(label2);
		layar.add(label3);
		layar.add(label4);
		layar.add(label5);
		layar.add(label6);
		layar.add(label7);
		layar.add(label8);
		layar.add(label9);
		layar.add(label10);
		layar.add(label11);
		layar.add(lblTHrgSateAyam);
		layar.add(lblTHrgSateKambing);
		layar.add(lblTHrgSateGuleKambing);
		layar.add(lblTJlh);
		layar.add(lblTBayar);
		layar.add(cboxSateAyam);
		layar.add(cboxSateKambing);
		layar.add(cboxSateGuleKambing);
		layar.add(txtJlhSateAyam);
		layar.add(txtJlhSateKambing);
		layar.add(txtJlhSateGuleKambing);
		layar.add(txtJlhUang);
		layar.add(btnHitung);
		layar.add(btnReset);
		layar.add(btnKeluar);
		layar.add(btnOrder);
		

		
		cboxSateAyam.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if (cboxSateAyam.isSelected()== true) {
					txtJlhSateAyam.setEditable(true);
					txtJlhSateAyam.requestFocus();
				}else {
					txtJlhSateAyam.setEditable(false);
					txtJlhSateAyam.setText("");
					lblTHrgSateAyam.setText("Rp.0,-");
				}
				
			}
			
		});
		
		cboxSateKambing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if (cboxSateKambing.isSelected()== true) {
					txtJlhSateKambing.setEditable(true);
					txtJlhSateKambing.requestFocus();
				}else {
					txtJlhSateKambing.setEditable(false);
					txtJlhSateKambing.setText("");
					lblTHrgSateKambing.setText("Rp.0,-");
				}
				
			}
			
		});
		
		cboxSateGuleKambing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if (cboxSateGuleKambing.isSelected()== true) {
					txtJlhSateGuleKambing.setEditable(true);
					txtJlhSateGuleKambing.requestFocus();
				}else {
					txtJlhSateGuleKambing.setEditable(false);
					txtJlhSateGuleKambing.setText("");
					lblTHrgSateGuleKambing.setText("Rp.0,-");
				}
				
			}
			
		});		
		
		btnHitung.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				txtJlhUang.requestFocus();
				 int JlhSateAyam = 0,
					 JlhSateKambing  = 0,
					 JlhSateGuleKambing  = 0,
					 HrgSateAyam = 0,
					 HrgSateKambing = 0,
					 HrgSateGuleKambing = 0,
					 THrgSateAyam = 0,
					 THrgSateKambing = 0,
					 THrgSateGuleKambing = 0,
					TJlh, TBayar;

				 if (cboxSateAyam.isSelected() == false && cboxSateKambing.isSelected()==false && cboxSateGuleKambing.isSelected()==false){
				       JOptionPane.showMessageDialog(null, "Makanan Belum Dipesan","Warning",JOptionPane.WARNING_MESSAGE);
				 }
				   else {
				       if (cboxSateAyam.isSelected()==true){
				          if (txtJlhSateAyam.getText().length()==0){
				              pesan_kosong();
				              txtJlhSateAyam.requestFocus();
				          }
				          else if (txtJlhSateAyam.getText().matches("[1-9]")){
				              JlhSateAyam    = Integer.parseInt(txtJlhSateAyam.getText());
				              HrgSateAyam    = 12000;
				              THrgSateAyam = JlhSateAyam * HrgSateAyam;
				              lblTHrgSateAyam.setText("Rp. "+THrgSateAyam+",-");
				          }
				          else {
				              pesan_karakter();
				              txtJlhSateAyam.requestFocus();
				          }
				       } 
				       if (cboxSateKambing.isSelected()==true){
					          if (txtJlhSateKambing.getText().length()==0){
					              pesan_kosong();
					              txtJlhSateKambing.requestFocus();
					          }
					          else if (txtJlhSateKambing.getText().matches("[1-9]")){
					              JlhSateKambing    = Integer.parseInt(txtJlhSateKambing.getText());
					              HrgSateKambing    = 22000;
					              THrgSateKambing = JlhSateKambing * HrgSateKambing;
					              lblTHrgSateKambing.setText("Rp. "+THrgSateKambing+",-");
					          }
					          else {
					              pesan_karakter();
					              txtJlhSateKambing.requestFocus();
					          }
					       } 
				       if (cboxSateGuleKambing.isSelected()==true){
					          if (txtJlhSateGuleKambing.getText().length()==0){
					              pesan_kosong();
					              txtJlhSateGuleKambing.requestFocus();
					          }
					          else if (txtJlhSateGuleKambing.getText().matches("[1-9]")){
					              JlhSateGuleKambing    = Integer.parseInt(txtJlhSateGuleKambing.getText());
					              HrgSateGuleKambing    = 28000;
					              THrgSateGuleKambing = JlhSateGuleKambing * HrgSateGuleKambing;
					              lblTHrgSateGuleKambing.setText("Rp. "+THrgSateGuleKambing+",-");
					          }
					          else {
					              pesan_karakter();
					              txtJlhSateGuleKambing.requestFocus();
					          }
					       } 
				       TJlh   = JlhSateAyam + JlhSateKambing + JlhSateGuleKambing;
				       TBayar = THrgSateAyam + THrgSateKambing + THrgSateGuleKambing;
				       lblTJlh.setText(""+TJlh+" porsi");
				       lblTBayar.setText("Rp. "+TBayar+",-");
			}
			
			}});
		
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				     txtJlhSateAyam.setEditable(false);
				     txtJlhSateKambing.setEditable(false);
				     txtJlhSateGuleKambing.setEditable(false);
				     cboxSateAyam.setSelected(false);
				     cboxSateKambing.setSelected(false);
				     cboxSateGuleKambing.setSelected(false);
				     txtJlhSateAyam.setText("");
				     txtJlhSateKambing.setText("");
				     txtJlhSateGuleKambing.setText("");
				     lblTJlh.setText("0 porsi");
				     lblTHrgSateAyam.setText("Rp. 0,-");
				     lblTHrgSateKambing.setText("Rp. 0,-");
				     lblTHrgSateGuleKambing.setText("Rp. 0,-");
				     lblTBayar.setText("Rp. 0,-");
			}
			
		});
		
		btnKeluar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);

			}
			
		});
		
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {     
					
		        // TODO add your handling code here:
		         JOptionPane.showMessageDialog(null, "Terima kasih Atas Pesanan Anda. ");
		         JOptionPane.showMessageDialog(null, "Pesanan Anda Akan Kami Proses. ");
		         System.exit(0);
		    }

		});
		
	}
	private static void pesan_kosong(){
		   JOptionPane.showMessageDialog(null, "Jumlah Pesanan Belum Dimasukkan","Warning", JOptionPane.WARNING_MESSAGE);
	}
	private static void pesan_karakter(){
		   JOptionPane.showMessageDialog(null, "Format Jumlah Makanan Harus Angka","Warning", JOptionPane.WARNING_MESSAGE);
	}

}
