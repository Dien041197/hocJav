package buoi2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float a=0,b=0,c=0;
        float x=0,y=0;
        float delta = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập hệ số bậc 2, a = ");
        a = sc.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        b = sc.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }

        delta = b*b - 4*a*c;

        if (delta > 0) {
            x = (float) ((-b + Math.sqrt(delta)) / (2*a));
            y = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x + " và x2 = " + y);
        } else if (delta == 0) {
            x = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }
}
