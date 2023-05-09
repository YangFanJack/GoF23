package CreationalPatterns.cAbstractFactoryPattern;

public class XiaomiFactory implements Factory{
    @Override
    public PC producePC() {
        return new XiaomiPC();
    }

    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }
}
