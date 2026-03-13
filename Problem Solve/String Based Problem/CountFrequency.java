import java.lang.annotation.Target;

public class CountFrequency {
    public static void main(String[] args) {
        String var = "Java is a programming language";
        char target = 'g';
        int count = 0;

        for(int i=0; i<var.length(); i++) {
            if(var.charAt(i) == (target)) {
                count++;
            }
        }
        System.out.println();
}}
