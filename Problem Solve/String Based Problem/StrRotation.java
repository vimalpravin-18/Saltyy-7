public class StrRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        String temp = s1 + s1;

        if(temp.contains(s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("No Rotation");
        }
     }
}

// Rotation  -- > abcdabcd contains -> cdab, so rotation valid .