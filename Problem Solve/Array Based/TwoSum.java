import java.util.HashSet;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        // int[] arr = {2,3,4,5,6,7,8};
        // int target = 15;
        // boolean b = false;

        // HashSet<Integer> set = new HashSet<>();

        // for(int num : arr) {
        //     int complement = target - num;
        //     if(set.contains(complement)) {               
        //         b = true;
        //         System.out.println(complement + " + " + num + " = " + target);
        //         return;
        //     }
        //     set.add(num);                            ---- >> using Hashset() to find the complement 
        // }                                                      of the current number in the array.

        // if(!b) {
        //     System.out.println("Number Not Match");
        // }


        int[] arr = {3,4,5,6,7,8,9,2};
        int target = 15;
        boolean b = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            int complement = target - num ;
            if(map.containsKey(complement)) {
                b = true;
                System.out.println(complement + " + " + num + " = " + target);
            }
            map.put(num, complement);                //   ---- >> using HashMap() to store the current number 
        }                                            //                   as key and its complement as value.                  

        if(!b) {
            System.out.println("Number Not Match");
        }

    }
}
