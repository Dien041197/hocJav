package buoi4;

public class bai1 {
    public static void main(String[] args) {
        int arr[] = {10, 25,-4, 32, 63, 81, 19, -24, 13, 18, 45, 12, 72, 42,-6};
        int sum = 0;
        System.out.print("Yêu cầu 1:");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) {
                System.out.print("\n-arr["+i + "]:" + arr[i]);
                sum=sum+arr[i];
            }
        }

        System.out.print("\nYêu cầu 2:");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                if(arr[i]%6==0) {
                    System.out.print("\n-arr[" + i + "]:" + arr[i]);
                }
            }
        }

        System.out.print("\nYêu cầu 3:");
        System.out.print("\nTổng chẵn là: "+sum);

        System.out.print("\nYêu cầu 4:");
        System.out.print("\n-arr[]={");
        for (int i=0;i<arr.length;i++){
            if(i==args.length-1) {
                if(arr[i]<0) {
                    arr[i] = 0;
                    System.out.print(arr[i] + "}");
                }else {
                    arr[i] = 0;
                    System.out.print(arr[i] + "}");
                }
            }else if(arr[i]<0) {
                arr[i] = 0;
                System.out.print(arr[i] + ",");
            }else {
                System.out.print(arr[i] + ",");
            }
        }

    }
}
