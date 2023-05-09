package StructuralPatterns.cCompositePattern;

public abstract class Component {

    String name;

    Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int num);
    public abstract void operation();
}
