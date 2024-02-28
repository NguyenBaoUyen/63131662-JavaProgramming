import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKQ;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhuongTrinhBac2 frame = new PhuongTrinhBac2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PhuongTrinhBac2() {
		setTitle("Giải Phương Trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(21, 28, 95, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập b");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 76, 95, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập c");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(21, 128, 95, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tính toán");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyPTB2();
			}
		});
		btnNewButton.setBounds(142, 167, 149, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("KẾT QUẢ");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(13, 210, 85, 38);
		contentPane.add(lblNewLabel_2_1);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(108, 214, 235, 38);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(108, 25, 212, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(108, 73, 212, 31);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(108, 125, 212, 31);
		contentPane.add(txtC);
	}
	void XuLyPTB2() {
		//Lấy dữ liệu
		String Str_SoA = txtA.getText();
		String Str_SoB = txtB.getText();
		String Str_SoC = txtC.getText();
		//Chuyển kiểu
		double SoA = Double.parseDouble(Str_SoA);
		double SoB = Double.parseDouble(Str_SoB);
		double SoC = Double.parseDouble(Str_SoC);
		//Tính toán
		if(SoA==0) {//bx + c = 0 => GiaiPTB1
			if(SoB==0)
				txtKQ.setText("PT vô số nghiệm");
			else {
				double KQ = (-SoC)/SoB;
				txtKQ.setText(String.valueOf(KQ));
			}
		}
		else {
			double Delta = SoB*SoB - 4*SoA*SoC;
			if(Delta<0)
				txtKQ.setText("PT vô nghiệm");
			if(Delta==0) {
				double KQ = (-SoB)/(2*SoA);
				txtKQ.setText("x1 = x2 = " + String.valueOf(KQ));
			}
			else {
				double KQ1 = (double) ((-SoB)+Math.sqrt(Delta))/(2*SoA);
				double KQ2 = (double) ((-SoB)-Math.sqrt(Delta))/(2*SoA);
				txtKQ.setText("x1 = "+String.valueOf(KQ1) + "\tx2 = " + String.valueOf(KQ2));
			}

		}
	}
}
