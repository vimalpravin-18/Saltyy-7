public class S {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(i==0 || j==0 && i!=4 && i!=5 && i!=6||  i==3 || j==6 && i!=0 && i!=1 && i!=2 && i!=3 || i==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
