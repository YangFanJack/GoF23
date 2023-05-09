package CreationalPatterns.dSingletonPattern;

/**
 * 以懒汉式为基础的DCL双重检查锁
 * 实现较为复杂，不建议使用
 */
public class SingleObject3 {
    private static SingleObject3 instance;
    private SingleObject3(){}
    public static SingleObject3 getInstance(){
        if (instance == null){
            synchronized (SingleObject3.class){
                if (instance == null){
                    instance = new SingleObject3();
                }
            }
        }
        return instance;
    }
}
