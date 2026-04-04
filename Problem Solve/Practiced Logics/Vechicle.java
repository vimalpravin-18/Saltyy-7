public class Vechicle {

    private String brand;
    private int speed;

    Vechicle(int speed , String brand) {
        this.brand = brand;
        this.speed= speed;
    }

    void start() {
        System.out.println("Vechicle is Starting ..");
    }

    void stop() {
        System.out.println("Vechicle is Stopping ..");
    }

    void displayInfo() {
        System.out.println("Brand : "+ brand);
        System.out.println("Speed : "+ speed);
    }

}
