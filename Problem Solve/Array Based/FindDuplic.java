public class FindDuplic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
                     26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                     41,42,43,44,45,46,47,48,49,
                     50,50};

        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate Number : " + duplicate);
    }

    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        int duplicate = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
        }
        return duplicate;
    }
}
