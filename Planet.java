public enum Planet {
    MERCURY(3.30e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.97e24, 6.37e6),
    MARS(6.42e23, 3.40e6),
    JUPITER(1.90e27, 6.99e7),
    SATURN(5.68e26, 5.82e7),
    URANUS(8.68e25, 2.54e7),
    NEPTUNE(1.02e26, 2.46e7);
    
    private final double mass;
    private final double radius;
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    public double getSurfaceGravity() {
        double G = 6.67430e-11;
        return G * mass / (radius * radius);
    }
    
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("%s: гравитация = %.2f м/с²%n", p, p.getSurfaceGravity());
        }
    }
}