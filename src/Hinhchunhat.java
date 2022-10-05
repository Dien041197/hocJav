import java.util.Scanner;

public class Hinhchunhat {
    public static void main(String[] args) {
        double dai, rong;
        double s, c;
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        dai=sc.nextDouble();
        System.out.print("nhap chieu rộng: ");
        rong=sc.nextDouble();
        s=dai*rong;
        c=(dai+rong)*2;
        System.out.print(" dien tich :"+s);
        System.out.print(", chu vi"+c);

    }
}
