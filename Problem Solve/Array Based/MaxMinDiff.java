public class MaxMinDiff {
    public static int difference(int[] arr){

    int max = arr[0];
    int min = arr[0];

    for(int num : arr){

        if(num > max){
            max = num;
        }

        if(num < min){
            min = num;
        }
    }

    return max - min;
}

    public static void main(String[] args) {
        int[] arr = {2,4,3,4,5,6};
        System.out.println(difference(arr));
    }
}
