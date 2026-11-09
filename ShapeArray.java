public class ShapeArray {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(4.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(5.0, 9.0);

        Shape[] shapeArray = {sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println("------------------------------");
        }
    }
}
