package CreationalPatterns.dSingletonPattern;

/**
 * 懒汉式
 * 线程不安全的懒汉式不建议使用
 */
public class SingleObject2 {

    private static SingleObject2 instance;

    private SingleObject2(){}

    public static synchronized SingleObject2 getInstance(){//线程安全
//    public static SingleObject2 getInstance(){//线程不安全
        if (instance == null){
            instance = new SingleObject2();
        }
        return instance;
    }

}
