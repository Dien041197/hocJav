package buoi5;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Rectangle hcn = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());

        System.out.println("chu vi hình chữ nhật là : " + hcn.doPerimeter());
        System.out.println("diện tích hình chữ nhật là : " + hcn.doArea());

    }
}
