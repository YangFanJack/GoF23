package FactoryPlusPlus.implProducts;

import FactoryPlusPlus.Tv;

public class HuaWeiTv implements Tv {
    @Override
    public void watch() {
        System.out.println("HuaWeiTv");
    }
}
