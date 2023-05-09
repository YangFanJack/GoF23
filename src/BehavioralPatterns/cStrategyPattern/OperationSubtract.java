package BehavioralPatterns.cStrategyPattern;

public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("do subtract calculate");
        return num1 - num2;
    }
}
