package buoi2;


import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int thang;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap thang: ");
        thang = scanner.nextInt();

        switch (thang) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay.");
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + " cc 30 ngay.");
                break;


            case 2:
                int year;
                System.out.println("Moi ban nhap nam: ");
                year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Thang " + thang + " nam " + year + " có 29 ngay.");
                } else {
                    System.out.println("Thang " + thang + " nam " + year + " có 28 ngay.");
                }
                break;
            default:
                System.out.println("Nhap thang khong hop le.");
        }
    }
}
