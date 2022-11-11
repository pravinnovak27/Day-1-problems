public class DemoMethod {
    public int addNumbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
      }
      public static void main(String[] args) { 
        int num1 = 25;
        int num2 = 15;
        int num3 = 45;
        DemoMethod obj = new DemoMethod();
        int result = obj.addNumbers(num1, num2, num3);
        System.out.println("Sum is: " + result);
      }
}
