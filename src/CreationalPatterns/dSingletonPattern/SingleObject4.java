package CreationalPatterns.dSingletonPattern;

/**
 * 静态内部类式：和饿汉式的区别就是执行new语句的时机不同
 * 饿汉式new的时机：只要SingleObject类加载，就会new
 * 静态内部类new的时机：SingleObject类被加载后，还需要调用SingletonHolder类的INSTANCE静态变量才会执行new语句
 * 实现方式简单，且能达到DCL的效果，建议使用
 */
public class SingleObject4 {
    private static class SingletonHolder{
        private static final SingleObject4 INSTANCE = new SingleObject4();
    }

    private SingleObject4(){}

    public static final SingleObject4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
