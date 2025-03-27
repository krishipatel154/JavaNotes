// parent/ super / base class
class VivoV20 {
  int mic;
  int cam;

  VivoV20(int mic, int cam) {
    this.mic = mic;
    this.cam = cam;
  }

  void showData() {
    System.out.println(mic);
    System.out.println(cam);
  }
}

// child/ sub / derived class
class VivoV25 extends VivoV20 {
  VivoV25() {
    super(2, 2);
    mic = 4;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    System.out.println("Inheritance");
    VivoV25 v1 = new VivoV25();
    v1.showData();
  }
}
