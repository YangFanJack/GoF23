package CreationalPatterns.dSingletonPattern;

/**
 * 枚举方式：这是实现单例模式的最简单方式
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化，是Effective Java作者Josh Bloch推荐的单例模式实现方式
 * 需要反序列化创建对象时，建议使用
 */
public enum SingleObject5 {
    INSTANCE;
    public void whateverMethod(){

    }

}
