package StructuralPatterns.fFlyweightPattern;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Cup cup1 = CupFactory.getCup("type-1", LocknLockCup.class);
        Cup cup2 = CupFactory.getCup("type-2", LocknLockCup.class);
        Cup cup3 = CupFactory.getCup("type-3", LocknLockCup.class);
        System.out.println(cup1.hashCode());
        System.out.println(cup2.hashCode());
        System.out.println(cup3.hashCode());
        Cup cup1_again = CupFactory.getCup("type-1", LocknLockCup.class);
        System.out.println(cup1_again.hashCode());


    }
}
