package StructuralPatterns.fFlyweightPattern;


public class LocknLockCup implements Cup{

    private Integer volume;
    private Double price;
    private String color;
    private String type;

    LocknLockCup(Integer volume, Double price, String color){
        this.volume = volume;
        this.price = price;
        this.color = color;
    }

    LocknLockCup(String type){
        this.type = type;
    }

    LocknLockCup(){}

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void drink() {
        System.out.println("I am drinking water using "+color+" color "+volume+" ml LocknLock's Cup+" +
                "("+type+")," +
                " and its price is ￥"+price);
    }
}
