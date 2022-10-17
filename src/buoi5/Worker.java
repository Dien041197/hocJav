package buoi5;

public class Worker {
    String ten;
    Double namSinh;
    String congViec;
    String noiLamViec;
    public Worker(String ten, Double namSinh, String congViec, String noiLamViec){
        this.ten=ten;
        this.namSinh=namSinh;
        this.congViec=congViec;
        this.noiLamViec=noiLamViec;
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
        return congViec;
    }
    public String getNoiLamViec(){
        return  noiLamViec;
    }
    public void  setTen(){
        this.ten = ten;
    }
    public void  setNamSinh(){
        this.namSinh = namSinh;
    }
    public void  setCongViec(){
        this.congViec = congViec;
    }
    public void  setNoiLamViec(){
        this.noiLamViec = noiLamViec;
    }
    public void findWorkplace(){
        String giaoDuc=""
    }



}
