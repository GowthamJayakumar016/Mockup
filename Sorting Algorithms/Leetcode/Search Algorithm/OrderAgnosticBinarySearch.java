public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        System.out.println("Order Agnostic Binary Search");
        System.out.println(binarysearch(new int []{5,4,3,2,1}, 3));
        System.out.println(binarysearch(new int []{1,2,3,4,5},2));
    }
    static int binarysearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        
        while(start<=end)
        
        {
            int mid=(int)(end+start)/2;
            if(arr[mid]==target)
            {
               return mid;
            }
            if (isAsc){
             if(target>arr[mid])
            {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
        }
        else{

            if(target<arr[mid])
            {
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
        }

        }
        return -1;
    }
    
}

