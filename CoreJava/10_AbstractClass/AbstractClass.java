/*  abstract class:-------
 abstract class is used to create set of rules.
 we can not create the object of abstract class but child of that class can access memberd of that class.
 if we have abstract method in any class then it is mendetory to declare that class as abstract.
*/
abstract class Demo {
  int x;
  int y;

  Demo(int x, int y) {
    this.x = x;
    this.y = y;
  }

  abstract void fun1(int x, int y);

  void fun2() {
    System.out.println("non-abstract function");
  }
}

class UseAbstract extends Demo {
  int x;
  int y;

  UseAbstract() {
    super(11, 12);
  }

  @Override
  void fun1(int x, int y) {
    this.x = x;
    this.y = y;

    // super keyword refers to the parent class variable
    System.out.println(super.x);

    // this keyword refers to the child class variable
    System.out.println(this.x);

    // here, x is local variable
    System.out.println(x);
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    System.out.println("Abstract class");
    UseAbstract a1 = new UseAbstract();
    a1.fun1(20, 23);
    a1.fun2();
  }
}