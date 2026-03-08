import java.util.Arrays;

public class VowelStart {
    public static void main(String[] args) {
        String s = "Bpple";
        char c = s.charAt(0);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U'
            ) {
                System.out.println("Starts with vowels");
            } else {
                System.out.println("Not starts with vowels");
            }
        }
    }