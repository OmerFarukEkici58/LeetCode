public class Deneme {
    public static void main(String[] args) {
        int x = 121;
        StringBuilder xNormal = new StringBuilder(String.valueOf(x));
        StringBuilder xReversed = new StringBuilder(String.valueOf(x));
        System.out.println(xNormal.equals(xReversed.reverse()));//1.ifade = false
        System.out.println(xNormal.toString().equals(xReversed.reverse().toString()));//2.ifade = true
    }
}
