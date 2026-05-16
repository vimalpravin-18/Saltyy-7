public class print9 {
    public static void main(String[] args) {
        int n =0;

        if(n==0) {
            System.out.println("0");
        }

        // else if(n==1) {
        //     System.out.println("0 1");
        // }

        // else {
        //     int[] fib = new int[n+1];
        //     fib[0] = 0;
        //     fib[1] = 1;

        //     for(int i=2; i<=n; i++) {
        //         fib[i] = fib[i-1] + fib[i-2];
        //     }

        //     for(int num : fib) {
        //         System.out.print(num+" ");
        //     }
        // }

    else {
        int last = 1;
        int secLast = 0;

        System.out.print(secLast + " " + last + " ");

        int cur;
        for(int i=2; i<=n; i++) {
            cur = last + secLast;
            secLast = last;
            last = cur;
            System.out.print(cur+" ");
        }
    }

    }
}
