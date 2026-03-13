public class ReverseString {
    public static void main(String[] args) {
        String str = "Pravin";
        String reversed  = " ";
        StringBuilder sb = new StringBuilder(str);

        if(str.contains(sb)) {
            reversed = sb.reverse().toString();
        }
        System.out.println(reversed);
    }
}
