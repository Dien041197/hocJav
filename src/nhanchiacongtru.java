import java.util.Scanner;

public class nhanchiacongtru {
    public static void main(String[] args) {
        double x,y;
        double nhan,chia, cong,tru;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen x: ");
        x=sc.nextDouble();
        System.out.print("Nhap so nguyen y: ");
        y= sc.nextDouble();
        nhan=x*y;
        chia=x/y;
        cong=x+y;
        tru=x-y;
        System.out.print(" cong: "+cong);
        System.out.print(" tru: "+tru);
        System.out.print(" nhan: "+nhan);
        System.out.print(" chia: "+chia);
    }
}
