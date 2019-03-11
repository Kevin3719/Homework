import java.util.*;
public class testing{
  public static void main(String[] args) {
    int[] a = { 2, 10, 15, 23, 0,  5};
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
    System.out.println("");
    partition(a,0,5);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
    System.out.println("");
  }
}
