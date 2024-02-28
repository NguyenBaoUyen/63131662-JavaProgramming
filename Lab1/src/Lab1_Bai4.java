
import java.util.Scanner;
public class Lab1_Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Nhập các hệ số 
	        System.out.print("Nhập hệ số a : ");
	        double a = scanner.nextDouble();

	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        // Tính delta
	        double delta = Math.pow(b,2) - 4 * a * c;

	        // Kiểm tra giá trị delta để tính căn delta
	        if (delta >= 0) {
	            double canDelta = Math.sqrt(delta);
	            System.out.println("Căn delta là: " + canDelta);
	        } else {
	            System.out.println("Không thể tính căn delta vì delta < 0.");
	        }
	        scanner.close();
	}

}
