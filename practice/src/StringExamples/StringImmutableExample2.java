package StringExamples;

public class StringImmutableExample2 {

    public static void main(String[] args) {
        String s ="Wahaj";
        s = s.concat(" Uddin "); //concat() appends the string at the end.
        System.out.println(s);
        String str ="Wahaj";
        str = str.concat("Uddin2");
        String str1 ="Wahaj";
        System.out.println(str);
        System.out.println(str1);
    }

}
