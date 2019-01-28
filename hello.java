public class hello {

  public static void main(String []args) {
    System.out.println("Hello, World!\n");
    System.out.println("This Astana, Qazaqstan");
    System.out.println("The sum of 2 and 3 is 5.");

    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
      
    System.out.println("Это первый текст на Java в AWS \n и это круто!!!");
  }
}