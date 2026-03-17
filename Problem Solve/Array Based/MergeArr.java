public class MergeArr {

    public static int[] mergeArrays(int[] arr1, int[] arr2){

    int[] result = new int[arr1.length + arr2.length];

    int i = 0;

    for(int num : arr1){
        result[i++] = num;
    }

    for(int num : arr2){
        result[i++] = num;
    }

    return result;
}
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,6,7,4,5};
        int[] arr2 = {2,5,6,7,9,2,4};

        System.out.println(mergeArrays(arr1, arr2));
    }
}