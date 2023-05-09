package CreationalPatterns.eBuilderPattern;

public class MainClass {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
