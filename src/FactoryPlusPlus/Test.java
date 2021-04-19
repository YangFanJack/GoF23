package FactoryPlusPlus;

import FactoryPlusPlus.implFactory.HuaWeiFactory;
import FactoryPlusPlus.implFactory.XiaoMiFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new XiaoMiFactory();
        factory.createPhone().call();
        factory.createTv().watch();
        factory.createWatch().ring();

        factory = new HuaWeiFactory();
        factory.createPhone().call();
        factory.createTv().watch();
        factory.createWatch().ring();
    }
}
