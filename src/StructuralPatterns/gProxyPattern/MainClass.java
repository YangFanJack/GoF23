package StructuralPatterns.gProxyPattern;

public class MainClass {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("hello.txt");
        proxyImage.display();
    }
}
