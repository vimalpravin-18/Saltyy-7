import java.util.HashSet;

public class TwoCommon {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {5,2,3};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1) {
            set.add(num);
        }

        for(int num : arr2) {
            if(set.contains(num)) {
                System.out.println("Common element exists : "+ num);
                break;
            }
        }

    }
}
