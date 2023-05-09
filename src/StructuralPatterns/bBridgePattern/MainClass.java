package StructuralPatterns.bBridgePattern;

public class MainClass {
    public static void main(String[] args) {
        RefinedAbstraction refinedAbstractionA = new RefinedAbstraction(new ConcreteImplementorA());
        refinedAbstractionA.operation();
        RefinedAbstraction refinedAbstractionB = new RefinedAbstraction(new ConcreteImplementorB());
        refinedAbstractionB.operation();
    }
}
