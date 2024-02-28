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
	private JButton btnCong;
	private JButton btnTru;
	private JButton btnNhan;
	private JButton btnChia;
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
		
		btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				//Viết lệnh ở một thủ tục/hàm rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCong.setBounds(26, 164, 89, 23);
		contentPane.add(btnCong);
		
		btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				//Viết lệnh ở một thủ tục/hàm rồi gọi ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTru.setBounds(131, 164, 89, 23);
		contentPane.add(btnTru);
		
		btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				//Viết lệnh ở một thủ tục/hàm rồi gọi ở đây
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNhan.setBounds(238, 164, 89, 23);
		contentPane.add(btnNhan);
		
		btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý cộng
				//Viết lệnh ở một thủ tục/hàm rồi gọi ở đây
				HamXuLyChia();
			}
			
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChia.setBounds(347, 164, 89, 23);
		contentPane.add(btnChia);
		
		
	
		
				
		
	}//het ham tao
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Tong = SoA + SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Hieu = SoA - SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Hieu));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Tich = SoA * SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Tich));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		//Chuyển kiều
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		//Tính toán
		double Thuong = SoA / SoB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(Thuong));
	}
	
}
