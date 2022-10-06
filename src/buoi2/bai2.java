package buoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double a=0,b=0,c=0;
        double tb=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("diem toan:");
        a=sc.nextDouble();
        System.out.print("diem ly:");
        b=sc.nextDouble();
        System.out.print("diem hoa:");
        c=sc.nextDouble();
        tb=(a+b+c)/3;
        if (tb<5){
            System.out.print("yeu");
        }else if (tb<6.5){
            System.out.print("Trung binh");
        }else  if (tb<8){
            System.out.print("kha");
        }else if (tb<10){
            System.out.print("gioi");
        } else if (tb==10){
            System.out.print("xuat sac");
        }

    }
}
