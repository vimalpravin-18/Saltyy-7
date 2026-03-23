public class SecLarge {
    public static void main(String[] args) {
        int[] arr = {342,42,424,42,53,35,98};

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > max) {            /// 342 > -2147483648
                secMax = max;       /// secMax = -2147483648
                max = num;              /// max = 342
            } else if(num > secMax && num != max) {         /// 42 > -2147483648 && 42 != 342  
                secMax = num;                               
            }
        }
        System.out.println("Second largest number is: " + secMax);
    }
}
