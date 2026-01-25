public class StaticKeyword {
  // variables
  public static short shortNumber;
  public static byte byteNumber;
  public static int intergerNumber;
  public static long longNumber;
  public static float floatNumber;
  public static double doubleNumber;
  public static char charVar;
  public static boolean booleanVar;

  // arrays
  public static byte[] byteArr = new byte[5];
  public static short[] shortArr = new short[5];
  public static int[] intArr = new int[5];
  public static long[] longArr = new long[5];
  public static double[] doubleArr = new double[5];
  public static float[] floatArr = new float[5];
  public static char[] charArr = new char[5];
  public static boolean[] booleanArr = new boolean[5];

  public static void main(String[] args) {
    // printing out the default values of variables
    System.out.println("Printing default values of static variables");
    System.out.println("Short default value: " + shortNumber);
    System.out.println("byte default value: " + byteNumber);
    System.out.println("integer default value: " + intergerNumber);
    System.out.println("long default value: " + longNumber);
    System.out.println("float default value: " + floatNumber);
    System.out.println("double default value: " + doubleNumber);
    System.out.println("character default value: " + charVar);
    System.out.println("boolean default value: " + booleanVar);

    // printing out the default values of arrays
    System.out.println("Printing default values of array");
    System.out.println("bytes array: ");
    for (byte b : byteArr) {
      System.out.print(b + ", ");
    }
    System.out.println("\nshort array: ");
    for (short s : shortArr) {
      System.out.print(s + ", ");
    }
    System.out.println("\ninteger array: ");
    for (int i : intArr) {
      System.out.print(i + ", ");
    }
    System.out.println("\nlong array: ");
    for (long l : longArr) {
      System.out.print(l + ", ");
    }
    System.out.println("\nfloat array: ");
    for (float f : floatArr) {
      System.out.print(f + ", ");
    }
    System.out.println("\ndouble array: ");
    for (double d : doubleArr) {
      System.out.print(d + ", ");
    }
    System.out.println("\ncharacter array: ");
    for (char c : charArr) {
      System.out.print(c + ", ");
    }
    System.out.println("\nboolean array: ");
    for (boolean bl : booleanArr) {
      System.out.print(bl + ", ");
    }
  }
}
