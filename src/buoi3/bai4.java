package buoi3;

import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Random rd =new Random();
        int a= rd.nextInt(10);
        Scanner sc =new Scanner(System.in);
        int s=0,d=10;
        for (int i=1; i<=9;i++){
            System.out.print("\nNhập vào số nguyên giá dự đoán: ");
            int n= sc.nextInt();
            if (n>a){
                System.out.print("\nGiá trị nhập vào lớn hơn");
                d--;
                s++;
            }else if (n<a){
                System.out.print("\nGiá trị nhập vào bé hơn");
                d--;
                s++;
            }if (n==a){
                i=9;
                System.out.print("\nNhập đúng giá trị");
                System.out.print("\nĐiểm: "+d);
                System.out.print("\nSố lần sai : "+s);
                System.out.print("\nRandom = "+a);
            }
        }
    }
}
