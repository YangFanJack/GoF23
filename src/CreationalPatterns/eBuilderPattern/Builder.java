package CreationalPatterns.eBuilderPattern;

public interface Builder {
    public void buildA();
    public void buildB();
    public void buildC();
    public void buildD();
    public Product getProduct();
}
