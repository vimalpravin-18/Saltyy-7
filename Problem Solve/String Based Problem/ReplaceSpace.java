public class ReplaceSpace {
    public static void main(String[] args) {
        String s = "Java is a programming language";
        boolean space = true;

        for(int i=0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            if(ch == ' ') {
                System.out.print("-");
            } else {
                System.out.print(ch);
            }
        }
    }
}
