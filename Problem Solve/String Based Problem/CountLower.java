public class CountLower {
    public static void main(String[] args) {
        String s = "VimAl PravIN";
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
