public class Ceil{
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int []arr={2,3,5,9,14,16,18};
        int k=binarysearch(arr, 6);
        System.out.println(k);
    }

    static int binarysearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        
        {
            int mid=(int)(end+start)/2;
            if(arr[mid]==target)
            {
               return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }

        }
        return arr[start];
    }
}
