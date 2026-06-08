public class ProdFib { // must be public for codewars 
public static long[] productFib(long prod) {
    long n = 0, x = 1;
    while (n * x < prod) {
        long n2 = n + x;
        n = x;
        x = n2;
    }
    return new long[] { n, x, n * x == prod ? 1 : 0 };
    }
  }