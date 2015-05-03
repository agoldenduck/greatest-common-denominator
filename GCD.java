import java.util.*;
class GCD {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter two numbers to find their greatest common denominator: ");

    int a = keyboard.nextInt();
    int b = keyboard.nextInt();

    while (a!=b) {
      if (a>b) a = a - b;
      else b = b - a;
    }
    System.out.println(a);
  }
}
