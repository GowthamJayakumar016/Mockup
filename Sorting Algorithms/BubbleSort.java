import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
    int arr[]=new int []{1,2,3,4,5};
   System.out.println(Arrays.toString(bubbleSort(arr))); 
   } 

  public static int[]  bubbleSort(int arr[])
   {
    boolean s=false;
    for ( int i = 0; i < arr.length; i++) {
        for (int j = 1; j <=arr.length-i-1; j++) {
            if(arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                 s=true;
            }
            
            
            
            

            
        }
        if(!s){break;} 
        
    }
    return arr;
   }
}
