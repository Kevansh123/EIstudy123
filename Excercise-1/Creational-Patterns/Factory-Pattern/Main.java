public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Get and draw Circle
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        // Get and draw Rectangle
        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
