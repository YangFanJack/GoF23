package CreationalPatterns.aSimpleFactoryPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I draw a rectangle!");
    }
}
