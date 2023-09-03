package Easy;

public class Q0014LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"cir", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
//        String lCP = strs[0] ;
//        for (String w: strs) {
//            String a = "";
//            if (lCP.length() >= w.length()){
//                for (int i = 0; i <w.length() ; i++) {
//                    if(lCP.charAt(i) == w.charAt(i)) a = a + lCP.charAt(i);
//                    else break;
//                }
//            }else {
//                for (int i = 0; i <lCP.length() ; i++) {
//                    if(lCP.charAt(i) == w.charAt(i)) a = a + lCP.charAt(i);
//                    else break;
//                }
//            }
//            lCP = a;
//        }
//        return lCP;
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
