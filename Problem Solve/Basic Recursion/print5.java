public class print5 {
    static int print( int n) {

        // base condition
        if(n == 0) {
            return 0;
        }

        // recusrive function statement 
        return n + print(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = print(n);
        System.out.println(ans);
    }
}
