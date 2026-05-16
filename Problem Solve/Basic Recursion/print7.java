import java.util.*;

class print {
    public void reverseArray(List<Integer> arr) {
        
        Collections.reverse(arr);
    }
}

public class print7 {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        
        print obj = new print();

        obj.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
