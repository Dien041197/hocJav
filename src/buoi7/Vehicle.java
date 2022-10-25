package buoi7;

public class Vehicle {
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
}
