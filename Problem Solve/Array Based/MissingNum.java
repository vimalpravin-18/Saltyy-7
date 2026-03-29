public class MissingNum {
    public static void main(String[] args) {

        int [] arr ={1,2,4,5};
        int  n = 5;

        // int n = arr.length + 1; // Total number of elements including the missing one
        // int sum = n * (n + 1) / 2; // Sum of first n natural numbers

        // int arrSum = 0;
        // for(int num : arr) {    
        //     arrSum += num;
        // }
        // System.out.println("Missing Number: " + (sum - arrSum));

        // --------------------------------------------


        // Using XOR method 

        int xor1 = 0;
        for(int i=0; i<=n; i++) {
            xor1 ^= i;
        }

        int xor2 = 0;
        for(int num : arr) {
            xor2 ^= num;
        }

        int missing = xor1 ^ xor2;
        System.out.println("Missing Number: " + missing);

    }
}
