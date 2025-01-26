public class PeakOfMountain {
    public static void main(String[] args) {
        System.out.println("Peak Of the Mountain");
        int []arr=new int[]{1,2,3,5,6,7,4,3,2};
        int ans=Peak(arr);
        System.out.println(ans);
    }
    static int Peak(int arr[])
    {
       
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
                
            }
            else{
                start=mid+1;
            }
        }

        return arr[start];
    }
}
