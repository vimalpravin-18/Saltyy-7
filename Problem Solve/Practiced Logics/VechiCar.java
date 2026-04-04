class VechiCar extends Vechicle {

    int numberOfDoors;

    VechiCar(int speed , String brand , int numberOfDoors){
        super(speed, brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void start() {
        System.out.println("Car is Starting ..");
    }

    void playMusic() {
        System.out.println("Car is playing music!");
    }
    
}
