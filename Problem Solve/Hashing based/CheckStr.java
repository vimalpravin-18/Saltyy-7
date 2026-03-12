import java.util.HashSet;

public class CheckStr {
    public static void main(String[] args) {
        String s = "javav";

        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray()) {
            if(set.contains(c)){
                System.out.println("Duplicate : "+c);
            } else {
                set.add(c);
            }
        }
    }
}
