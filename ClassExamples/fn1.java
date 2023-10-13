class fn2{
  // method with no parameter
  public  static void display1() {
    System.out.println("Method without parameter");
  }
  // method with single parameter
  public  static void display1(int a) {
    System.out.println("Method with a single parameter: " + a);
  }
}
class fn1{
  public static void main(String[] args) {
       // create an object of Main
    
    // calling method with no parameter
    fn2.display1();
        // calling method with the single parameter
    fn2.display1(24);
  }
}
