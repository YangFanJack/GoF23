package FactoryPlus;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new HongQiFactory();
        System.out.println(carFactory.getCar());
        carFactory = new WuLingFactory();
        System.out.println(carFactory.getCar());
    }
}
