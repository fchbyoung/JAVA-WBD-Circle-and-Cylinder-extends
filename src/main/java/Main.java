public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "White");
        String str1 = circle.toString();
        System.out.println(str1);
        System.out.println("Area = " + circle.getArea());

        System.out.println("------------------------------");

        Cylinder cylinder = new Cylinder(5, "Black", 10);
        String str2 = cylinder.toString();
        System.out.println(str2);
        System.out.println("Area = " + cylinder.getArea());
        System.out.println("Volumetric = " + cylinder.getVolumetric());

    }
}
