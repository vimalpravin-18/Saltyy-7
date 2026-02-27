public class J {
    public static void main(String[] args) {
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                if(i==0 || j==3 && i!=6 || i!=5 && j==0 && j==1 || i!=5 && j==1 && j==2 || i==6 && j==2 || i==6 && j==1|| i==5 && j==0 || j==0 && i==4){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
