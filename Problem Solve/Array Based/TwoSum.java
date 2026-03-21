import java.util.HashSet;;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int target = 16;
        boolean b = false;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            int complement = target - num;
            if(set.contains(complement)) {
                b = true;
                System.out.println(complement + " + " + num + " = " + target);
                return;
            }
            set.add(num);
        }

        if(!b) {
            System.out.println("Number Not Match");
        }
    }
}
