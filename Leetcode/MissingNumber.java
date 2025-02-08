// import java.util.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
       int []arr=new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
     int i=0;
     while(i<arr.length)
     {
        int index=arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[index])
        {
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        else{
            i++;
        }

        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j) {
                return j;
            }
        }
       

     }
     return arr.length;
    }
}
        