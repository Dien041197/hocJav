package buoi5;

public class Worker {
    String ten;
    Double namSinh;
    String congViec;
    String noiLamViec;

    Double tuoi;
    public Worker(String ten, Double namSinh, String congViec, String noiLamViec, Double tuoi){
        this.ten=ten;
        this.namSinh=namSinh;
        this.congViec=congViec;
        this.noiLamViec=noiLamViec;
        this.tuoi=tuoi;
    }
    public Worker(){

    }
    public String getTen(){
        return  ten;
    }
    public double getNamSinh(){
        return  namSinh;
    }
    public String getCongViec(){
        return  congViec;
    }
    public String getNoiLamViec(){
        return  noiLamViec;
    }
    public void  setTen(String ten){
        this.ten = ten;
    }
    public void  setNamSinh(Double namSinh){
        this.namSinh = namSinh;
    }
    public void  setCongViec(String congViec){
        this.congViec = congViec;
    }
    public void findWorkplace(String cv){
        String giaoDuc = "Giáo dục";
        String yte = "Y tế";
        String luat = "Luật";
        String congso = "Công sở";
        String congso2 = "Văn phòng";
        String khac = "Khác";
        if (cv.contains(giaoDuc)){
            this.noiLamViec = giaoDuc;
        }
        else if (cv.contains(yte)){
            this.noiLamViec = yte;
        }
        else if (cv.contains(luat)){
            this.noiLamViec = luat;
        }
        else if (cv.contains(congso)){
            this.noiLamViec = congso2;
        }else {
            this.noiLamViec = khac;
        }
    }
    public void studyOrWork(){
        this.tuoi= 2022 - getNamSinh();
    }
    public void output(){
        if(tuoi<20){
            System.out.print("\nBạn tên là: [ "+ten+" ]. Bạn [ đanghọc ] về [ "+congViec+" ] tại [ "+noiLamViec+" ]");
        }else {
            System.out.print("\nBạn tên là: [ "+ten+" ]. Bạn [ làm việc ] về [ "+congViec+" ] tại [ "+noiLamViec+" ]");
        }
    }
}
