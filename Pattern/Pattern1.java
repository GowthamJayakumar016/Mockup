package Pattern;

public class Pattern1 {
  public static void main(String[] args) {
    SquarePattern(4);
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
for (int  i = 0; i < n; i++) {
    for (int j = 0; j <=3; j++) {
        System.out.print("* ");
    }
    System.out.println("");
}
}
}


