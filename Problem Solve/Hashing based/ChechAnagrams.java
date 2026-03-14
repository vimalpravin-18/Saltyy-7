import java.util.HashMap;

public class ChechAnagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "ilent";

        HashMap<Character, Integer> set = new HashMap<>();

        for(char c : s1.toCharArray()) {
            set.put(c, set.getOrDefault(c, 0)+1);
        }

        for(char c : s2.toCharArray()) {
            set.put(c, set.get(c)-1);
        }

        boolean isAnagram = true;

        for(int values : set.values()) {
            if(values != 0) {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a anagram");
        }
    }
}
