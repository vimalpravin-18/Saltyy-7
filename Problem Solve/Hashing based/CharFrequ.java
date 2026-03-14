import java.util.HashMap;

public class CharFrequ {
    public static void main(String[] args) {

        String s = "Banana";

        HashMap<Character, Integer> set = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(set.containsKey(c)) {
                set.put(c, set.getOrDefault(c,0) + 1);
            } else {
                set.put(c, 1);
            }
        }
        System.out.println(set);
    }
}