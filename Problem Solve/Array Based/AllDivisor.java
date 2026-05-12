import java.util.*;

public class AllDivisor {
    public List<Integer> Divisor(int n) {

        List<Integer> res = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AllDivisor ad = new AllDivisor();
        int n=54;

        List<Integer> res = ad.Divisor(n);

        System.out.print("Divisor of "+ n + " : ");
        
        for(int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


// for(int i=1; i<=n; i++) {
//             if(n%i==0) {
//                 System.out.println(i+" ");
//             }
//         }
//         return n;