
package bai5;
import java.util.Scanner;
public class bai5 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int a,i,sum=0;
	System.out.println("nhap vao so phan tu cua mang:");
	a = sc.nextInt();
	int A[]= new int[a];
	System.out.println("nhap vao cac phan tu cho mang:");
	for (i=0; i<a;i++) 
		{
		System.out.println("nhap phan tu thu"+i+":");
		A[i]= sc.nextInt();
		 sum+= A[i];
		 if (sum >100)
			 break;
		}
	System.out.println("tong cac phan tu la:"+sum);

	}
}
