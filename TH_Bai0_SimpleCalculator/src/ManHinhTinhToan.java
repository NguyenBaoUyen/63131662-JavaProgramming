import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình Tính Toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(26, 44, 166, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai(b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(26, 103, 166, 25);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(183, 95, 228, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(183, 33, 228, 33);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu ly
				HamXuLyCong();
			}

			private void HamXuLyCong() {
				// TODO Auto-generated method stub
				
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(26, 171, 89, 23);
		contentPane.add(btnCong);
		
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly tru
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(125, 169, 89, 23);
		contentPane.add(btnTru);
				
		JButton btnNhan = new JButton("Nhân");
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(224, 169, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(323, 169, 89, 23);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả tính toán:");
		lblKtQu.setEnabled(false);
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(26, 216, 166, 25);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(183, 212, 228, 33);
		contentPane.add(txtKetQua);
		
		
	
		
				
		
	}//het ham tao
	void HamXyLyCong() {
		//Lấy du lieu tu dieu kien
		String str_soA=txtA.getText();
		String str_soB=txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toan
		double tong= soA+soB;
		//Dua ra hien thi len dieu khien
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lấy du lieu tu dieu kien
				String str_soA=txtA.getText();
				String str_soB=txtB.getText();
				double soA = Double.parseDouble(str_soA);
				double soB = Double.parseDouble(str_soB);
				//Tinh toan
				double tong= soA-soB;
				//Dua ra hien thi len dieu khien
				txtKetQua.setText(String.valueOf(tong));
		
	}
}
