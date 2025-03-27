class Example {
  // default static members
  static int x;

  static void fun1() {
    System.out.println("Example-fun1");
  }

  // private static variable
  private static int y;

  static void fun2() {
    y = 20;
    System.out.println(y);
  }
}

public class StaticMembers {
  public static void main(String[] args) {
    System.out.println("Main method");
    // default static member
    Example.fun1();
    Example.x = 10;
    System.out.println(Example.x);

    // private static members
    Example.fun2();
  }
}