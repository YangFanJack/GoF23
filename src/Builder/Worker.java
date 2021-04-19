package Builder;

public class Worker implements Builder{

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("A");
        System.out.println("A");
    }

    @Override
    public void buildB() {
        product.setBuildB("B");
        System.out.println("B");
    }

    @Override
    public void buildC() {
        product.setBuildC("C");
        System.out.println("C");
    }

    @Override
    public void buildD() {
        product.setBuildD("D");
        System.out.println("D");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
