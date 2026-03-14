import java.util.HashMap;

public class NonRepeat {
    public static void main(String[] args) {
        String s= "PRopagate";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : s.toLowerCase().toCharArray()) {
            if(map.get(c) == 1) {
                System.out.println("First Non-Repeating character is : "+c);
                break;
            }
        }
    }
}
