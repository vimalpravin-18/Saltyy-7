public class M {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(j==0 || j==6 || j==1 && i==1 || j==2 && i==2 || j==3 && i==3 || j==4 && i==2 || j==5 && i==1 || j==6 && i==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
