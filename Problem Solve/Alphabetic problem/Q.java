public class Q {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(i==0 && j!=0 && j!=1 && j!=5 && j!=6 || i==6 && j!=0 && j!=1 && j!=5 && j!=6 || i==1 && j==1 || i==1 && j==5 || i==5 && j==1 || i==5&& j==5 || j==0 && i!=0 && i!=1 && i!=5 && i!=6 || j==6 && i!=0 && i!=1 && i!=5 && i!=6 || i==3 && j==3 || i==4 && j==4 || i==6 && j==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}
