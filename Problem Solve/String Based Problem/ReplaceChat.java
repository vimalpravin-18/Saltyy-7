public class ReplaceChat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Banana");

        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'a') {
                sb.setCharAt(i, 'o');
            }
        }
        System.out.println(sb);
    } 
}
