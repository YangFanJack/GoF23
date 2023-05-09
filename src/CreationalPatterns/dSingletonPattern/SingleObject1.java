package CreationalPatterns.dSingletonPattern;

/**
 * 饿汉式：
 * 对于无需高效率的程序建议使用
 */
public class SingleObject1 {

    //基于classloader避免了多线程的安全问题
    private static SingleObject1 instance = new SingleObject1();

    private SingleObject1(){}

    public static SingleObject1 getInstance(){
        return instance;
    }
}
