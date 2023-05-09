package StructuralPatterns.eFacadePattern;

public class MainClass {
    public static void main(String[] args) {
        FruitMaker fruitMaker = new FruitMaker();
        fruitMaker.eatGrape();
        fruitMaker.eatApple();
        fruitMaker.eatPear();
    }
}
