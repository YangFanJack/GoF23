package BehavioralPatterns.hIteratorPattern;

public class MainClass {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator it = nameRepository.getIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
