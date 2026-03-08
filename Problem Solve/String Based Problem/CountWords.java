public class CountWords {
    public static void main(String[] args) {
        String s = "Python is a programming language in the Coding side";
        int count = 1;

        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i) == ' ' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
