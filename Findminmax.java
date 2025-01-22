// import java.util.*;
public class Findminmax {
    public static void main(String[] args) {
        System.out.println("finding the Min max");
        // int arr[]=new int[12];
        // // Scanner in =new Scanner(System.in);
        // System.out.println("Enter the numbers");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=in.nextInt();
        // }
        int arr[]={1,23,4,5,67,89,2};
        minmax(arr);

    }
    static void minmax(int arr[])
    {  
        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum "+max+" Minimum "+min);
    }
}
