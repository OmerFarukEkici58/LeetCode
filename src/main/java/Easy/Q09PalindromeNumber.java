package Easy;

import java.util.Scanner;

public class Q09PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        StringBuilder xNormal = new StringBuilder(String.valueOf(x));
        StringBuilder xReversed = new StringBuilder(String.valueOf(x));
        return xNormal.toString().equals(xReversed.reverse().toString());
        }
    }

