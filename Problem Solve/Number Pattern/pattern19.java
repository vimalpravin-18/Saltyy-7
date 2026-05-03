public class pattern19 {
    public void pattern(int n) {

        // upper triangle

        for(int i=n; i>=1; i--) {

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for(int sp=0; sp<=2*(n-i-1)+1; sp++) {
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

public void pattern2(int n) {

    for(int i=1; i<=n; i++) {

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        for(int sp=2*(n-i-1)+1; sp>=0; sp--){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}


    public static void main(String[] args) {
        pattern19 pt = new pattern19();
        pt.pattern(5);
        pt.pattern2(5);
    }
}


// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********