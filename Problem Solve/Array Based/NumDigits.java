public class NumDigits {
    public static int NumDigit(int n) {

        // int count=0; 
        // count = (int) (Math.log10(n) + 1 );              ---- > Optimal approach

        // return count;

        int count=0;

        while(n>0) {   // ------ > Brute force approach 
                                //   O(log10 N + 1)
            count++;
            n = n/10;
            
        }

        return count;
    }

    public static void main(String[] args) {
        int N =7587522;
        System.out.println(NumDigit(N));
    }
}
