import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]=new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(Insertionsort(arr)));
    }
    public static int[] Insertionsort(int arr[])
    {
        for (int i = 0; i <=arr.length-2; i++) {//Insertion sort 
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        
        
        
        return arr;
    }
}