package StructuralPatterns.aAdapterPattern;

public class Computer {
    public void net(Adaptor adaptor){
        adaptor.handleRequest();
    }
}
