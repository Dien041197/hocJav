package buoi2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        char kytu ;
        Scanner sc =new Scanner(System.in);

        System.out.print("Nhap ky tu: ");
        kytu = sc.next().charAt(0);

        switch (kytu){
            case 'A':
            case 'a':
                System.out.print("Ada");
                break;
            case 'B':
            case 'b':
                System.out.print("Basic");
                break;
            case 'C':
            case 'c':
                System.out.print("Cobol");
                break;
            case 'D':
            case 'd':
                System.out.print("Android");
                break;
            case 'F':
            case 'f':
                System.out.print("Fortran");
                break;
            case 'W':
            case 'w':
                System.out.print("Windows Phone");
                break;
        }
    }
}
