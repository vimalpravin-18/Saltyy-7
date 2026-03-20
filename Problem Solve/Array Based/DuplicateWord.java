public class DuplicateWord {
    public static void main(String[] args) {
        String s ="Programming";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(result.indexOf(s.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}