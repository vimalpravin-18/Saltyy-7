import java.io.CharArrayReader;
import java.util.HashSet;


public class CountUniqu {
    public static void main(String[] args) {
        String s = "Programming";

        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            set.add(c);

        }
        System.out.println("unique characters "+ set.size());
    }
}
