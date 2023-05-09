package CreationalPatterns.cAbstractFactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        Factory huaweiFactory = new HuaweiFactory();
        Factory xiaomiFactory = new XiaomiFactory();
        PC huaweiPC = huaweiFactory.producePC();
        Phone huaweiPhone = huaweiFactory.producePhone();
        PC xiaomiPC = xiaomiFactory.producePC();
        Phone xiaomiPhone = xiaomiFactory.producePhone();
        huaweiPC.playing();
        huaweiPhone.calling();
        xiaomiPC.playing();
        xiaomiPhone.calling();

    }
}
