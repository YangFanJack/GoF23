package Adaptor;

public class AdaptorImpl implements Adaptor {

    private Adaptee adaptee;

    public AdaptorImpl(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
