public class DigitCheck {
    public static void main(String[] args) {
        String s = "32*&1566#3";
        boolean digits = true;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9') {
                digits = false;
                break;
            }
        }
        if(digits) {
                System.out.println("Only digits");
            } else {
                System.out.println("Not Only digits");
            }
    }
}
