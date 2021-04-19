package Prototype;



public class Test {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        Prototype clone = prototype.clone();
        System.out.println(prototype);
        System.out.println(clone);

        String a = new String("hello");
        String b = a;
        System.out.println(a == b);
    }
}
