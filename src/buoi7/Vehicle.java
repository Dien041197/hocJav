package buoi7;

import java.util.Scanner;

public class Vehicle {
    Scanner sc=new Scanner(System.in);
    private String tenChuXe;
    private String tenLoaiXe;
    private Double dungTichXe;
    private Double triGiaXe;
    public Vehicle (String tenChuXe, String tenLoaiXe, Double dungTichXe, Double triGiaXe){
        this.tenChuXe=tenChuXe;
        this.tenLoaiXe=tenLoaiXe;
        this.dungTichXe=dungTichXe;
        this.triGiaXe=triGiaXe;
    }
    public Vehicle(){

    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getTenLoaiXe() {
        return tenLoaiXe;
    }

    public Double getDungTichXe() {
        return dungTichXe;
    }

    public Double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public void setTenLoaiXe(String tenLoaiXe) {
        this.tenLoaiXe = tenLoaiXe;
    }

    public void setDungTichXe(Double dungTichXe) {
        this.dungTichXe = dungTichXe;
    }

    public void setTriGiaXe(Double triGiaXe) {
        this.triGiaXe = triGiaXe;
    }

    public  void nhapThongtin(){
        System.out.print("\nnhap ten chu xe: ");
        setTenChuXe(sc.nextLine());
        System.out.print("\nnhap ten xe: ");
        setTenLoaiXe(sc.nextLine());
        System.out.print("\nnhap sung tich xe: ");
        setDungTichXe(sc.nextDouble());
        System.out.print("\nnhap tri gia xe: ");
        setTriGiaXe(sc.nextDouble());
    }
    public double thue(){
        if(getDungTichXe()<100){
            return triGiaXe*1/100 ;
        }else if(getDungTichXe()<200){
            return triGiaXe*3/100 ;
        }else {
            return triGiaXe*5/100 ;
        }
    }
    public  void hienThiThongTin(){
        System.out.print("\nten chu xe: "+getTenChuXe());
        System.out.print("\nten xe: "+getTenLoaiXe());
        System.out.print("\ndung tich xe: "+getDungTichXe());
        System.out.print("\ngia tri xe: "+getTriGiaXe());
        System.out.print("\nthue: "+thue());


    }
}
