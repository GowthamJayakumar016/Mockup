import java.util.Arrays;

public class ProducExceptIt {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        
        int ans[]=new int[nums.length];
        ;
        for (int  i = 0; i < ans.length; i++) {
            int sum=1;
           for (int j = 0; j < ans.length; j++) {
            if(i==j) continue;
            
            {
                sum=sum*nums[j];

            }
            ans[i]=sum;
           } 
        }
        
        
        
        
        return ans;
    }
}
