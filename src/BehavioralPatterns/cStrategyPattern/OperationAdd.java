package BehavioralPatterns.cStrategyPattern;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println("do add calculate");
        return num1 + num2;
    }
}
