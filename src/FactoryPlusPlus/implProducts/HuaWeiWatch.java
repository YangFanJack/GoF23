package FactoryPlusPlus.implProducts;

import FactoryPlusPlus.Watch;

public class HuaWeiWatch implements Watch {
    @Override
    public void ring() {
        System.out.println("HuaWeiWatch");
    }
}
