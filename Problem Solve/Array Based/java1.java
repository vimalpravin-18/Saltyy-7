public class java1 {
    public int forLoop(int low, int high) {
    int num = 0;
        for(int i=low; i<=high; i++) {
            num = num + i;
        } 
        return num;
    }

    public static void main(String[] args) {
        java1 obj = new java1();
        int res = obj.forLoop(3, 7);
        System.out.println(res);
    }
}