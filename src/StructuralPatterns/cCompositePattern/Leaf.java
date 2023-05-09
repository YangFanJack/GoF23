package StructuralPatterns.cCompositePattern;

public class Leaf extends Component{

    Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int num) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void operation() {
        System.out.println("Leaf: "+name+" is visited!");
    }
}
