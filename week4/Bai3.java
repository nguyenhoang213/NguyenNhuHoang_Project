import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap Ten:");
        name = input.nextLine();
        System.out.println("Nhap Tuoi:");
        age = input.nextInt();
        if(age < 16) System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        else if(age < 18) System.out.println("Ban " + name + " o do tuoi truong thanh");
        else System.out.println("Ban " + name + " da gia");
    }
}