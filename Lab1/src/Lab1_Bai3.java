/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1_Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//the thich khoi lap phuong
		System.out.println("Cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double Vlapphuong = Math.pow(canh,3);
		System.out.println("Thể tích lập phương: " + Vlapphuong );
		
		//the tich khoi chu nhat
		System.out.println("Chiều dài khối lập phương: ");
		double dai = scanner.nextDouble();
		System.out.println("Chiều rộng khối lập phương: ");
		double rong = scanner.nextDouble();
		System.out.println("Chiều cao khối lập phương: ");
		double cao = scanner.nextDouble();
		double Vchunhat = dai * rong * cao;
		System.out.println("Thể tích khối chữ nhật: "+ Vchunhat);		
		scanner.close();
	}

}
