public class Palindrome {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,7,89,9,2};
        boolean isPalindrome = true;
        
        int i = 0;
        int j = arr.length -1;

        while(i < j) {
            if(arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
