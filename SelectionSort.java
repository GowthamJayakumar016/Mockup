
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection sort");
        System.out.println(Arrays.toString(Selectionsort(new int []{1,23,4,58})));
    }
public static int [] Selectionsort(int arr [])
{
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }


    return arr;

}

}
