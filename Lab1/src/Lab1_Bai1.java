/**
 * 
 */

/**
 * 
 */
import java.util.Scanner; 
public class Lab1_Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Điểm trung bình: ");
        double diemTB = scanner.nextDouble();
        //xuất tên và điểm sinh viên
        System.out.printf("%s %.2f điểm", hoTen, diemTB); 
        scanner.close();
	}
}
