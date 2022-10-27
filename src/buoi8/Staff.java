package buoi8;

import java.util.Scanner;

public class Staff {
    Scanner sc= new Scanner(System.in);
    public String ten;
    public String maSo;
    public Double luongCanBan;
    public Double heSoLuong;
    public Double thamNien;
    public Staff(String ten, String maSo,Double luongCanBan, Double heSoLuong, Double thamNien){
        this.ten=ten;
        this.maSo=maSo;
        this.luongCanBan=luongCanBan;
        this.heSoLuong=heSoLuong;
        this.thamNien=thamNien;
    }
    public Staff(){

    }

    public String getTen() {
        return ten;
    }

    public String getMaSo() {
        return maSo;
    }

    public Double getLuongCanBan() {
        return luongCanBan;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public Double getThamNien() {
        return thamNien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setLuongCanBan(Double luongCanBan) {
        this.luongCanBan = luongCanBan;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setThamNien(Double thamNien) {
        this.thamNien = thamNien;
    }

    public int heSoLuongThuc(){
        int tongThamnien=1;
       for (int i=0;i < thamNien;i++) {
           if (i % 5 == 0) {
               tongThamnien++;
           }
       }
       return tongThamnien;
    }
    public void input(){
        System.out.print("\nnhap ten:");
        setTen(sc.nextLine());
        System.out.print("\nnhap ma so:");
        setMaSo(sc.nextLine());
        System.out.print("\nnhap luong co ban:");
        setLuongCanBan(sc.nextDouble());
        System.out.print("\nnhap he so co ban:");
        setHeSoLuong(sc.nextDouble());
        System.out.print("\nnhap tham nien:");
        setThamNien(sc.nextDouble());

    }
    public Double tinhLuongThacLanh(){
        return luongCanBan*heSoLuongThuc();
    }
    public void output(){
        System.out.print("\nTen: "+getTen());
        System.out.print("\nMa so: "+getMaSo());
        System.out.print("\nluong can ban: "+getLuongCanBan());
        System.out.print("\nluong thuc nhan: "+tinhLuongThacLanh());
    }

}
