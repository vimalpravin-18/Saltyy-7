import java.util.Arrays;

public class StrrLength {
    public static void main(String[] args) {
        String s = "Vimal Pravin";
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            count++;
        }
        System.out.print(count);
 


        // for(char c : s.toCharArray()) {
        //     count++;
        // }
        //     System.out.println(count);
   }
}
