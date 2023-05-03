import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String left = strs[0];
        String right = strs[strs.length-1];
        int i = 0;
        while (i < left.length() && i < right.length()) {
            if(left.charAt(i) == right.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return strs[0].substring(i);

    }
}