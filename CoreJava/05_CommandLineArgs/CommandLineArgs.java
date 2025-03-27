public class CommandLineArgs {
  public static void main(String[] args) {
    // find avarage
    int i;
    int sum = 0;
    int avg = 0;
    for (i = 0; i < args.length; i++) {
      sum += Integer.parseInt(args[i]);
      avg = sum / args.length;
    }
    System.out.println(avg);

    // array in java
    String[] arr = new String[4];
    arr[0] = "Abc";
    System.out.println(arr[0]);
  }
}