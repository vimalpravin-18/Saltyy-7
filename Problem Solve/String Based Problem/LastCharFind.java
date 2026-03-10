public class LastCharFind {
    public static void main(String[] args) {
        String s = "Coding";
        char c = 'a';

        char ch = s.charAt(s.length()-1);

        if(ch == c) {
            System.out.println("Yes , it is "+ c);
        } else {
            System.out.println("NO");
        }
        }
}
