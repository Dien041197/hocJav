package buoi2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int h,m,s;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap gio: ");
        h=sc.nextInt();
        System.out.print("Nhap phut: ");
        m=sc.nextInt();
        System.out.print("Nhap giay: ");
        s=sc.nextInt();
        if(h>=0&&h<24||m>=0&&m<60||s>=60&&s<60){
            System.out.print(h+":"+m+":"+s );
            System.out.println("\n");
            System.out.print(h+":"+m+":"+(s-1) );
            System.out.println("\n");
            System.out.print(h+":"+m+":"+(s+1) );
        }
    }
}
