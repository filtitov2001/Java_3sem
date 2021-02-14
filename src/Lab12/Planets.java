package Lab12;

public enum Planets {

    Mercury(3.33e28, 2_439.7e3),
    Venus(4.8675e24, 6_051.8e3),
    Earth(5.97e24, 6_371e3),
    Mars(6.4171e23, 3_389.5e3),
    Jupyter(1.8986e27, 69_911e3),
    Saturn(5.6846e26, 58_232e3),
    Uranus(8.6813e25, 25_362e3),
    Neptune(1.0243e26, 24_622e3);



    static final double G = 6.67e-11;
    private double mass, rad;

    public double getRad() {
        return rad;
    }

    public double getMass() {
        return mass;
    }

    Planets (double M, double R)
    {
        mass = M;
        rad = R;
    }

    public double getGravity(){
        return G * mass * mass / (rad * rad);
    }
}