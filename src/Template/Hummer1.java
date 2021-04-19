package Template;

public class Hummer1 extends HummerModel{
    @Override
    public void start() {
        System.out.println("悍马1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马1刹车");
    }

    @Override
    public void alarm() {
        System.out.println("悍马1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马1轰油");
    }
}
