public class LastChar {
    public static void main(String[] args) {
        String s = "probably";
        char cn = ' ';
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(s.length()-1);
            cn = ch;
        }
        System.out.println(cn);
    }   
}
