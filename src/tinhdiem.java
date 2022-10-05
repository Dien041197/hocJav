import java.util.Scanner;

public class tinhdiem {
    public static void main(String[] args) {
        double toan,ly,hoa;
        double s,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap diem toan: ");
        toan=sc.nextDouble();
        System.out.print("nhap diem ly: ");
        ly=sc.nextDouble();
        System.out.print("nhap diem hoa: ");
        hoa=sc.nextDouble();
        s = toan+ly+hoa;
        c = s/3;
        System.out.print("tong: "+ s);
        System.out.print("trung binh: "+c);
    }
}
