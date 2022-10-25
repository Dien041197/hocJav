package buoi7;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Student td1 = new Student();
        Scanner sc= new Scanner(System.in);
        td1.setters();
        td1.diemTrungBinh();
        td1.getters();
        td1.loai();
    }
}
