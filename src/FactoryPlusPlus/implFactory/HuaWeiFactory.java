package FactoryPlusPlus.implFactory;

import FactoryPlusPlus.Factory;
import FactoryPlusPlus.Phone;
import FactoryPlusPlus.Tv;
import FactoryPlusPlus.Watch;
import FactoryPlusPlus.implProducts.HuaWeiPhone;
import FactoryPlusPlus.implProducts.HuaWeiTv;
import FactoryPlusPlus.implProducts.HuaWeiWatch;

public class HuaWeiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Tv createTv() {
        return new HuaWeiTv();
    }

    @Override
    public Watch createWatch() {
        return new HuaWeiWatch();
    }
}
