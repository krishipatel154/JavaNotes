class Example {
  // default instance member variable
  int x;

  void fun1() {
    System.out.println("Example-fun1");
  }

  // private instance members
  private int y;

  void fun2() {
    y = 12;
    System.out.println(y);
  }
}

public class NonStaticMembers {
  public static void main(String[] args) {
    System.out.println("Main method");
    // access non-static(instance member) methods
    Example e1 = new Example();
    e1.x = 20;
    System.out.println(e1.x);
    e1.fun1();

    // private inctance members
    e1.fun2();
  }
}
