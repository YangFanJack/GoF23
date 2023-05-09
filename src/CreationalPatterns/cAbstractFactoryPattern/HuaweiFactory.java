package CreationalPatterns.cAbstractFactoryPattern;

public class HuaweiFactory implements Factory{

    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public PC producePC() {
        return new HuaweiPC();
    }
}
