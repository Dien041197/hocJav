import java.util.Scanner;

public class phantach {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen co 3 chu so:");
        n= sc.nextInt();
        System.out.print(" chu so hang tram: "+(n%100)%10);
        System.out.print(" chu so hang chuc: "+(n%100)/10);
        System.out.print(" chu so don vi: "+n/100);
    }
}
