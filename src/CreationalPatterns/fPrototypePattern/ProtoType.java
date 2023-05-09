package CreationalPatterns.fPrototypePattern;

public class ProtoType implements Cloneable{
    private String a;
    private Integer b;

    public ProtoType clone(){
        ProtoType protoType = null;
        try {
            protoType = (ProtoType) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return protoType;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
