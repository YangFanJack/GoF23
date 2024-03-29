package StructuralPatterns.aAdapterPattern;

public class AdaptorImpl implements Adaptor {

    private final Adaptee adaptee;

    public AdaptorImpl(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
