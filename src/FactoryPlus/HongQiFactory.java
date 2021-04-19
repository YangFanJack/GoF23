package FactoryPlus;

public class HongQiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new HongQi();
    }
}
