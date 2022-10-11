package buoi4;

public class bai1 {
    public static void main(String[] args) {
        int arr[] =  { 10, 25, -4, 32, 63, 81, 19,-24, 13, 18, 45, 12, 72, 42, -6 };
        int tong=0;
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]%2!=0) {
                System.out.println(i + ":" + (arr[i]));
            }
        }
        System.out.println("\n");
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i]%2==0) {
                if(arr[i]%6==0) {
                    System.out.println(i + ":" + (arr[i]));
                }
            }
        }
        

    }
}
