public class palindrome {
    public static void palin(int n) {

        int revNum = 0;
        int dup = n;

        while (n > 0) {
            int digit = n % 10;
            revNum = (revNum * 10 )+ digit;
            n = n / 10;
        }

        if(dup == revNum) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        int n = 45666544;
        palin(n);
    }
}