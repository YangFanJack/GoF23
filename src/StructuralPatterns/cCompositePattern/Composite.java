package StructuralPatterns.cCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private final List<Component> children = new ArrayList<>();

    Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int num) {
        return children.get(num);
    }

    @Override
    public void operation() {
        System.out.println("**************BEGIN****************");
        System.out.println("This is: "+name);
        for (Component c : children){
            c.operation();
        }
        System.out.println("**************END******************");
    }
}
