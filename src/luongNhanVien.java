import java.util.Scanner;

public class luongNhanVien {
    public static void main(String[] args) {
        int pack,distance,shift,feedback,call,electric,other;
        double salary;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so goi hang duoc gui: ");
        pack=sc.nextInt();
        System.out.print("nhap Khoan cach gui: ");
        distance=sc.nextInt();
        System.out.print("nhap so ngay lam viec: ");
        shift=sc.nextInt();
        System.out.print("nhap so luong y kien to duoc phan hoi tu khach hang: ");
        feedback=sc.nextInt();
        System.out.print("Nhap so luong cuoc goi da tiep nhan tu khach hang: ");
        call=sc.nextInt();
        System.out.print("Nhap so tien thanh toan truc tuyen cho nhan vien: ");
        electric=sc.nextInt();
        System.out.print("nhap so tien thanh toan them: ");
        other=sc.nextInt();
        salary=pack*50+distance*75+shift*50*0.1+feedback+call+electric+other;
        System.out.print("luong nhan vien : "+ salary);
    }
}
