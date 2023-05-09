package BehavioralPatterns.cStrategyPattern;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("do multiply calculate");
        return num1 * num2;
    }
}
