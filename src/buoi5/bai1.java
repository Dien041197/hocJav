package buoi5;

import java.util.Scanner;

public class bai1 {
    String maSV;
    String tenSV;

    public void fillInfo(Scanner sc){
        System.out.print("Nhập mã số sinh viên: ");
        maSV=sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        tenSV=sc.nextLine();
    }

    public void sayHello(){
        System.out.print("Hello!Iam["+tenSV+"],IDnumber:["+maSV+"]");
    }
}
