import java.util.*;

class print8 {
    public static Boolean print(String s, int i) {

        if(i>= s.length()/2) {
        return true;
        }
        
        if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(s.length()-i-1)) {
            return false ;
        }

        return print(s, i+1);
    }

    public static void main(String[] args) {
        String s = "Abba";
        System.out.println(print(s, 0));

    }
}