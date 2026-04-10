public class BuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,5,6};

        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr){
        int   minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int num : arr) {
             if(num < minPrice) {
                minPrice = num;
             } else if (num - minPrice > maxProfit) {
                maxProfit = num - minPrice;
             }
        }
        return maxProfit;
    }
}