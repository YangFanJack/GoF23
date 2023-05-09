package StructuralPatterns.fFlyweightPattern;

import java.util.HashMap;
import java.util.Objects;

public class CupFactory {
    private static final HashMap<String, Cup> map = new HashMap<>();

    public static Cup getCup(String type, Class<? extends Cup> cupClass) throws InstantiationException, IllegalAccessException {
        Cup cup = map.get(type);
        if (Objects.isNull(cup)){
            cup = (Cup)cupClass.newInstance();
            map.put(type, cup);
        }
        return cup;
    }

}
