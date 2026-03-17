public class SecondSmall {

    public static int secondSmallest(int[] arr){

    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for(int num : arr){

        if(num < first){
            second = first;
            first = num;
        }
        else if(num > first && num < second){
            second = num;
        }
    }

    return second;
}
    public static void main(String[] args) {
        int[] arr = {1,6,8,9,5};

        System.out.println(secondSmallest(arr));
    }
}
