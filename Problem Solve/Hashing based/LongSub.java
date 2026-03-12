import java.util.HashSet;

public class LongSub {
    public static void main(String[] args) {
        String s = "abcabcab";

        int start = 0;
        int maxlength = 0;
        HashSet<Character> set = new HashSet<>();
 
        for(int end=0; end < s.length(); end++) {
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxlength = Math.max(maxlength, end - start + 1);
        }
        System.out.println(maxlength+" "+ set);
    }
}
