import java.util.HashMap;

public class FirstUniqInd {

    public static int FirstUniqInd(String s) {
        HashMap<Character, Integer> set = new HashMap<>();

        for(char c : s.toCharArray()) {
            set.put(c, set.getOrDefault(c, 0) +1);
        }

        for(int i=0; i<s.length(); i++) {
            if(set.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        System.out.println(FirstUniqInd("vimal"));
    }   
}
