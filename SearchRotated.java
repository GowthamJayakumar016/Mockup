public class SearchRotated {
    public static void main(String[] args) {
        int a[]=new int[]{3,4,5,6,7,0,1,2};
        
        
        System.out.println(Search(a, 0));
    }

    public  static int Search(int []arr,int target)
    {   
        int pivot=FindPivot(arr);
        if(pivot==-1)
        {
           return binarysearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target)
        {
            return pivot;
        }
        else if(target>=arr[0])
        {
           return binarysearch(arr, target,0,pivot-1);
        }
        
        return  binarysearch(arr, target, pivot+1, arr.length-1);
        
        
        
    }

    public static int FindPivot(int []arr)
    {
        int start =0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1] )
            {
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            else if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int binarysearch(int arr[],int target,int s,int e)
    {
        int start=s;
        int end=e;
        
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
        return -1;
    }
}
