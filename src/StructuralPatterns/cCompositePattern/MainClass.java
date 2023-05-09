package StructuralPatterns.cCompositePattern;

public class MainClass {
    public static void main(String[] args) {
        Component composite = new Composite("class 1 Composite");
        composite.add(new Leaf("redLeaf"));
        composite.add(new Leaf("greenLeaf"));
        composite.add(new Leaf("blueLeaf"));
        Leaf grayLeaf = new Leaf("grayLeaf");
        composite.add(grayLeaf);
        composite.operation();
        composite.remove(grayLeaf);
        composite.operation();

        Component son_component = new Composite("class 2 composite");
        son_component.add(new Leaf("yellowLeaf"));
        son_component.add(new Leaf("orangeLeaf"));
        son_component.add(new Leaf("purpleLeaf"));
        composite.add(son_component);
        composite.operation();
    }
}
