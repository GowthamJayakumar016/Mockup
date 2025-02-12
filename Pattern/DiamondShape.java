package Pattern;

public class DiamondShape {
    public static void main(String[] args) {
        RDiamondshape(5);
        DiamondShape2(5);
        Triangle(5);
    }
 public static void RDiamondshape(int n)
 {
    for (int i = 1; i < 2*n; i++) {
      int  totalc=(i>n)?2*n-i:i; 
      for (int j = 1; j <=totalc; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
 }
 public static void DiamondShape2(int n)
 {
    for (int i = 1; i < 2*n; i++) {
        int  c=(i>n)?2*n-i:i; 
        int sspace=n-c;
        for(int k=0;k<sspace;k++)
        {
            System.out.print(" ");
        }
        
        for (int j = 1; j <=c; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
 }
 public static void Triangle(int n)
 {
    for (int i = 1; i <=n; i++) {
     
        for(int k=1;k<=n-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    
 }
}

