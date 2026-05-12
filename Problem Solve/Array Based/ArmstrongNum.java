public class ArmstrongNum {
    public static boolean Armstrong(int n) {

        int len = String.valueOf(n).length();
        int num = n;
        int sum =0;

        while(num>0) {
                int id = num % 10;
                sum += Math.pow(id, len);                      //  Time complexity -- > O(log10N + 1)
                num = num/10;
            }
            return sum == n;
        }
        
        public static void main(String[] args) {

            int num = 153;
            if(Armstrong(num)) {
                System.out.println("It is Armstrong Number");
            }
             else {
                System.out.println("Not an Armstrong number");
             }
        }
    }
