public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println(sb);
        sb.insert(4, "Vimalnull");
        System.out.println(sb);
        sb.delete(3, 5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));

        
    }
}