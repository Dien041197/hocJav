package buoi4;

import java.util.Random;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int demX = 0;
        int dem = 0;
        int[] a = new int[20];
        int[] b = new int[20];
        System.out.print("Nhập X: ");
        x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(20);
            System.out.print((i + 1) + ": " + a[i] + "\n");
            if (a[i] == x) {
            }

        }
        System.out.print("\nX xuất hiện " + demX + " lần");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                for (int x = i; x < b.length; x++) {
//                    if (a[j] == a[i] && a[j] != b[x]) {
//                        dem++;
//                        if (dem == 2) {
//                            System.out.print("\n" + a[i] + " suất hiện trên 3 lần ");
//                            b[i] = a[i];
//                            dem = 0;
//
//                        }
//                    }
//                }
//            }
//      }
//        for (int i = 0; i < a.length; i++){
//            for (int j = i + 1 ; j < i ; j++){
//                for ( int c = 0 ; c < j ; c++ )
//                if (a[i]==a[j]&&a[i]!=b[c]){
//                    dem++;
//                    if(dem==2){
//                        System.out.print(a[i]);
//                        dem=0;
//                        b[c]=a[i];
//
//                    }
//                }
//            }
//        }


    }
}