public class Paper
{
  public static int paperWork(int n, int m) 
  {
    int folhas = 0;
    if(n>0 && m>0){
      folhas = n*m;
      return folhas;
    }
    return 0;
  }
}