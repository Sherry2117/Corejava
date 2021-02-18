package java8features.lambdaExample;

interface Sayable{
    public String say();
}
public class LambdaExample1 {

    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
