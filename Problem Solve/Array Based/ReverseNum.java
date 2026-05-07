public class ReverseNum {

    public static int revverse(int n) {
        int rev = 0;
        while(n>0) {
            
            int temp = n%10;
            rev = rev * 10 + temp;
            n = n/10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int n=75864;

        System.out.println(revverse(n));
    }
}
