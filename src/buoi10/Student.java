package buoi10;

public class Student {
    int maSv;
    String tenSv;
    int namSinh;

    public Student(int maSv,String tenSv,int namSinh){
        this.maSv=maSv;
        this.tenSv=tenSv;
        this.namSinh=namSinh;
    }
    public Student(){}

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getMaSv() {
        return maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public int getNamSinh() {
        return namSinh;
    }
}
