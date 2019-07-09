public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + this.height);
    }
    public double getVolumetric() {
        return this.height * Math.PI * super.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{Radius = " + super.getRadius() + ", Color: " + super.getColor() + ", Height = " + this.height + "}";
    }
}
