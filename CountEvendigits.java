public class CountEvendigits {
    public static void main(String[] args) {
        System.out.println("Finding the even digits in the number");

        int []arr= new int[]{
            1,23,4,56,67378,5,4,345,
        };

        int k=Count(arr);
        System.out.println("Number "+k);
    }
    static int Count (int arr[])
    {
        int count =0;
        for (int i : arr) {
            if (even(i))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int count1=0;
        count1=((int)Math.log10(num)+1);
        return count1%2==0;
    }
}