class Demo {
  // function overloading - same name, datatype but different arguments
  void fun1() {
    System.out.println("fun1-without parameter");
  }

  void fun1(int x) {
    System.out.println("fun1-with one int argument");
  }

  void fun1(double x) {
    System.out.println("fun1-with one double parameter");
  }

  // int fun1(int x){
  // System.out.println("");
  // return 0;
  // }
}

// function overriding - same name, datatype, arguments
class Parent {
  void f1() {
    System.out.println("parent class");
  }
}

class Child extends Demo {
  void f1() {
    System.out.println("child class");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    System.out.println("Polymorphism");
    Demo d1 = new Demo();
    d1.fun1();
    d1.fun1(20);
    d1.fun1(30.4);

    Child c1 = new Child();
    c1.f1();
  }
}