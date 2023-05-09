package StructuralPatterns.dDecoratorPattern;

public class MainClass {
    public static void main(String[] args) {
        RedDrawDecorator redCircleDraw = new RedDrawDecorator(new CircleDraw());
        redCircleDraw.draw();
        RedDrawDecorator redRecDraw = new RedDrawDecorator(new RectangleDraw());
        redRecDraw.draw();
    }
}
