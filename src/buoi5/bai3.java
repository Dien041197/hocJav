package buoi5;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Worker w =new Worker();

        Scanner sc =new Scanner(System.in);

        System.out.print("Nhập Tên: ");
        w.setTen(sc.nextLine());

        System.out.print("Nhập Năm sinh: ");
        w.setNamSinh(sc.nextDouble());

        System.out.print("Nhập Công Việc: ");
        w.setCongViec(sc.nextLine());

        w.findWorkplace(sc.nextLine());

        w.studyOrWork();

        w.output();
    }
}

