package exceptions;

/*
 * -------------------------
 * Exception
 * Exceptions are unexpected/unwanted event that occurs and
 * disturbs the normal flow of program execution is called
 * exceptions.
 *
 */
public class Main {

  public static void main(String[] args) {
    // arithmetic exceptions
    try {
      int a = 10;
      int b = 0;
      int result = a / b;
      System.out.println("result of a/b = " + result);
    } catch (Exception e) {
      System.out.println("exception occured: " + e.getMessage());
      e.printStackTrace();
    }

    // array index out of bounds exceptions
    try {
      int size = 10;
      int[] arr = new int[size];
      System.out.println("array 11th element is : " + arr[10]);
    } catch (Exception e) {
      System.out.println("exception occured: " + e.getMessage());
      e.printStackTrace();
    }
  }

}
