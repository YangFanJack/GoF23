package FactoryPlusPlus.implFactory;

import FactoryPlusPlus.Factory;
import FactoryPlusPlus.Phone;
import FactoryPlusPlus.Tv;
import FactoryPlusPlus.Watch;
import FactoryPlusPlus.implProducts.XiaoMiPhone;
import FactoryPlusPlus.implProducts.XiaoMiTv;
import FactoryPlusPlus.implProducts.XiaoMiWatch;

public class XiaoMiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Tv createTv() {
        return new XiaoMiTv();
    }

    @Override
    public Watch createWatch() {
        return new XiaoMiWatch();
    }
}
