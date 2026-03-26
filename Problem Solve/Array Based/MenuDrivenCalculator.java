public class MenuDrivenCalculator {
    public static void main(StringMethods[] args) {
        int a = 10;
        int b = 20;
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(b / a);
                break;
        
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
