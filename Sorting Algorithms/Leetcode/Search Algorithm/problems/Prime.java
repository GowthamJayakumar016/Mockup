import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        
        System.out.println("prime logic");
        Scanner in =new Scanner(System.in);
        int c=2;
        System.out.println("Enter the Number to check  prime");
        int num=in.nextInt();
        in.close();
        if(num==1||num==0)
        {
            System.out.println("neither prime nor composite");
        }
        else{
            while(c<num)
            {
                if(num%c==0)
                {
                    System.out.println("Not a prime Number");
                    return;
                }
                c++;
            }
            System.out.println("prime number");
        }
    }
}