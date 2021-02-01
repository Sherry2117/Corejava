package ExceptionExamples;

public class Test1 {

    public static void main(String[] args) {
      try {
          int data = 100 / 2; //scenario 1 Arithmetic Exception
          //int data = 100 / 0; //scenario 1 Arithmetic Exception
          System.out.println("data ==>" + data);
         // String s = null; //Scenario 2 NullPointerE
          String s = "sandeep"; //Scenario 2 NullPointerE
          System.out.println("data==>" +s.length());


         // String s1 = "abc"; //Scenario 3 NumberFormatException
          String s1 = "123"; //Scenario 3 NumberFormatException
          System.out.println("data ==>" + Integer.parseInt(s1));

          int a[] = new int[5]; //Scenario 4 ArrayIndexOutOfBoundsException
          a[10] = 50;
          System.out.println("data ==>" + Integer.parseInt(s1));

      }catch (ArithmeticException e) {
          System.out.println("Exception ArithmeticException ");
      }catch (NullPointerException e) {
          System.out.println("Exception NullPointerException ");
      }catch (NumberFormatException e) {
          System.out.println("Exception  NumberFormatException");
      }catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Exception ArrayIndexOutOfBoundsException");
      }finally {
          System.out.println("Finally ");



      }

    }
}
