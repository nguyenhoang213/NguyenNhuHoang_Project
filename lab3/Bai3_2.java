import java.util.Scanner;

class Diem
{
    protected int x,y;
    
    public Scanner scanner = new Scanner(System.in);
    public Diem() 
    {

    }
    public Diem(int a, int b)
    {
        x = a;
        y = b;
    }
    public void NhapDiem()
    {
        System.out.print("x:");
        x = scanner.nextInt();
        System.out.print("y:");
        y = scanner.nextInt();
    }
    public void InDiem()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}

class TamGiac
{
    private Diem A = new Diem();
    private Diem B = new Diem();
    private Diem C = new Diem();
    
    public void NhapTG()
    {
        A.NhapDiem();
        B.NhapDiem();
        C.NhapDiem();
    }
    public void InTG()
    {
        System.out.print("A:");
        A.InDiem();
        System.out.print("B:");
        B.InDiem();
        System.out.print("C:");
        C.InDiem();
    }
    public double DoDai(Diem X, Diem Y)
    {
        return Math.sqrt(Math.pow((X.x - Y.x), 2) + Math.pow((X.y - Y.y), 2));
    }
    public int KiemTra()
    {
        if(DoDai(A, B) + DoDai(B, C) > DoDai(C, A) && DoDai(B, C) + DoDai(C, A) > DoDai(A, B) && DoDai(C, A) + DoDai(A, B) > DoDai(B, C)) return 1;
        else return 0;
    }
    public double ChuVi()
    {
        return (DoDai(A, B) + DoDai(B, C) + DoDai(C, A));
    }
    public double DienTich()
    {
        double p = (DoDai(A, B) + DoDai(B, C) + DoDai(C, A))/2;
        return Math.sqrt(p*(p-DoDai(A, B))*(p-DoDai(B, C))*(p-DoDai(C, A)));
    }
}

class DuongTron extends Diem
{
    private int r;
    
    public void NhapDT()
    {
        System.out.println("Nhap Tam:");
        NhapDiem();
        System.out.println("Nhap Ban Kinh:");
        r = scanner.nextInt();
    }
    public void InDuongTron()
    {
        System.out.println("Tam duong tron la ");
        InDiem();
        System.out.println("Ban kinh duong tron la " + r);
    }

    public double ChuVi()
    {
        return 3.14 * 2 * r;
    }
    public double DienTich()
    {
        return 3.14 * r * r;
    }
}

public class Bai3_2 {
    public static void main(String[] args) {
        DuongTron O = new DuongTron();
        O.NhapDT();
        O.InDuongTron();
        System.out.println(O.ChuVi());
        System.out.println(O.DienTich());
    }
}
