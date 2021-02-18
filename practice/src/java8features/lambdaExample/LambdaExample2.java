package java8features.lambdaExample;


interface Sayable2 {
    public String say(String name);
}
/*class SayableImpl implements Sayable2 {
    @Override
    public String say(String name) {
        return name;
    }
}*/
public class LambdaExample2 {

    public static void main(String[] args) {
        Sayable2 s1 = (name) -> {
            return "Hello," + name;
        };
        System.out.println(s1.say("Sherry"));
        Sayable2 s2 = name -> {
            return "Hello," + name;
        };
         System.out.println(s2.say("wahaj"));
        //System.out.println(s1.say("Sherry").concat("==").concat(s2.say("wahaj")));

    }

}
