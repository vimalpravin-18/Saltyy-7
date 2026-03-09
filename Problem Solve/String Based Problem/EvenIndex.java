public class EvenIndex {
    public static void main(String[] args) {
        String s = "Program";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(i%2 == 0) {
                System.out.print(ch);
            } else {
                System.out.print(" ");
            }
        }
    }   
}

//  p o r m