package java8features.lambdaExample;

@FunctionalInterface
interface Drawable1{
    public void draw ();
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        int width = 10;


        Drawable1 d2 = () -> { System.out.println("Drawing 2 ==>" +width);};
        d2.draw();

    }
}
