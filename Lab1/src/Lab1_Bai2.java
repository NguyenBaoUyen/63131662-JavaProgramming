/**
 * 
 */

/**
 * 
 */
import java.util.Scanner; 
public class Lab1_Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();
        System.out.println("Chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();
        //Tính chu vi, diên tích, cạnh nhỏ nhất
        double chuvi = (dai + rong) * 2;
        double dientich = dai * rong;
        double canhnhonhat = Math.min(dai, rong);
       
        System.out.println("Chu vi của hình chữ nhật là: " + chuvi);
        System.out.println("Diện tích hình chữ nhật là: " + dientich);
        System.out.println("Cạnh nhỏ nhất là: " + canhnhonhat);
        scanner.close();
	}

}
