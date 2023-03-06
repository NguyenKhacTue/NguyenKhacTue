
package bai3;
import java.util.Scanner;
public class bai3 {
public static void main(String[] args) {
	String ten;
	int namsinh, namnay=2023;
	Scanner sc = new Scanner (System.in);
	System.out.println("nhap ho va ten cua nguoi do:");
	ten = sc.nextLine();
	System.out.println("nhap nam sinh cua nguoi do:");
	namsinh = sc.nextInt();
	if ((namnay - namsinh) < 16)
	System.out.println("ban " + ten +" o do tuoi vi thanh nien");
	else if ( (namnay - namsinh)>=16 || (namnay - namsinh)< 18)
		System.out.println ("ban " + ten + " o do tuoi truong thanh");
	if((namnay - namsinh)>=18)
		System.out.println("ban " + ten +" da gia");

}
}
