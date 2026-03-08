public class FirstRepeating {
    public static void main(String[] args) {
        String s = "Programming";

        for(int i=1; i<=s.length(); i++) {
            for(int j=i+1; i<=s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
}

//  r