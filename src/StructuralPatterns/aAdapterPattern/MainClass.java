package StructuralPatterns.aAdapterPattern;

public class MainClass {
    public static void main(String[] args) {
        Adaptor adaptor = new AdaptorImpl(new Adaptee());
        Computer computer = new Computer();
        computer.net(adaptor);
    }
}
