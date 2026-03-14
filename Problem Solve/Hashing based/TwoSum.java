import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            int complement = target - num;

            if(set.contains(complement)) {
                System.out.println(complement + " + "+ num + " = "+ target);
                return;
            }
            set.add(num);
        }
     }
}
