package Bai3_1;
import java.util.Scanner;
public class Sach {
	
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private int soTrang;
    private String loaiSach;
    private String nhaXuatBan;
    private int soTap;
    private double gia;
    
    public void nhapSach() {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhap loai sach: ");
        loaiSach = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap so tap: ");
        soTap = sc.nextInt();
        System.out.print("Nhap gia: ");
        gia = sc.nextDouble();
    }

    public void inSach() {
        System.out.println("Thong tin sach:");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("So trang: " + soTrang);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("So tap: " + soTap);
        System.out.println("Gia: " + gia);
    }
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        Sach sach = new Sach();
        sach.nhapSach();
        sach.inSach();
        int n;
        n = sc.nextInt();
        Sach[] sachArray = new Sach[n];
        for (int i = 0; i < sachArray.length; i++) {     
            sachArray[i].inSach();
        }
    }
}
