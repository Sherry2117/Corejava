package ExceptionExamples;

public class MultipleCatchBlock2 {


    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
            int a[] = new int[5];
            a[5] = 30 / 2;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
            //apply rule1
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException ");
             //apply rule 2
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
              //apply rule 1 and 2
        } catch (Exception e) {
            System.out.println("Exception occurs");
            //rule 1 and rule 2
            e.printStackTrace();
            //apply final
        }finally {
            System.out.println("always Executed");
        }
    }
}
