public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is powerful language";

        for(int i=0; i<s.length(); i++) {
            s.split(" ");
            for(int j=s.length()-1; i>=0; i--) {
                System.out.print(j);
            }
        }
    }
}
