package CreationalPatterns.bFactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        ColaFactory pepsiColaFactory = new PepsiColaFactory();
        ColaFactory CocaColaFactory = new CocaColaFactory();
        Cola pepsiCola = pepsiColaFactory.produce();
        Cola cocaCola = CocaColaFactory.produce();
        pepsiCola.drinks();
        cocaCola.drinks();
    }
}
