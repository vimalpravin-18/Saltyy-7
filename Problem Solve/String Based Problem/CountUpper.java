import java.util.Arrays;

public class CountUpper {
    public static void main(String[] args) {
        String s = "ViMaAL PrAvVIN";
        int count = 0;

        for(int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
