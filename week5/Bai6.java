import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, gt = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen duong: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println("Giai thua cua so da nhap la " + gt);
    }
}
