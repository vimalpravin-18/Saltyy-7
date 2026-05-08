import java.util.*;

public class LeadersArray {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];

        // last element is always leader
        leaders.add(maxFromRight);

        // traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        // reverse to maintain original order
        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}
