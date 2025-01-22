public class Main {
    public static void main(String[] args) {
        int []arr={1,23,4,5,6,45,6,3,4,2,3,4,5,6,66,77,};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==203)
            {
                System.out.println("Element is found "+i+"index");
                return ;
            }

        }
        System.out.println("Element is not found");
        searh(0, 6, arr);
    }
    static void searh(int index1,int index2,int arr[])
    {
        if(index1>index2)
        {
          System.out.println("index should be verified");
        }
        for(int i=index1;i<index2;i++)
        {
            if(arr[i]==23)
            {
                System.out.println("Element is found "+i+" index");
                return ;
            }

        }
        System.out.print("Element is not found");
    }
}
