import java.util.Scanner;
public class Test {
 public static void main(String[] args) {

  int n;
  Scanner in = new Scanner(System.in);
  System.out.print("Input number: ");
  n = in .nextInt();
  int m = n + (n*n) + (n*n*n);
  System.out.printf("The value of n+nn+nnn is " + m);
 }
}