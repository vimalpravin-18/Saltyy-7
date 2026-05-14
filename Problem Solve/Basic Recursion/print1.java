public class print1{
    static void Num(int i, int n) {

        // Base Condition 
        if(i>n) {
            return;
        }

        // Printing
        System.out.println(i);

        // Recursive function , it executes until the base conditon fails
        Num(i+1, n);
    }

    public static void main(String[] args) {

        // int n=5;
        Num(1,5);
    }
}