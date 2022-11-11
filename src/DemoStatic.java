public class DemoStatic {
    private static double salary;
   public static final String DEPARTMENT = " Finance ";

   public static void main(String args[]) {
      salary = 70000;
      System.out.println( DEPARTMENT + "average salary:" + salary );
   }
}
