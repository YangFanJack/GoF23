package FactoryPlusPlus.implProducts;

import FactoryPlusPlus.Phone;

public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("HuaWeiPhone");
    }
}
