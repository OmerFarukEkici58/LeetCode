package Easy;

import java.util.ArrayList;

public class Q13RomanToIntegerEasy {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(RomanToInteger(s));

    }

    public static int RomanToInteger(String s) {
        int sum = 0;
        while (!s.isEmpty())
            if (s.contains("IV")) {
                s = s.replaceFirst("IV", "");
                sum += 4;
            } else if (s.contains("IX")) {
                s = s.replaceFirst("IX", "");
                sum += 9;
            } else if (s.contains("XL")) {
                s = s.replaceFirst("XL", "");
                sum += 40;
            } else if (s.contains("XC")) {
                s = s.replaceFirst("XC", "");
                sum += 90;
            } else if (s.contains("CD")) {
                s = s.replaceFirst("CD", "");
                sum += 400;
            } else if (s.contains("CM")) {
                s = s.replaceFirst("CM", "");
                sum += 900;
            } else if (s.contains("I")) {
                s = s.replaceFirst("I", "");
                sum += 1;
            } else if (s.contains("V")) {
                s = s.replaceFirst("V", "");
                sum += 5;
            } else if (s.contains("X")) {
                s = s.replaceFirst("X", "");
                sum += 10;
            } else if (s.contains("L")) {
                s = s.replaceFirst("L", "");
                sum += 50;
            } else if (s.contains("C")) {
                s = s.replaceFirst("C", "");
                sum += 100;
            } else if (s.contains("D")) {
                s = s.replaceFirst("D", "");
                sum += 500;
            } else if (s.contains("M")) {
                s = s.replaceFirst("M", "");
                sum += 1000;
            }
        return sum;
    }
}
