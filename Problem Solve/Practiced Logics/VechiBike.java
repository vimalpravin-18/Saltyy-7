class VechiBike extends Vechicle {
    
    boolean hasHelmet;

    VechiBike(int speed , String brand , boolean hasHelmet){
        super(speed, brand);
        this.hasHelmet = hasHelmet;
    }

    @Override    
    void start() {
        System.out.println("Bike is Starting ..");
    }

    void Wheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
}
