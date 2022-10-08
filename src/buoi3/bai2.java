package buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n=0;
        int giaithua =1;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            giaithua = giaithua*i;
        }
        System.out.print(giaithua);
    }
}
