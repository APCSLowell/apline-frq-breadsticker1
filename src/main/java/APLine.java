public class APLine
{
  /* your code here */
  private int a, b, c;

  public APLine(int a1, int b1, int c1){
    a = a1;
    b = b1;
    c =c 1;
  }

  public double getSlope(){
    return -(double)a/b;
  }

  public boolean inOnLine(int x, int y){
    return a*x + b*y + c == 0;
  }
}
