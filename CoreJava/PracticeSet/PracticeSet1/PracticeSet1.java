class Demo {
  int x;
  static int y;

  void nonStaticFun() {
    System.out.println(y);
  }

  static void staticFun() {
    System.out.println(x);
    nonStaticFun();
  }
}

public class PracticeSet1 {
  public static void main(String[] args) {
    Demo d1 = new Demo();
    d1.nonStaticFun();
    d1.staticFun();
  }
}
