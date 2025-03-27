class Nokia {
  private int mic;
  private int cam;

  void setValue() {
    mic = 2;
    cam = 3;

  }

  void showData() {
    System.out.println(mic);
    System.out.println(cam);
  }
}

public class ClassesAndObjects {
  public static void main(String[] args) {
    System.out.println("Main method");

    // we can access non-static members using object
    Nokia n1 = new Nokia();
    n1.setValue();
    n1.showData();
  }
}
