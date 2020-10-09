public class ShapeFactory {
    public Shape getShape(String st) {
        if ("ok".equals(st)) {
            return new Circle();
        } else if ("oki".equals(st)) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
