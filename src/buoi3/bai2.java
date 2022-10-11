package buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n=0;
        int giaiThua =1;
        int tichGiaiThua =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap n: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            giaiThua = giaiThua*i;
            tichGiaiThua = tichGiaiThua+giaiThua;
        }
        System.out.print("gia thua: "+giaiThua);
        System.out.print("\ntich giai thua: "+tichGiaiThua);
        System.out.print("\ncac so chia het cho 3 hoac 7 la: ");
        for (int i=1;i<=n;i++){
            if(i%3==0||i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
