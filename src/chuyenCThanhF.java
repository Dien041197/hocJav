import java.util.Scanner;

public class chuyenCThanhF {
    public static void main(String[] args) {
        double c,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap C: ");
        c=sc.nextDouble();
        f=(c/5)*9+32;
        System.out.print("F: "+f);

    }
}
