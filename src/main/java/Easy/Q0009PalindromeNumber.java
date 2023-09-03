package Easy;

import java.util.Scanner;

public class Q0009PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int x) {
//        if (x<0) return false;
//        StringBuilder xNormal = new StringBuilder(String.valueOf(x));
//        StringBuilder xReversed = new StringBuilder(String.valueOf(x));
//        return xNormal.toString().equals(xReversed.reverse().toString());
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversedInt = 0;
        while (x > reversedInt) {
            int pop = x % 10;
            x /= 10;

            reversedInt = (reversedInt * 10) + pop;
        }
        if (x == reversedInt || x == reversedInt / 10) return true;
        else return false;
    }
}

