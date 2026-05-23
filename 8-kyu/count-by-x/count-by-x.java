public class Kata{
  public static int[] countBy(int x, int n){
    int[] nu = new int[n];
    for(int i = 0; i<n; i++){
      nu[i] = x * (i + 1);
    }
    
    return nu;
  }
}