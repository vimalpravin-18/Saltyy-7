public class palindrome {
    public static void main(String[] args) {
        String s = "MAdam";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--) {
            rev = rev + s.toLowerCase().charAt(i);
        }

        if(s.toLowerCase().equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }   
}
