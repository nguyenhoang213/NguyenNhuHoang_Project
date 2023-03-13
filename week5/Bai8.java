import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n,S = 0;
        int[] a = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap a[" + (i+1) + "]");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            S += a[i];
        }
        System.out.println("Trung binh cong la: " +(float)S/n);
    }
}