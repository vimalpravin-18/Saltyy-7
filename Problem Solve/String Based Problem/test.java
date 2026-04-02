abstract class Vehicle {
    abstract void fuel();
}
    class fuel extends Vehicle {
        void fuel() {
            System.out.println("Vechicle needs fuel");
        }
    }

    class Bike extends fuel {
        void fuel() {
            System.out.println("Bike also needs fuel");
        }
    }

    class start extends Bike {
        void fuel() {
            System.out.println("Vechicle needs to start");
        }
    }
    public class test {
        public static void main(String[] args) {
            Vehicle v = new start();
            Vehicle v2 = new Bike();
            v.fuel();
            v2.fuel();
        }
    }