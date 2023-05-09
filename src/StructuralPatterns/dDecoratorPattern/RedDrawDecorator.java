package StructuralPatterns.dDecoratorPattern;

public class RedDrawDecorator extends DrawDecorator{
    RedDrawDecorator(Draw decoratedDraw) {
        super(decoratedDraw);
    }

    @Override
    public void draw() {
        decoratedDraw.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("this draw's border is red color!");
    }
}
