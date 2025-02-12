package Pattern;

public class Pattern1 {
  public static void main(String[] args) {
    DecrementPattern(5);
    SquarePattern(5);
    Pattern(5);
  
  }
static void Pattern(int n)
{
for (int  i = 0; i < n; i++) {
    for (int j = 0; j <=i; j++) {
        System.out.print("* ");
    }
    System.out.println("");
}
}

static void SquarePattern(int n)
{
for (int  i = 0; i <n; i++) {
    for (int j = 0; j <=n; j++) {
        System.out.print("* ");
    }
    System.out.println("");
}
}


static void DecrementPattern(int n)
{
for (int  i = 0; i <n; i++) {
    for (int j=0;j<n-i;j++) {
        System.out.print("* ");
    }
    System.out.println("");
  
}
}
}


