/*
 * we can not create the object of interface.
 * int x; --> bydefault public, static, final
 * void fun1(); --> public, abstract
 */

interface inter1 {
  int z = 2;

  void fun1(int x, int y);

  static void fun2() {
    System.out.println("static function");
  }
}

interface inter2 extends inter1 {
  void fun1(int x);

  static void fun3() {
    System.out.println("inter2 - fun3");
  }
}

class Demo implements inter2 {
  public void fun1(int x, int y) {
    System.out.println("fun1 - Demo");
  }

  public void fun1(int x) {
    System.out.println("fun1 - Demo");
  }
}

public class Interface {
  public static void main(String[] args) {
    System.out.println("Interface");

    // interface me static function inherit nahi hote pr variable inherit hota h
    inter1.fun2();
    System.out.println(inter1.z);
    inter2.fun3();
    System.out.println(inter2.z);
    Demo d1 = new Demo();
    // Demo.fun2();
    // d1.fun2();
    d1.fun1(11, 22);
    d1.fun1(33);
  }
}
