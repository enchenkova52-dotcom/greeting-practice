public class Car {

    class Engine {
        public int horsepower = 150;
        protected int cylinders = 4;
        int rpm = 6000;
        private int serialNumber = 12345;

        public void start() {
            System.out.println("Engine started");
        }

        protected void stop() {
            System.out.println("Engine stopped");
        }

        void warmUp() {
            System.out.println("Engine warming up");
        }

        private void checkOil() {
            System.out.println("Oil level OK");
        }
    }

    public void inspectEngine() {
        Engine engine = new Engine();

        System.out.println("Horsepower: " + engine.horsepower);
        System.out.println("Cylinders: " + engine.cylinders);
        System.out.println("RPM: " + engine.rpm);
        engine.start();
        engine.stop();
        engine.warmUp();

        // System.out.println("Serial: " + engine.serialNumber);
        // engine.checkOil();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.inspectEngine();
    }
}