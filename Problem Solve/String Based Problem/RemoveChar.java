public class RemoveChar {
    public static void main(String[] args) {
        String s = "Banana";
        char remove = 'a';

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != remove) {
                System.out.print(ch);
            } else {
                System.out.print("");
            }
        }
    }
}
