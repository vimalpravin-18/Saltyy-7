public class D {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<8; j++) {
                if(j==0 || i==0 && j!=5 && j!=6 && j!=7 ||
                     j==7 && i==2 && i==3 && i==4 || i==6 && j!=6 && j!=7 && j!=5|| i==1 && j==6 || 
                     i==5 && j==6 || j==7 && i!=0 && i!=1 && i!=5 && i!=6 || i==6 && j!=5 && j!=6 && j!=7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
