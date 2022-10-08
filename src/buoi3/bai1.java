package buoi3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so nguyen N:");
        n=sc.nextInt();
        System.out.print("\n 1.1: ");
        for (int i=1;i<=n;i++){
            System.out.print( i );
            System.out.print(" ");
        }
        System.out.print("\n 1.2: ");
        for (int i=n;i>=1;i--){
            System.out.print( i );
            System.out.print(" ");
        }
        System.out.print("\n 1.3: ");
        for (int i=1;i<=n;i=i+2){
            System.out.print( i );
            System.out.print(" ");
        }
        System.out.print("\n 1.4: ");
        for (int i=2;i<=n;i=i+2){
            System.out.print( i );
            System.out.print(" ");
        }
    }
}
