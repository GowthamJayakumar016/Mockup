public class WeathiestCustomer {
   public static void main(String[] args) {
    System.out.println("finding the weathieast customer");

    int [][] arr=new int[][]{
        {1,23,4},
        {45,57},
        {2,45,7}
    };
    System.out.println("wealthieat customer "+Maxwealth(arr));

   } 
   static int  Maxwealth(int [][]arr){
    int Maxwealth=0;
    for (int[] a : arr) {
        int sum=0;
        for (int  is : a) {
            sum+=is;
        }
        if(sum>Maxwealth)
        {
            Maxwealth=sum;
        }
    }
    
    
    
    return Maxwealth;
   }
}
