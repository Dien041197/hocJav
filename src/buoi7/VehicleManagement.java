package buoi7;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Vehicle v1=new Vehicle();
        Vehicle v2=new Vehicle();
        Vehicle v3=new Vehicle();

        v1.nhapThongtin();
        v2.nhapThongtin();
        v3.nhapThongtin();

        v1.hienThiThongTin();
        v2.hienThiThongTin();
        v3.hienThiThongTin();
        System.out.print("\ntong thue la: "+(v1.thue()+v2.thue()+v3.thue()));
    }
}
