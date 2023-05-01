import java.util.Scanner;

class NgayThang
{
    private int ngay,thang,nam;
    
    public Scanner scanner = new Scanner(System.in);
    
    public void nhap()
    {
        System.out.print("Nhap ngay:");
        ngay = scanner.nextInt();
        System.out.print("Nhap thang:");
        thang = scanner.nextInt();
        System.out.print("Nhap nam:");
        nam = scanner.nextInt();
    }
    public String toString()
    {
        return ngay + " - " + thang + " - " + nam;
    }
}

class HangHoa
{
    private String maHang, tenHang, nhaSanXuat;
    private long gia;
    
    public Scanner scanner = new Scanner(System.in);
    public void nhap()
    {
        System.out.print("Nhap Ma Hang: ");
        maHang = scanner.nextLine();
        System.out.print("Nhap Ten Hang: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap Nha San Xuat: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhap Gia: ");
        gia = scanner.nextLong();
    }

    public String toString()
    {
        return "Ma Hang: " + maHang + "\nTen Hang: " + tenHang + "\nNha San Xuat: " + nhaSanXuat + "\nGia: " + gia ;
    }
}

class HangThucPham extends HangHoa
{
    private NgayThang NgaySanXuat = new NgayThang(), NgayHetHan = new NgayThang();
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap Ngay San Xuat: ");
        NgaySanXuat.nhap();
        System.out.println("Nhap Ngay Het Han: ");
        NgayHetHan.nhap();
    }
    public String toString()
    {
        return super.toString() + "\nNgay San Xuat: " + NgaySanXuat.toString() + "\nNgay Het Han: " + NgayHetHan.toString();
    }
}

class HangSanhSu extends HangHoa
{
    private String LoaiNguyenLieu;
    public Scanner scanner = new Scanner(System.in);
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhap Loai Nguyen Lieu: ");
        LoaiNguyenLieu = scanner.nextLine();
    }
    public String toString()
    {
        return super.toString() + "\nLoai Nguyen Lieu: " + LoaiNguyenLieu;
    }
}  

class HangDienMay extends HangHoa
{
    private String thoiGianBaoHanh;
    private double dienAp,congSuat;
    
    public Scanner scanner = new Scanner(System.in);
    
    public void nhap() 
    {
        super.nhap();
        System.out.print("Nhap thoi Gian Bao Hanh: ");
        thoiGianBaoHanh = scanner.nextLine();
        System.out.print("Nhap Dien Ap: ");
        dienAp = scanner.nextDouble();
        System.out.print("Nhap Cong Suat: ");
        congSuat = scanner.nextDouble();
    }
    public String toString()
    {
        return super.toString() + "\nThoi Gian Bao Hanh: " + thoiGianBaoHanh + "\nDien Ap: " + dienAp + "\nCong Suat: " + congSuat;
    }
}


public class Bai3_3
{
    static Scanner scanner = new Scanner(System.in);

    static void NhapHang(HangHoa Arr[], int n)
    {
        for(int i = 0; i < n; i++) 
        {   
            int sl;
            System.out.print("Nhap Loai Hang Hoa: \n1. Hang Thuc Pham\n2. Hang Sanh Su\n3. Hang Dien May\n");
            do {
                System.out.print("Lua chon: ");
                sl = scanner.nextInt();
            } while (n < 1 || n > 3);
            switch (sl){
                case 1:
                    Arr[i] = new HangThucPham();
                    Arr[i].nhap();
                    break;
                case 2:
                    Arr[i] = new HangSanhSu();
                    Arr[i].nhap();
                    break;
                case 3:
                    Arr[i] = new HangDienMay();
                    Arr[i].nhap();
                    break;
            }
        }
    }

    static void InDSHang(HangHoa Arr[], int n)
    {
        for(int i = 0; i < n; i++) 
        {
            
            System.out.println("Hang hoa so " + (i+1) + ":\n" + Arr[i].toString());
        }
    }

    public static void main(String[] args) 
    {
        System.out.print("Nhap so luong hang hoa: ");
        int n = scanner.nextInt();
        HangHoa dshh[] = new HangHoa[n];
        NhapHang(dshh,n);
        InDSHang(dshh,n);
    }
}
