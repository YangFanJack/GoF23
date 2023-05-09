package BehavioralPatterns.aVisitorPattern;

public class MainClass {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
