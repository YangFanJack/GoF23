package CreationalPatterns.bFactoryPattern;

public class PepsiCola implements Cola{
    @Override
    public void drinks() {
        System.out.println("I drink Pepsi！");
    }
}
