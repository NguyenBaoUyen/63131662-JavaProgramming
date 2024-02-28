import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;
	public LoginFrame() {
		setTitle("Đăng Nhặp Facebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 54, 129, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(32, 108, 129, 29);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(171, 54, 204, 29);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(171, 108, 204, 29);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(96, 178, 109, 39);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		//Lấy về tên DN và mật khẩu
				String Str_ten = txtTenDangNhap.getText();
				String Str_mk = txtMatKhau.getText();
				//Xử lý
				if(Str_ten.equals("63CNTT") && Str_mk.equals("123")) {
					//hiện tran chủ
					HomeFrame homePage = new HomeFrame();
					homePage.setVisible(true);
					//Ẩn form đăng nhập
					this.setVisible(false);
				}
				else {
					//Xóa dữ liệu nhập
					txtTenDangNhap.setText("");
					txtMatKhau.setText("");
					//báo lỗi
					JOptionPane hopThoai = new JOptionPane();
					hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
				}
	}
}
