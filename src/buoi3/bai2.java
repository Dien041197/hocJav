package buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n=0;
        int giaithua =1;
        int tichgiaithua =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            giaithua = giaithua*i;
            tichgiaithua = tichgiaithua+giaithua;
        }
        System.out.print("gia thua: "+giaithua);
        System.out.print("\ntich giai thua: "+tichgiaithua);
        System.out.print("\ncac so chia het cho 3 va 7 la: ");
        for (int i=1;i<=n;i++){
            if(i%3==0||i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
