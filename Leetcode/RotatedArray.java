public class RotatedArray {
    public static void main(String[] args) {
        int []a=new int[]{3,4,5,6,7,0,1,2,3};
        System.out.println(FindPivot(a));
    }
    static int FindPivot(int []arr)
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
}
