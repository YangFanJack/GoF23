package StructuralPatterns.dDecoratorPattern;

public class RectangleDraw implements Draw{
    @Override
    public void draw() {
        System.out.println("I am drawing a rectangle draw!");
    }
}
