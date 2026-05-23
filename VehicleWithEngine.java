interface Vehicle {
    
    void move();
    
    class Engine {
        private String type;
        
        public Engine(String type) {
            this.type = type;
        }
        
        public void start() {
            System.out.println("Engine " + type + " started");
        }
        
        public void stop() {
            System.out.println("Engine " + type + " stopped");
        }
    }
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

public class VehicleWithEngine {
    public static void main(String[] args) {
        Vehicle.Engine engine = new Vehicle.Engine("V8");
        engine.start();
        engine.stop();
        
        Car car = new Car();
        car.move();
    }
}