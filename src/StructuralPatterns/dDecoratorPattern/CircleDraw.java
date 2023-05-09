package StructuralPatterns.dDecoratorPattern;

public class CircleDraw implements Draw{
    @Override
    public void draw() {
        System.out.println("I am drawing a circle draw!");
    }
}
