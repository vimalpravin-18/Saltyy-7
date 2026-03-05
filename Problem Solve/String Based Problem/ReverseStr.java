public class ReverseStr {
    public static void main(String[] args) {
        String val = "Hello";

        for(int i=val.length()-1; i>=0; i--) {
            System.out.print(val.charAt(i));
        }
    }
}

// olleH