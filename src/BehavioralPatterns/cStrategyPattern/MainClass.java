package BehavioralPatterns.cStrategyPattern;

public class MainClass {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(100, 5));
        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(100, 5));
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(100, 5));


    }
}
