package CreationalPatterns.eBuilderPattern;

public class Worker implements Builder{

    private Product product;

    public Worker(){
        this.product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("A");
        System.out.println("packing A...");
    }

    @Override
    public void buildB() {
        product.setBuildB("B");
        System.out.println("packing B...");
    }

    @Override
    public void buildC() {
        product.setBuildC("B");
        System.out.println("packing C...");
    }

    @Override
    public void buildD() {
        product.setBuildD("D");
        System.out.println("packing D...");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
