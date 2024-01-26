import java.util.Scanner;
public class Lab2_Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int giaDuoi50 = 1000;
        int giaTren50 = 1200;

        int tien;

        if (soDien <= 50) {
            tien = soDien * giaDuoi50;
        } else {
            tien = 50 * giaDuoi50 + (soDien - 50) * giaTren50;
        }

        System.out.println("Số tiền điện là: " + tien + " VND");

        scanner.close();
	}

}
