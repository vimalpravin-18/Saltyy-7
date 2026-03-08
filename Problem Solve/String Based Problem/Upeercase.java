public class Upeercase {
    public static void main(String[] args) {
        String s ="Vimal Pravin";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch-32);
            }
            System.out.print(ch);
        }
    }
}
