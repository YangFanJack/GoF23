package BehavioralPatterns.aVisitorPattern;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart c : parts){
            c.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
