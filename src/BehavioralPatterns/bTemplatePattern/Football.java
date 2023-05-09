package BehavioralPatterns.bTemplatePattern;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Football started!");
    }

    @Override
    void endPlay() {
        System.out.println("Football finished!");
    }
}
