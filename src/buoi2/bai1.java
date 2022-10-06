package buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a=0,b=0;

        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap so thu 1: ");
        a=sc.nextInt();

        System.out.print("Nhap so thu 2: ");
        b=sc.nextInt();

        System.out.print("lua chon cac phep tinh :");
        char c=sc.next().charAt(0);

        switch (c){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
        }

    }
}
