package CreationalPatterns.bFactoryPattern;

public class PepsiColaFactory implements ColaFactory{
    @Override
    public Cola produce() {
        return new PepsiCola();
    }
}
