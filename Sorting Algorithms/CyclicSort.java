import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int arr[]=new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(Cyclicsort(arr)));
    }

    static int [] Cyclicsort(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int CorrectIndex=arr[i]-1;
            if(arr[i]!=arr[CorrectIndex])
            {
                    int temp=arr[i];
                    arr[i]=arr[CorrectIndex];
                    arr[CorrectIndex]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
