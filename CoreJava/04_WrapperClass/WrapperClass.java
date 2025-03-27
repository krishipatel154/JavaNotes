public class WrapperClass {
  public static void main(String[] args) {
    int x = Integer.parseInt("123");
    System.out.println(x);

    // binary to decimal convert
    int y = Integer.parseInt("1110101", 2);
    System.out.println(y);

    // binary to decimal convert
    Integer val = Integer.valueOf("1110101", 2);
    int z = val.intValue();
    System.out.println(z);
  }
}

/*
 * 
 * class Integer{
 * // used to convert data in int
 * static int parseInt(){
 * return int;
 * }
 * 
 * static Integer valueOf(){
 * }
 * 
 * int intValue(){
 * return int;
 * }
 * }
 * 
 */