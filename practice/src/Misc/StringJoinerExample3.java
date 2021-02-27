package Misc;

import java.util.StringJoiner;

public class StringJoinerExample3 {

    public static void main(String[] args) {
        StringJoiner stringJoiner =  new StringJoiner(",");
        //System.out.println(stringJoiner);
        stringJoiner.setEmptyValue("It is empty");
        //System.out.println(stringJoiner);
        stringJoiner.add("Rahul");
        stringJoiner.add("Raju");
       // System.out.println(stringJoiner);
        String str = stringJoiner.toString();
        System.out.println(str);
        char ch = str.charAt(3);
        int newLength;
        newLength = stringJoiner.length();
        System.out.println("Length" + newLength);
        System.out.println("Character at index 3" +ch);
        stringJoiner.add("Sorabh");
        System.out.println(stringJoiner);
        newLength = stringJoiner.length();
        System.out.println("Length" + newLength);

    }
}
