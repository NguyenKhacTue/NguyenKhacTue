
package bai1;
import java.util.Scanner;
public class bai1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		float a,b;

		System.out.println(" nhap vao so a la:");
		a=sc.nextFloat();
		System.out.println("nhap vao so b la:");
		b=sc.nextFloat();
		System.out.println("tong cua hai so la:"+(a+b));
		System.out.println("hieu của hai so la:"+(a-b));
		System.out.println("tich cua hai so la:"+(a*b));
		System.out.println("thuong cua hai so la:"+(a/b));
		System.out.println("chia lay phan du cua hai so la:"+(a%b));
		if (a>b)
		System.out.println("so lon la:"+a);
		else
			System.out.println("so lon la:"+b);
}
}