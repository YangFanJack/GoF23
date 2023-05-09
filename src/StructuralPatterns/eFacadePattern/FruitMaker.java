package StructuralPatterns.eFacadePattern;

import sun.management.counter.perf.PerfByteArrayCounter;

public class FruitMaker{
    private final Apple apple;
    private final Grape grape;
    private final Pear pear;

    FruitMaker(){
        apple = new Apple();
        grape = new Grape();
        pear = new Pear();
    }

    public void eatApple(){
        apple.eat();
    }

    public void eatGrape(){
        grape.eat();
    }

    public void eatPear(){
        pear.eat();
    }
}
