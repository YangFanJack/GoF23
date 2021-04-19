package FactoryPlusPlus.implProducts;

import FactoryPlusPlus.Phone;

public class XiaoMiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("XiaoMiPhone");
    }
}
