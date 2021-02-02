package Misc;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            int x=300;
            //code here
        }catch (Exception e) {
            System.out.println(" Exception");
        }finally {
            System.out.println("Finally blocked is executed");
        }
    }
}
