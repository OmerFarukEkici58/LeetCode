package Easy;

public class Q0013RomanToIntegerEasy {
    public static void main(String[] args) {
        String s = "LIVI";
        System.out.println(RomanToInteger(s));

    }

    private static int translate(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X' :
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }

    public static int RomanToInteger(String s) {
//        int sum = 0;
//        while (!s.isEmpty())
//            if (s.contains("IV")) {
//                s = s.replaceFirst("IV", "");
//                sum += 4;
//            } else if (s.contains("IX")) {
//                s = s.replaceFirst("IX", "");
//                sum += 9;
//            } else if (s.contains("XL")) {
//                s = s.replaceFirst("XL", "");
//                sum += 40;
//            } else if (s.contains("XC")) {
//                s = s.replaceFirst("XC", "");
//                sum += 90;
//            } else if (s.contains("CD")) {
//                s = s.replaceFirst("CD", "");
//                sum += 400;
//            } else if (s.contains("CM")) {
//                s = s.replaceFirst("CM", "");
//                sum += 900;
//            } else if (s.contains("I")) {
//                s = s.replaceFirst("I", "");
//                sum += 1;
//            } else if (s.contains("V")) {
//                s = s.replaceFirst("V", "");
//                sum += 5;
//            } else if (s.contains("X")) {
//                s = s.replaceFirst("X", "");
//                sum += 10;
//            } else if (s.contains("L")) {
//                s = s.replaceFirst("L", "");
//                sum += 50;
//            } else if (s.contains("C")) {
//                s = s.replaceFirst("C", "");
//                sum += 100;
//            } else if (s.contains("D")) {
//                s = s.replaceFirst("D", "");
//                sum += 500;
//            } else if (s.contains("M")) {
//                s = s.replaceFirst("M", "");
//                sum += 1000;
//            }
//        return sum;
        int sum = 0;
        int cur = translate(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            if (cur < next) sum -= cur;
            else sum += cur;
            cur = next;
        }
        sum += cur;
        return sum;
    }
}
