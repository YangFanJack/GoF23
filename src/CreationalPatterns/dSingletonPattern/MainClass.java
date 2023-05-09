package CreationalPatterns.dSingletonPattern;

public class MainClass {
    public static void main(String[] args) {
        SingleObject1 instance = SingleObject1.getInstance();
        SingleObject1 instance1 = SingleObject1.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
