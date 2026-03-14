public class MisingNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int n=6;

        int expectval = n*( n + 1 ) / 2;
        int actualVal = 0;

        for(int i=0; i<arr.length; i++) {
            actualVal += arr[i];
        }
        System.out.print("Missing number : "+ (expectval - actualVal));
        
    }
}