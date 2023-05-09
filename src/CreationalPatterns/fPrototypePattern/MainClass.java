package CreationalPatterns.fPrototypePattern;

public class MainClass {
    public static void main(String[] args){
        ProtoType protoType = new ProtoType();
        protoType.setA("hello,world!");
        protoType.setB(911);
        ProtoType clone = protoType.clone();
        System.out.println(clone.getA());
        System.out.println(clone.getB());
    }
}