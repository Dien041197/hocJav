package buoi7;

import java.util.Scanner;

public class Student {
    Scanner sc =new Scanner(System.in);
    String maSo;
    String hoTen;
    Double diemToan;
    Double diemVan;
    Double diemAnh;
    public Student(String maSo, String hoTen, Double diemToan, Double diemVan, Double diemAnh){
        this.maSo=maSo;
        this.hoTen=hoTen;
        this.diemToan=diemToan;
        this.diemVan=diemVan;
        this.diemAnh=diemAnh;
    }
    public Student(){

    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemToan(Double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemVan(Double diemVan) {
        this.diemVan = diemVan;
    }

    public void setDiemAnh(Double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Double getDiemToan() {
        return diemToan;
    }

    public Double getDiemVan() {
        return diemVan;
    }

    public Double getDiemAnh() {
        return diemAnh;
    }
    public void setters(){
        System.out.print("\nnhap ma so: ");
        setMaSo(sc.nextLine());
        System.out.print("\nnhap ten: ");
        setHoTen(sc.nextLine());
        System.out.print("\nnhap diem toan: ");
        setDiemToan(sc.nextDouble());
        System.out.print("\nnhap diem van: ");
        setDiemVan(sc.nextDouble());
        System.out.print("\nnhap diem anh: ");
        setDiemAnh(sc.nextDouble());
    }
    public double diemTrungBinh(){
        return (diemAnh+diemAnh+diemVan)/3;
    }
    public void loai(){
        if (diemTrungBinh()>=8.5){
            System.out.print("\ngioi nhan hoc bong");
        }else if(diemTrungBinh()>=6.5){
            System.out.print("\nkha");
        }else if (diemTrungBinh()>=5){
            System.out.print("\ntrung binh");
        }else if (diemTrungBinh()>=3.5){
            System.out.print("\nyeu thi lai");
        }else {
            System.out.print("\nkem rot");
        }
    }
    public void getters(){
        System.out.print("\n-ma so: "+getMaSo());
        System.out.print("\n-ho va ten: "+getHoTen());
        System.out.print("\n-diem toan: "+getDiemToan());
        System.out.print("\n-diem van: "+getDiemVan());
        System.out.print("\n-diem anh"+getDiemAnh());
        System.out.print("\n-trung binh: "+diemTrungBinh());
    }

}
