public class ReverseFirst {
    public static void main(String[] args) {
        String s = "Hello World";
        int spaceIndex = s.indexOf(" ");
            
            for(int i1 = spaceIndex-1; i1>=0; i1--) {
                System.out.print(s.charAt(i1));
            }

            for(int i=spaceIndex; i<s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }

    //  olleH World