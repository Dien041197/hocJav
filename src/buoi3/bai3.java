package buoi3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n= sc.nextInt();
        System.out.print("\n");
        for (int x=1;x<=n;x++){
            if( x==(n/2)){
                System.out.print("SƠ ĐỒ CHỖ NGỒI");
            }else {
                System.out.print("      ");
            }
        }
        System.out.print("\n");
        System.out.print("=");
        for (int x=1;x<=n;x++){
            System.out.print("======");
        }
        System.out.print("\n");
        for (int x=1;x<=n;x++){
            if(x==(n/2)){
                System.out.print("MÀN HÌNH");
            }else {
                System.out.print("      ");
            }
        }
        System.out.print("\n");
        System.out.print("=");
        for (int x=1;x<=n;x++){
            System.out.print("======");
        }
        System.out.print("\n");
        for (char i='A';i<='K';i++){
            System.out.print(i+"  ");

            for (int y=1;y<=n;y++){
                if(y<=9){
                    System.out.print("[0"+y+"]");
                    System.out.print("  ");
                }else {
                    System.out.print("["+y+"]");
                    System.out.print("  ");
                }
            }

            System.out.print("\n");
        }
    }
}
