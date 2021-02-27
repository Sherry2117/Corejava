package Misc;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner("|", "", "");
        //passing comma(,) and square brackets as deliminator

        joinNames.add("2021-02-20");
        joinNames.add("C");
        joinNames.add("ONLINE");
        joinNames.add("1000");
        joinNames.add("100");
        System.out.println(joinNames);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[").append("Sherry").append(",").append("Husna").append("aaa").append("]");
        System.out.println(stringBuilder);

        //Merge two string Joiner

    }
}
