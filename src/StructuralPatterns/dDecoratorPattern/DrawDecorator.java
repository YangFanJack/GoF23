package StructuralPatterns.dDecoratorPattern;

public abstract class DrawDecorator implements Draw{

    protected final Draw decoratedDraw;

    DrawDecorator(Draw decoratedDraw){
        this.decoratedDraw = decoratedDraw;
    }

    @Override
    public void draw() {
        decoratedDraw.draw();
    }
}
