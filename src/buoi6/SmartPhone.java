package buoi6;

public class SmartPhone {
    String tenDienThoai;
    String hangSanXuat;
    Double gam;
    Double giaTien;
    public SmartPhone(String tenDienThoai, String hangSanXuat, Double gam, Double giaTien){
        this.tenDienThoai=tenDienThoai;
        this.hangSanXuat=hangSanXuat;
        this.gam=gam;
        this.giaTien=giaTien;
    }
//    public SmartPhone{

    //}
    public void setTenDienThoai(String tenDienThoai){
        this.tenDienThoai = tenDienThoai;
    }
    public void setHangSanXuat(String hangSanXuat){
        this.hangSanXuat = hangSanXuat;
    }
    public void setGam(Double gam){
        this.gam = gam;
    }
    public void setGiaTien(Double giaTien){
        this.giaTien = giaTien;
    }
    public String getTenDienThoai(){
        return tenDienThoai;
    }
}
