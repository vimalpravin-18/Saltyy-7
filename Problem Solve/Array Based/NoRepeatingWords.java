public class NoRepeatingWords {
    public static void main(String[] args) {
        String s = "Programming";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            boolean unique = true;

            for(int j=0; j<s.length(); i++) {
                if(i !=j && ch == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
        }
        if(unique) {
            System.out.println(ch);
            break;
    }
}
