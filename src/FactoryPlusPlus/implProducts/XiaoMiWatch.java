package FactoryPlusPlus.implProducts;

import FactoryPlusPlus.Watch;

public class XiaoMiWatch implements Watch {
    @Override
    public void ring() {
        System.out.println("XiaoMiWatch");
    }
}
