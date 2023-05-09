package CreationalPatterns.cAbstractFactoryPattern;

public class HuaweiPhone implements Phone{
    @Override
    public void calling() {
        System.out.println("Calling on HuaweiPhone!");
    }
}
