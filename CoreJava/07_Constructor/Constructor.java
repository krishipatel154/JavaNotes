class Demo {
  private int x;
  private int y;

  // default constructor
  Demo() {
    x = 10;
    y = 20;
  }

  // parameterized constructor
  Demo(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void showValue() {
    System.out.println(x);
    System.out.println(y);
  }
}

public class Constructor {
  public static void main(String[] args) {
    Demo d1 = new Demo(11, 22);
    d1.showValue();

    Demo d2 = new Demo();
    d2.showValue();
  }
}
