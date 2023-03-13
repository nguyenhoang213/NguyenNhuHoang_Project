import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n,S = 0;
        Scanner input = new Scanner(System.in);
        while(S <= 100) {
            System.out.println("Nhap 1 so nguyen:");
            n = input.nextInt();
            S += n;
        }
        System.out.println("Tong cac so da nhap la " + S);
    }
}