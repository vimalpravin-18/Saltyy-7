public class U {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(j==0 && i!=5 && i!=6|| j==1 && i==5 || i==6 && j!=0 && j!=1 && j!=5 && j!=6 || j==5 && i==5 || j==6 && i!=5 && i!=6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
