import java.util.Scanner; 
public class Bai1 {

	public class SanPham {
	    // Thuộc tính
	    private String tenSp;
	    private double donGia;
	    private double giamGia;

	    // Constructor
	    public SanPham(String tenSp, double donGia, double giamGia) {
	        this.tenSp = tenSp;
	        this.donGia = donGia;
	        this.giamGia = giamGia;
	    }

	    // Phương thức tính thuế nhập khẩu
	    public double getThueNhapKhau() {
	        return 0.1 * this.donGia; // 10% giá sản phẩm
	    }

	    // Phương thức xuất thông tin ra màn hình
	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + this.tenSp);
	        System.out.println("Đơn giá: " + this.donGia);
	        System.out.println("Giảm giá: " + this.giamGia);
	        System.out.println("Thuế nhập khẩu: " + this.getThueNhapKhau());
	    }

	    // Phương thức nhập thông tin sản phẩm (nếu cần)
	    public void nhap() {	    	
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("Nhập tên sản phẩm: ");
	            this.tenSp = scanner.nextLine();

	            System.out.println("Nhập đơn giá: ");
	            this.donGia = scanner.nextDouble();

	            System.out.println("Nhập giảm giá: ");
	            this.giamGia = scanner.nextDouble();
	        
	    }
	 // Getter và Setter 
	    public String getTenSp() {
	        return tenSp;
	    }

	    public void setTenSp(String tenSp) {
	        this.tenSp = tenSp;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }

	    public double getGiamGia() {
	        return giamGia;
	    }

	    public void setGiamGia(double giamGia) {
	        this.giamGia = giamGia;
	    }
	}

}

	


