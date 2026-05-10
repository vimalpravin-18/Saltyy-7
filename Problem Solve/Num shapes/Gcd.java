public class Gcd {
    public static int GcdNum(int n1, int n2) {

    //     while(n1 > 0 && n2 > 0) {

    //         if(n1 > n2) {
    //             n1 = n1 % n2;
    //         }
                                                // ----- > Optimal approach
    //         else {                                       
    //             n2 = n2 % n1;
    //         }
    //     }
    //     if(n1 == 0) {
    //             return n2;
    //         } 
    //     return n1;

            for(int i=Math.min(n1, n2); i > 0; i--) {

                if(n1 % i == 0 && n2 % i == 0) {                 //  --- > Better approach 
                    return i;                                          // time O(min(n1, n2))
                }
            }
            return 1;
        }
    public static void main(String[] args) {
        int n1 = 8, n2 = 12;

        int sol = GcdNum(n1, n2);
        System.out.println(sol);
    }

}