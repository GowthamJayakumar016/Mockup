public class Amstrong {
    public static void main(String[] args) {
       System.out.println("Amstrong number"); 
       System.out.println(amstrong(153));
    }
    static boolean amstrong(int num)
    {
        int rem=0,sum=0;
        int k=num;
       while(num>0)
       {
        rem=num%10;
        sum=sum+rem*rem*rem;
        num=num/10;
       }
       if(k==sum)
       {
        return true;
       }
       
       
       
        return false;
    }
}
