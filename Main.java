public class Main {
    public static void main(String[] args) {
        int []arr={1,23,4,5,6};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==203)
            {
                System.out.println("Element is found "+i+"index");
                return ;
            }

        }
        System.out.print("Element is not found");
    }
}
