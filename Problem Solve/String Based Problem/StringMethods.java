public class StringMethods {
    
    public static void main(String[] args) {
        String Text = "Java Programming";

        String a = "World";
        String b = "World";
        String c = new String("World");

        System.out.println(Text.length());
        System.out.println(Text.charAt(6));
        System.out.println(Text.equals("Java Programming"));
        System.out.println(Text.toLowerCase());
        System.out.println(Text.toUpperCase());
        System.out.println(Text.substring(0,4));
        System.out.println(Text.contains("Java"));
        System.out.println(Text.trim());
        System.out.println(Text.equalsIgnoreCase(Text));

System.out.println("Comparison Methods");
        System.out.println(c==b);  // == comapares the memory Interface
        System.out.println(c.equals(b)); // .equals compares the exact content
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(b.equals(c));

        String name = "Vimal";

        for(int i=0; i<=name.length(); i++) {
            System.out.println(name.charAt(4));
            break;
        }
    }
}
