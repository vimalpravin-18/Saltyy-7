public class VechicleMain {
    public static void main(String[] args) {
        
        VechiCar car = new VechiCar(120, "Toyota", 4);
        car.start();
        car.displayInfo();
        car.playMusic();
        car.stop();

        System.out.println();

        VechiBike bike = new VechiBike(80, "Honda", true);
        bike.start();
        bike.displayInfo();
        bike.Wheelie();
        bike.stop();
    }
}
