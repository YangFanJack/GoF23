package CreationalPatterns.bFactoryPattern;

public class CocaColaFactory implements ColaFactory{
    @Override
    public Cola produce() {
        return new CocaCola();
    }
}
