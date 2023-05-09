package CreationalPatterns.aSimpleFactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        switch (shapeType){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
