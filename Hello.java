import java.util.Scanner;

public class Hello {

  public static long fibo(long n) {
    if (n < 0) {
        return -1; 
    }

    long a1 = 0;
    long a2 = 1;
    if (n < 2) {
        return n;
    }

    try {
      long a = 0;
      long i = 2;
      
      while (i <= n) {
          a = Math.addExact(a1, a2);
          a1 = a2;
          a2 = a;
          i++;
      }
      return a;
    } catch (ArithmeticException e) {
        return Long.MAX_VALUE;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println(fibo(4));
    
    sc.close();

  }
}
