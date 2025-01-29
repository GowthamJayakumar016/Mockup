import java.util.Arrays;

public class Search2D {
    
    public static void main(String[] args) {
        System.out.println("Searching in 2D Array");
        int arr[][]=new int[][]{
            {12,34,},
            {54,56,78},
            {34}
        };
    int k[]=Search(arr);
    System.out.println(Arrays.toString(k));
    
    }
    static int [] Search(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j]==78) {
                return new int[]{i,j};
               } 
            }
        }
        return new int[]{-1,-1};
    }
}
