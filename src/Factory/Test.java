package Factory;

public class Test {
    public static void main(String[] args) {
        Car hongQi = CarFactory.getCar("HongQi");
        hongQi.name();
    }
}
